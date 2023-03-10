package 문자열자르기;

import java.util.Scanner;

// 시간을 입력 받음 : 23:30:59
// 시간을 입력 받음 : 11:3:1 => 오전 11시 03분 01초 로 출력
// 출력은 오후 11시 30분 59초로 출력
public class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력 : ");
        String times = sc.next();
        String[] splitTime = times.split(":");  // splitTime 문자열 배열 생성
        int hour = Integer.parseInt(splitTime[0]);    // 문자열을 정수로 변환
        int min = Integer.parseInt(splitTime[1]);
        int sec = Integer.parseInt(splitTime[2]);

        if(hour > 11) System.out.printf("오후%02d시 %02d분 %02d초\n", (hour - 12), min, sec)  ;
        else System.out.printf("오전 %02d시 %02d분 %02초\n" + hour, min, sec);
    }

}
