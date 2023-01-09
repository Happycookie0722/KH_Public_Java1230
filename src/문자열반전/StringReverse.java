package 문자열반전;

import java.util.Scanner;

// abcdefg  =>  gfedcba 로 출력되게 하기
// 입력받은 문자열을 역순으로 출력하기
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력 : ");
        String str = sc.next();


        int index = str.length();           // 방법 1.
            while(index > 0) {
                index--;
                System.out.print((char)(index));
            }


        /*

        for(int i = str.length()-1 ; i >= 0; i--) {     // 방법 2.
            System.out.print(str.charAt(index));
        }

         */

    }
}
