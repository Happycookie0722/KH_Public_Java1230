package 자동차만들기예제;

public class Bus extends Car {
    public Bus(String name) {
        this.name = name;
        max_speed = 150;
        fuelEff = 5; // 연비
        fuelTank = 100;
        seat = 20;
    }
}
