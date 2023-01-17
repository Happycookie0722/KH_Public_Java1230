package 에어컨만들기;
// 전원 : ON/OFF
// 온도 설정 기능
// 현재 온도 표시 기능
// Cooler ON/OFF
// Heater ON/OFF
// 바람세기 (1단/2단/3단)

import java.util.Calendar;
import java.util.Scanner;

public class AirCon {
    boolean isPower; // 전원 ON/OFF
    int setTemp; // 온도 설정
    int currTemp; // 현재 온도
    boolean isCooler; // 에어컨 ON/OFF
    boolean isHeater; // 히터 ON/OFF
    int windStep; // 1단, 2단, 3단

    AirCon() {  // 생성자 : 클래스가 객체화 될 때 자동으로 호출되고, 주 목적은 인스터스 필드 초기화가 목적
        final int[] monthTemp = {-5, 3, 8, 15, 20, 26, 32, 30, 24, 16, 8, 4};
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH); // month는 현재 몇 월인지 정보를 가져오는데 그 정보가 배열의 인덱스와 같음. index 0부터 시작
        currTemp = monthTemp[month];
        isPower = false; // 전원에 대한 인스턴스 필드는 OFF가 기본값
        setTemp = 18;
        isCooler = false;
        isHeater = false;
        windStep = 1;
    }
    // 에어컨 정보 출력 (온도 변화가 있을 때 출력)
    public void airConInfo() {
        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String[] windStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("====== 에어컨 정보 ======");
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재 온도 : " + currTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("히터 : " + heaterStr);
        System.out.println("쿨러 : " + coolerStr);
        System.out.println("바람세기 : " + windStr[windStep]);
    }
    // 에어컨 설정하기
    public void setAirConState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도가 " + currTemp + " 입니다.");
        System.out.println("온도를 설정하세요 : ");
        setTemp = sc.nextInt(); // 설정 온도를 입력 받아 인스턴스 필드에 저장
        System.out.println("설정 온도는 " + setTemp + " 입니다.");
        System.out.println("바람 세기를 설정하세요 [1] 1단 [2] 2단 [3] 3단 : ");
        windStep = sc.nextInt();
        if(currTemp > setTemp) {    // 현재는 더운 상태
            System.out.println("Cooler 가 동작 합니다.");
            isCooler = true;
            isHeater = false;
        } else if(currTemp < setTemp) {  // 현재는 추운 상태
            System.out.println("Heater 가 동작 합니다.");
            isHeater = true;
            isCooler = false;
        } else {
            isCooler = false;
            isHeater = false;
        }
    }
    // 전원 설정
    public void setPower(boolean power) {
        isPower = power;
    }
    public int getWindStep() {
        return windStep;
    }
    public boolean isHeater() {
        return isHeater;
    }
    public boolean isCooler() {
        return isCooler;
    }
    // 현재 온도 변경
    public void setSetCurrTemp(int n) {
        currTemp += n;
    }
    // 현재 온도 읽기
    public int getcurrTemp () {
        return currTemp;
    }
    // 설정 온도 읽기
    public int getSetTemp() {
        return setTemp;
    }
}
