package 소켓이미지전송서버;
import java.io.*;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 전송할 파일 선택
// 전송이 끝나면 완료 표시
// 클라이언트 연결 개수에 상관없이 모든 클라이언트에 전송하기
public class ImageSocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        int port = 0707;
        Scanner sc = new Scanner(System.in);
            serverSocket = new ServerSocket(8999);
            System.out.print("전송할 파일과 경로명 입력 : ");
            String path = sc.nextLine();
            FileInputStream fis = new FileInputStream(path);
            System.out.println("파일명 : " + path);
        try {
            serverSocket = new ServerSocket(port);
            while(true) {
                Socket socket = serverSocket.accept(); // IP와 Port를 연결
                System.out.print("클라이언트 IP : " + socket.getRemoteSocketAddress() + " 연결 성공");
                Thread imgTh = new ImgServerTh(socket, path);
                imgTh.start();
            }
        } catch (ConnectException e1) {
            System.out.println("연결에 실패했습니다.");
        } catch (IOException e2) {}

    }
}
class ImgServerTh extends Thread {
    Socket socket;
    String fileName;
    static List<Socket> sockets = new ArrayList<>(); // 클래스 소속의 리스트(클래스가 만들어질때 한번 생성)
    public ImgServerTh(Socket socket, String fileName) {
        this.socket = socket; // 클라이언트에 대한 소켓 식별자
        this.fileName = fileName; // 전송할 파일 이름을 키보드로부터 입력받아 매개변수로 전달
        sockets.add(socket); // 클래스 소속의 리스트에 생성된 소켓의 식별자를 추가 함
    }
    @Override
    public void run() {
        int leng;
        byte[] buffer = new byte[1024];
        try {
            FileInputStream fis = new FileInputStream(fileName);
            for(int i = 0; i < sockets.size(); i++) {
                OutputStream os = sockets.get(i).getOutputStream();
                while((leng = fis.read(buffer)) != -1) {
                    os.write(buffer, 0, leng);
                    os.flush();
                    os.close();
                    System.out.println(sockets.get(i).getRemoteSocketAddress() + " 에게 전송 완료.");
                }
            }
        } catch(IOException e) {}
    }

}
