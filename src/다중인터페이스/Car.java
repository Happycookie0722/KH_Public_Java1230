package 다중인터페이스;

public class Car {
    protected int speed; // 같은 패키지와 같은 부모, 자식 클래스 간에서만 접근이 가능.
    protected String color;
    protected String year;
    public Car() {
        this.speed = 150;
        this.color = "White";
        this.year = "2022";
    }
}
