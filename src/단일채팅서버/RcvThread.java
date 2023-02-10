package 단일채팅서버;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.SocketException;

// 수신 쓰레드 생성
public class RcvThread extends Thread {
    private final Socket socket;

    public RcvThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
//            InputStream is = socket.getInputStream();
//            DataInputStream buf = new DataInputStream(is);
            DataInputStream buf = new DataInputStream(socket.getInputStream()); // 위의 두 줄을 한 줄로 줄인 것
            // 바이트 상태의 스트림을 보조클래스 DataInputStream 가 자바의 데이터 타입으로 변환 할 수 있게 함.
            String rcvString;
            while(true) {
                rcvString = buf.readUTF(); // rcvString 에 바이트 상태의 스트림을 UTF 타입으로 변환시켜 넣는다.
                System.out.println("상대방 : " + rcvString);
            }
        } catch (SocketException e1) {
            System.out.println("상대방의 연결이 종료 되었습니다.");
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
