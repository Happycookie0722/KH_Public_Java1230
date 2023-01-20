package 자동차만들기예제;

import java.util.Scanner;

public class CarMain extends Car {
    public static void main(String[] args) {
        Car car = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("이동 지역 선택 [1] 부산 [2] 대전 [3] 강릉 [4] 광주 : ");
        int city = sc.nextInt();
        System.out.print("이동 할 승객 수 입력 : ");
        int passCnt = sc.nextInt();
        System.out.print("이동 할 차량 선택 [1] 스포츠카 [2] 승용차 [3] 버스 : ");
        int carSel = sc.nextInt();
        switch(carSel) {
            case 1: car = new SportsCar("스포츠카");
            case 2 : car = new Bus("버스");
            case 3 : car = new Sedan("세단");
        }
        car.getCost();
        car.getFuelCost();
        car.getTotalTime();

    }
}
