package 명함전송서버;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameCardServer {
    static List<NameCard> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        int port = 7777;
        ServerSocket serverSocket = new ServerSocket(port);
        Scanner sc = new Scanner(System.in);
        while(true) {
            Socket socket = serverSocket.accept(); // 클라이언트 연결 요청에 의한 대기
            System.out.println("클라이언트 IP : " + socket.getRemoteSocketAddress());
            System.out.print("명함을 전송하시겠습니까? Yes / No : ");
            String sel = sc.next();
            if(sel.equalsIgnoreCase("yes")) {
                OutputStream os = socket.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);
                oos.writeObject(writeNameCard());
                os.close();
                oos.close();
            }
        }
    }
    static List<NameCard> writeNameCard() {
        list.add(new NameCard("안유진", "010-1234-5678", "지구오락실", "anyj@gmail.com"));
        list.add(new NameCard("이영지", "010-1234-5678", "지구오락실", "lej@gmail.com"));
        list.add(new NameCard("이은지", "010-1234-5678", "지구오락실", "lyjj@gmail.com"));
        list.add(new NameCard("우영우", "010-1234-5678", "이상한변호사", "yyy@gmail.com"));
        list.add(new NameCard("정명석", "010-1234-5678", "이상한변호사", "jms@gmail.com"));
        list.add(new NameCard("이준호", "010-1234-5678", "이상한변호사", "ljh@gmail.com"));
        list.add(new NameCard("권민우", "010-1234-5678", "이상한변호사", "kmw@gmail.com"));
        list.add(new NameCard("나영석", "010-1234-5678", "지구오락실", "nys@gmail.com"));
        list.add(new NameCard("미미", "010-1234-5678", "지구오락실", "mimi@gmail.com"));
        list.add(new NameCard("임윤아", "010-1234-5678", "빅마우스", "yuna@gmail.com"));
        return list;
    }
}
