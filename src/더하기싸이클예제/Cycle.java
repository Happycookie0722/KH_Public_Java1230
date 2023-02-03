package 더하기싸이클예제;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        int num1 = num / 10;
        int num2 = num % 10;
        int rst;
        int cnt = 1;

        rst = num1 + num2;
        rst = (rst % 10) + (num2 * 10);
        while(true) {
            num1 = rst / 10;
            num2 = rst % 10;
            rst = num1 + num2;
            rst = (rst % 10) + (num2 * 10);
            cnt++;
            if(rst == num) break;
        }
        System.out.println(cnt);
    }
}
