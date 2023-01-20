package 다중인터페이스;

public interface AirCon {
    int MAX_TEMP = 30; //public final static 이 숨겨져 있음
    int MIN_TEMP = 0;
    void airConON(); // 자동으로 public abstract 가 추가 됨. 추상메소드
    void airConOFF();
    void setAirConTemp(int tmp);
}
