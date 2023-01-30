package 프로퍼티예제2;
import java.util.Properties;

public class AppProperties {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.setProperty("timeout", "30");
        properties.setProperty("language", "kr");
        properties.setProperty("size", "10");
        properties.setProperty("capacity", "10");

        Member member = new Member();
        member.getMemberProperties();

    }
}

class Member {
    public void getMemberProperties() {
        Properties properties = new Properties();
        System.out.println("timeout : " + properties.getProperty("timeout"));
        System.out.println("language : " + properties.getProperty("language"));
        System.out.println("size : " + properties.getProperty("size"));
        System.out.println("capacity : " + properties.getProperty("capacity"));
    }
}