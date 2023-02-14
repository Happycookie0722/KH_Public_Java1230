package 매개변수의다형성복습;

import java.util.Scanner;

// 상속관계를 이용해서 매개변수에 자식 타입의 객체를 사용하는 것
public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver("쿠키");
        Vehicle vehicle = new Vehicle();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        SportsCar sportsCar = new SportsCar();
        Scanner sc = new Scanner(System.in);
        System.out.println("운전하고 싶은 차량을 선택 [1] 버스 [2] 택시 [3] 스포츠카 : ");
        int sel = sc.nextInt();
        switch (sel) {
            case 1 : driver.drive(bus); break;
            case 2 : driver.drive(taxi); break;
            case 3 : driver.drive(sportsCar); break;
            case 4 : driver.drive(vehicle); break;
        }
    }
}

class Driver {
    String name;
    public Driver(String name) {
        this.name = name;
    }
    public void drive(Vehicle vehicle) {   // Vehicle 의 부모 클래스를 상속받은 자식 클래스를 불러올 수 있음
        System.out.print(name + "의 ");
        vehicle.run();
    }
}
class Vehicle {
    public void run() {
        System.out.println("차량이 달립니다.");
    }
}
class Bus extends Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
class Taxi extends Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}
class SportsCar extends Vehicle {
    @Override
    public void run() {
        System.out.println("스포츠카가 달립니다.");
    }
}