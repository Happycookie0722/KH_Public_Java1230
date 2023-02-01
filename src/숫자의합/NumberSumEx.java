package 숫자의합;

import java.util.Scanner;

// 문제 : N개의 숫자가 공백없이 쓰여 있음. 이 숫자를 모두 합해서 출력하는 문제
// 입력 : 54321
// 출력 : 15
// 입력 : 70000000000
// 출력 : 7
// 입력 : 5678
// 출력 : 26
// 입력 : 0000
// 프로그램 종료
public class NumberSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rst = 0;

        System.out.print("갯수 입력 : ");
        int n = sc.nextInt();
        System.out.print("숫자 입력 : ");
        String str = sc.next();

        while(true) {
            if (str.equals("0000")) break;
            for (int i = 0; i < n; i++) {
                rst += (str.charAt(i) - '0');
            }
            System.out.println(rst); break;
        }
    }
}
