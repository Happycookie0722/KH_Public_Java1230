package 요금제계산하기;

import java.util.Scanner;

// 영식 요금제 : 30초마다 10씩 청구 (30초 미만이면 1통, 30초 부터 2통)
// 민식 요금제 : 60초마다 15씩 청구 (60초 미만이면 1통, 60초 부터 2통)
// 통화 횟수 : 20회 미만
// 통화 시간 :
// 둘 중 싼 요금제의 이름을 표시하고 총 요금계산
// 총 통화 금액이 같으면 (영식/민식 요금제 : 총 통화 금액)
public class MobilePayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] time = new int[20];
        int yPayTotal = 0, mPayTotal = 0; //총 통화 요금을 위한 변수 생성

        System.out.print("통화 횟수 : ");
        int num = sc.nextInt();
        System.out.print("통화 시간 : ");
        for(int i = 0; i < num; i++) {
            time[i] = sc.nextInt();     // 통화 횟수만큼의 통화 시간을 입력 받음
        }
        for(int i = 0; i < num; i++) {
            yPayTotal += (time[i]/30) * 10 + 10;
            mPayTotal += (time[i]/60) * 15 + 15;
        }
        if(yPayTotal > mPayTotal) {
            System.out.println("영식 요금제 : " + yPayTotal);
        } else if(yPayTotal < mPayTotal) {
            System.out.println("민식 요금제 : " + mPayTotal);
        } else {
            System.out.println("영식/민식 요금제 : " + yPayTotal);
        }



    }
    /*
        int[] call = new int[20];
        int yPayTotal = 0, mPayTotal = 0;  //총 통화 요금을 위한 변수 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("통화 횟수 입력 : ");
        int cnt = sc.nextInt();
        System.out.print("통화 시간 입력 : ");
        for(int i = 0; i < cnt; i++) {
            call[i] = sc.nextInt();     // 통화 횟수만큼의 통화 시간을 입력 받음
        }
        for(int i = 0; i <cnt; i++) {
            yPayTotal += (call[i] / 30) * 10 + 10; // 30초 이하는 무조건 1통으로 쳐야하기 때문에
            mPayTotal += (call[i] / 60) * 15 + 15;
        }
        if(yPayTotal > mPayTotal) {
            System.out.println("민식 요금제 : " + mPayTotal);
        } else if (yPayTotal < mPayTotal) {

            System.out.println("영식 요금제 : " + yPayTotal);
        } else {
            System.out.println("영식/민식 요금제 : " + yPayTotal);
        }

         */
}
