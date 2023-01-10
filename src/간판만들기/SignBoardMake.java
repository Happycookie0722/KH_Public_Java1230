package 간판만들기;

import java.util.Scanner;

// 임의의 숫자를 입력받음 : 120
// 120에 대한 차지하는 공간을 계산
// 0은 4칸, 1은 2칸, 그 외의 숫자는 3칸
// 120 => 1 + 2 + 1 + 3 + 1 + 4 + 1
// 5611 = 1 + 3 + 1 + 3 + 1 + 2 + 1 + 2 + 1
// 0이 입력되기 전까지는 반복 수행해야 함
public class SignBoardMake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int str = 0;
        int num1 = 0;

        while(true) {
            System.out.print("숫자를 입력 : ");
            String in = sc.next();
            if(in == "0") break;
            char[] num = in.toCharArray();
            for(int i = 0; i < num.length; i++) {
                if(num[i] == '0') {
                    str = 5;
                } else if (num[i] == '1') {
                    str = 3;
                } else {
                    str = 4;
                }
                num1 = str + num1;
            }
            System.out.println(num1+1);
        }
    }
}
