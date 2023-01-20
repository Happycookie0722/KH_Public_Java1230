package 자동차만들기예제;

public class Sedan extends Car {
    public Sedan(String name) {
        this.name = name;
        max_speed = 200;
        fuelEff = 12; // 연비
        fuelTank = 45;
        seat = 4;
    }
}
