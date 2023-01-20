package 자동차만들기예제;

public class Car {
    int max_speed;
    int fuelEff;
    int fuelTank;
    int seat;
    String name;
    boolean isMode;
    int distance = 200;
    int totalCost = 1;


    int getCost() {
        return  distance / fuelEff * 2000;
    }
    int getFuelCost() {
       if((fuelEff * fuelTank) % distance < 0) {
           return  (fuelEff * fuelTank / distance) + 1;
       } else return  fuelEff * fuelTank / distance;
    }
    int getTotalTime() {
        return (distance / (totalCost * max_speed)) ;
    }
}
