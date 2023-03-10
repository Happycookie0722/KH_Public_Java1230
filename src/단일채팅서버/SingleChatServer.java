package 단일채팅서버;

import java.io.IOException;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;

public class SingleChatServer {
    public static void main(String[] args) throws IOException {
        int port = 1102;
        ServerSocket serverSocket = new ServerSocket(port); // IP에 대한 정보를 생략해도 가능하다.
        while(true) {
            Socket socket = serverSocket.accept();
            System.out.println("IP : " + socket.getInetAddress() + "와 연결되었습니다.");
            RcvThread rcvThread = new RcvThread(socket);
            rcvThread.start();
            SndThread sndThread = new SndThread(socket);
            sndThread.start();
        }
    }
}
