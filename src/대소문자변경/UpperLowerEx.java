package 대소문자변경;

import java.util.Scanner;

// 입력 받은 문자열에서 대문자는 소문자로 소문자는 대문자로 변경하기
// toUpperCase  =>  TOuPPERcASE 로 변경 되도록
// 문자열에서 특정 문자를 추출하는 방법은 charAt()
// 문자는 내부적으로 정수값으로 간주되어 사용된다.
// 값을 출력할 때 정수 값이 아닌 문자로 표현하기 위해서는 형변환이 필요
public class UpperLowerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.printf("문자를 입력 : ");
        String str = sc.next();
        int[] str1 = new int[str.length()];

        while(true) {
            for(int i = 0; i < str.length(); i++) {
                str1[i] = str.charAt(i);
                int str2 = (char)str1[i];
                if(str2 < 97) {
                    str1[i] = str2 + 32;
                    System.out.print((char)(str1[i]));
                } else {
                    str1[i] = str2 - 32;
                    System.out.print((char)(str1[i]));
                }
            } break;

        }

         /*

        System.out.print("문자열 입력 : ");
        String str = sc.next();
        char ch; // 문자열에 인덱스에 해당하는 문자를 담을 변수 생성
        for(int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // 문자열에 해당 인덱스 문자를 추출
            if(ch < 'a') System.out.print((char)(ch + ('a' - 'A')));
            else System.out.print((char)(ch - ('a' - 'A')));
        }

          */
    }
}
