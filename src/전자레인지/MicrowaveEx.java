package 전자레인지;

import java.util.Scanner;

// 3개의 시간조절용 버튼 A, B, C가 달려있음
// A 버튼은 5분, B 버튼은 1분, C 버튼은 10초 단위로 설정 가능
// 요리시간이 100초가 소요 된다면 B 버튼 1회, C 버튼 4회 ==> T = 014 로 출력
// 3개의 버튼으로 시간을 맞출 수 없는 경우 -1
public class MicrowaveEx {
    public static void main(String[] args) {
        int a, b, c, t;
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("요리 시간(초) : ");
        t = sc.nextInt();
        if(t % 10 != 0) System.out.println("-1");
        else {
            a = t / 300;
            b = t % 300 / 60;
            c = t % 300 % 60 / 10;
            System.out.printf("T = %d%d%d\n", a, b, c);
        }

        /*
        System.out.print("요리 시간 입력 : ");
        int in = sc.nextInt();

        a = in / 300;
        if (in / 300 < 0) temp = in;
        temp += in % 300;

        b = temp / 60;
        if(temp / 60 < 0 ) temp += 0;
        temp = temp % 60;

        c = temp / 10;
        if(temp / 10 < 0 ) temp += 0;

        if(in / 10 <= 0) System.out.print("T = -1");
        else System.out.print("T = " + a + b + c);

        */

    }
}
