package 예외처리예제3;

import java.util.Scanner;

// ArithmeticException : 나눗셈에서 값을 0으로 나누면 발생하는 에러
public class ExceptionEx3 {
    public static void main(String[] args) {
        int rst = 0;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("나눗셈 입력 : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            try {
                rst = a / b;
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
                continue;
            }
            System.out.println(rst);
            break;
        }
    }
}
