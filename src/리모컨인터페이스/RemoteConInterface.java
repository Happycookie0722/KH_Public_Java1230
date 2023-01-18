package 리모컨인터페이스;

import java.util.Scanner;

public class RemoteConInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("제품을 선택하세요 [1]TV [2]Audio : ");
        int sel = sc.nextInt();
        RemoteControl remoCon;
        if(sel == 1) {
            remoCon = new Television();
            remoCon.turnOn();
            remoCon.setVolume(20);
            remoCon.getInfo();
            RemoteControl.changeBattery();
            remoCon.setMute(true);
        } else {
            remoCon = new Audio();
            remoCon.turnOn();
            remoCon.setVolume(120);
            remoCon.getInfo();
        }
        RemoteControl rc = new RemoteControl() {
            int volume;

            @Override
            public void turnOn() {
                System.out.println("PlayStation5 을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("PlayStation5 을 끕니다.");
            }

            @Override
            public void setVolume(int volume) {

                if(volume > RemoteControl.MAX_Volume) {
                    this.volume = RemoteControl.MAX_Volume;
                } else if(volume < RemoteControl.MIN_Volume) {
                    this.volume = RemoteControl.MIN_Volume;
                } else {
                    this.volume = volume;
                }
                System.out.println("현재 Audio 볼륨 : " + this.volume);
            }

            @Override
            public void getInfo() {
                System.out.println("PlayStation5 입니다.");
                System.out.println("현재 PlayStation5 볼륨은 " + volume + " 입니다.");
            }
        };
        rc.turnOn();
        rc.setVolume(100);
        rc.getInfo();
    }

}
