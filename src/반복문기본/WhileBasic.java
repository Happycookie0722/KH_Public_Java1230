package 반복문기본;

import java.util.Scanner;

public class WhileBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        /*
        int sum = 0; // while 문으로 계산하기
        int number = sc.nextInt();
        while(number > 0) {
            sum += number; // sum 은 sum + number
            number--;
        }
        System.out.println("입력 받은 정수의 합은 : " + sum + " 입니다.");

        */

        int number = sc.nextInt(); // for 문으로 계산하기
        int sum = 0;
        for(int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("입력 받은 정수의 합은 : " + sum + " 입니다.");
    }
}
