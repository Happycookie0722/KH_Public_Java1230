package 네트워크인터페이스;
// 모든 필드는 자동으로 final static 으로 변환된다.
// 모든 메소드는 자동으로 추상 메소드가 된다. (abstract 가 자동으로 붙는다)
// 디폴트 메소드 : 예외적으로 구현부를 가지면, 상속 받은 클래스에서 재정의 해서 사용 가능
// 정적메소드 객체와 상관없이 인터페이스 타입으로 사용 가능
public interface NetworkAdapter {
    void connect(); // 자동으로 abstract 와 public 이 붙음
}
// implements 는 인터페이스를 상속 받는 예약어. 상속은 extends 인터페이스 상속은 implements
class WiFi implements NetworkAdapter {
    String company;
    WiFi(String company) {
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + " WiFi에 연결 되었습니다.");
    }
}
class FiveG implements NetworkAdapter {
    String company;
    FiveG(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " 5G에 연결되었습니다.");
    }
}
class LTE implements NetworkAdapter {
    String company;
    LTE(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " LTE에 연결되었습니다.");
    }
}