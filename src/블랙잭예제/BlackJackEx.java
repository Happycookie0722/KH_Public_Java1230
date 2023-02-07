package 블랙잭예제;

import java.util.Scanner;

public class BlackJackEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum, tmp = 0;

        System.out.print("카드의 갯수와 숫자 입력 : ");
        int inputNum = sc.nextInt(), BlackJack = sc.nextInt();
        System.out.print("숫자 입력 : ");
        int[] Card = new int[inputNum];
        for(int i = 0; i < Card.length; i++) Card[i] = sc.nextInt();
        for(int i = 0; i < Card.length; i++) {
            for(int j = i+1; j < Card.length; j++) {
                for(int q = j+1 ; q < Card.length; q++) {
                    sum = Card[i] + Card[j] + Card[q];
                    if(sum <= BlackJack && sum > tmp) {
                        tmp = sum;
                    }
                }
            }
         }
        System.out.println(tmp);
    }
}
