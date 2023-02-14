package 다중채팅서버;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiChatServer {
    public static void main(String[] args) throws IOException {
        int port = 0715;
        try {
            // 서버를 만들때는 두가지 정보가 필요 : IP와 port 번호
            ServerSocket serverSocket = new ServerSocket(port); // port 번호만 넣으면 서버 IP는 자동으로 지정됨(첫번째 IP가 자동등록)
                                                                // 컴퓨터에는 이더넷 카드를 여러개 장착할 수 있기 때문에 여러 IP를 할당 받을수 있음.
            while(true) {   // 서버는 반복문으로 수행하면서 클라이언트의 요청을 받는다.
                // 하나의 세션, 하나의 연결 통로를 생성한다.
                Socket socket = serverSocket.accept();
                Thread serverTh = new MultiChatThread(socket);
                serverTh.start();
            }
        } catch (IOException e) {}
    }
}
