package 리모컨인터페이스;
// 인터페이스 특징
// 모든 필드는 자동으로 상수(final static)로 변환된다.
// 모든 메소드는 자동으로 추상메소드(abstract)로 변경
// 디폴트 메소드는 구현부를 가지고 있으며, 상속 받은 클래스에서 재정의 가능
// 정적 메소드는 객체와 상관없이 인터페이스 타입으로 사용 가능
public interface RemoteControl {
    int MAX_Volume = 100; // 상수로 정의하지 않았지만 자동으로 상수로 변환된 상태. 객체로 만들어지지 않는다.
    int MIN_Volume = 0;
    void turnOn(); // 자동으로 추상 메소드로 변경됨
    void turnOff();
    void setVolume(int volume);
    void getInfo();
    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }
    default void setMute(boolean mute) {
        if(mute) System.out.println("무음 처리합니다.");
        else System.out.println("무음 처리를 해제합니다.");
    }


}
