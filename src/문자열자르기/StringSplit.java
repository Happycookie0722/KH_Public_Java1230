package 문자열자르기;

import java.util.Scanner;

// 시간을 입력 받음 : 23:30:59
// 시간을 입력 받음 : 11:3:1 => 오전 11시 03분 01초 로 출력
// 출력은 오후 11시 30분 59초로 출력
public class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        String num1 = in.split(":");
    }
}
