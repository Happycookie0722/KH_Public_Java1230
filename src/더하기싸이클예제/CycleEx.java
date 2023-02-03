package 더하기싸이클예제;

import java.util.Scanner;

public class CycleEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumNumber = 0;
        int newNumber = 0;
        int cnt = 0;
        System.out.print("입력 : ");
        int input = sc.nextInt();
        int num = input;
        while(true) {
            sumNumber = (num / 10) + (num % 10); // 2 + 6 = 8
            newNumber = ((num % 10) * 10) + (sumNumber % 10); // 80 +
            cnt++;
            if(newNumber == input) break;
            num = newNumber;
        }
        System.out.print(cnt);
    }
}
