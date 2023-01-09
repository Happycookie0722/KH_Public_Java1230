package 문자열추가하기;
// 2개의 문자열을 입력받고, 정수 n값을 입력받음
// 첫번째 문자열 입력 : seoul
// 두번째 문자열 입력 : korea
// 정수값 입력 : 2
// 첫번째 문자열의 뒷 부분의 n개의 문자를 두번째 문자열 앞에 끼워넣음

import java.util.Scanner;

public class StringAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("첫번째 문자열을 입력 : ");
        String str1 = sc.next();
        System.out.printf("두번째 문자열을 입력 : ");
        String str2 = sc.next();
        System.out.printf("정수값 입력 : ");
        int num = sc.nextInt();

        int pos = str1.length() - num;
        String sub = str1.substring(pos);
        System.out.print(sub + str2);



    }
}
