package 자동차만들기;

public class Bus extends Car{
    public Bus(String name) {
        this.name = name;
        maxSpeed = 150;
        fuelEff = 5; // 연비
        fuelTank = 100;
        seatCnt = 20;
    }
    @Override
    void setMods(boolean isMode) {
        if(isMode) fuelTank += 30;
    }
}
