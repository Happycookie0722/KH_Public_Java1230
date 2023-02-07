package 소수단어구하기예제;

import java.util.Scanner;

public class NumEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rst = 0;
        System.out.print("단어 입력 : ");
        String alpha = sc.next();
        char[] alphachar = alpha.toCharArray();
        int[] alphaNum = new int[alphachar.length];
        for(int i = 0; i < alphachar.length; i++) {
            if(alphachar[i] >= 97 && alphachar[i] <= 122) {
                alphaNum[i] = ((alphachar[i] - 48) - '0');
            } else alphaNum[i] = ((alphachar[i] - 16) - '0');
        }
        while(true) {
            for (int i = 0; i < alphachar.length; i++) {
                rst += alphaNum[i];
            }
            if (rst % 2 == 1) {
                System.out.println("소수입니다.");
                break;
            }
            else {
                System.out.println("소수가 아닙니다.");
                break;
            }
        }
    }
}
