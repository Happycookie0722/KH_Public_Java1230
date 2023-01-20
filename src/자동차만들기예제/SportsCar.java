package 자동차만들기예제;

public class SportsCar extends Car {
    public SportsCar(String name) {
        this.name = name;
        max_speed = 250;
        fuelEff = 8; // 연비
        fuelTank = 30;
        seat = 2;
    }
}
