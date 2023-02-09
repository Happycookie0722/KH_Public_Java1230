package 네트워크예제1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkEx {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress local = InetAddress.getLocalHost();
        System.out.println("내 컴퓨터의 IP 주소 : " + local.getHostAddress()); // ip 주소 보는법
        InetAddress[] remote = InetAddress.getAllByName("www.naver.com");
        for(InetAddress e : remote) System.out.println("네이버의 Ip 주소 : " + e.getHostAddress());
    }
}
