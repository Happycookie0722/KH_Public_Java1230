package 자동차만들기;

public class SportsCar extends Car {
    public SportsCar(String name) {
        this.name = name;
        maxSpeed = 250;
        fuelEff = 8; // 연비
        fuelTank = 30;
        seatCnt = 2;
    }

    @Override
    void setMods(boolean isMods) {
        if(isMods) maxSpeed *= 1.2;
    }
}
