package 손익분기점구하기;

import java.util.Scanner;

public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = (a + b);
        int result2 = c;
        int i = 1;
        if (b >= c) {
            System.out.println("-1"); return;
        }
        while(true) {
            result *= i;
            result2 *= i;
            if(result < result2) {
                System.out.println(i+1); break;
            }
            i++;
        }

        }
}
