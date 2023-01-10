package 표준입출력3;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체를 생성.
        byte a = sc.nextByte(); // 키보드로 입력 받은 결과를 Byte 자료형으로 반환.
        short b = sc.nextShort(); // 키보드로 입력 받은 결과를 Short 자료형으로 반환.
        int c = sc.nextInt(); // 키보드로 입력 받은 결과를 Int 정수형으로 반환.
        long d = sc.nextLong(); //키보드로 입력 받은 결과를 Long 자료형으로 반환.
        char ch = sc.next().charAt(0); // 문자열에서 첫번째 문자를 추출해서 반환. (index 값으로 첫번째는 0)

        String s1 = sc.next(); // 문자열을 공백 기준으로 입력 받음. Ex) 부산시 진구 를 입력하면 부산시까지만 입력 받음.
        String s2 = sc.nextLine(); // 공백은 상관하지 않고, 줄바꿈까지(엔터키 누르기 전까지) 입력 받음.
    }
}
