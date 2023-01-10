package 가장큰수출력;

import java.util.Scanner;

// 세자리 정수를 입력받아 가장 큰 수 출력
public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int number = sc.nextInt();

        int a, b, c;
        a = number / 100;
        b = (number % 100)/10;
        c = number % 10;

        if (a > b){
            System.out.println(Math.max(a,c));
        } else {
            System.out.println(Math.max(b,c));
        }


    }
}
