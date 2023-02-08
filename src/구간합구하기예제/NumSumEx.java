package 구간합구하기예제;

import java.util.Scanner;

public class NumSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수의 개수와 횟수 입력 : ");
        int N = sc.nextInt(), M = sc.nextInt();
        int[] NArr = new int[N];
        int j = 0;
        for (int i = 0; i < N; i++) {
            NArr[i] = (N + j);
            j--;
        }
        int sum = 0;
        int isExit = M;
        while(isExit != 0) {
            System.out.print("조건 입력 : ");
            int q = sc.nextInt(), w = sc.nextInt();
            for (int i = q - 1; i < w; i++) {
                sum += NArr[i];
            }
            System.out.println("합 : " + sum);
            sum = 0;
            isExit--;
        }
    }
}
