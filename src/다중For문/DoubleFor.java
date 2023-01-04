package 다중For문;

import java.util.Scanner;

public class DoubleFor {
    public static void main(String[] args) {

        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");

        int number = sc.nextInt();
        for(int i = 0; i < number; i++) {
            for(int j = 0; j < number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for(int i = 2; i < 10; i++) {       // 구구단 찍기 예제
            for(int j = 1; j < 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
            System.out.println();
        }

        */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
