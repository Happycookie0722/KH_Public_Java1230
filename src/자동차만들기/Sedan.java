package 자동차만들기;

public class Sedan extends Car {
    public Sedan(String name) {
        this.name = name;
        maxSpeed = 200;
        fuelEff = 12; // 연비
        fuelTank = 45;
        seatCnt = 4;
    }
    @Override
    void setMods(boolean isMode) {
        if(isMode) seatCnt += 1;
    }

}
