package Math클래스;

import java.util.Random;

// Math : 수학에서 자주 사용하는 상수들과 메소드를 미리 구현해 놓은 클래스
// Math 클래스의 모든 메소드는 클래스 메소드(static method). 그러므로 객체 생성 불가
// java.lang 에 포함 된 클래스
public class MathClass {
    public static void main(String[] args) {
        // random() : 0.0 이상 1.0 미만의 범위에서 임의의 double 형 값 중 임의의 값 생성

        // 방법 1. 0 ~ 99 사이에 임의의 수 생성
        System.out.println((int)(Math.random() * 100));
        for(int i = 0; i < 100; i++) {
            System.out.println((int)(Math.random() * 100));
        }
        // 방법 2. Random 을 클래스로 사용
        Random ran = new Random();
        System.out.println(ran.nextInt(100));


        // abs() : 절대값을 구하는 메소드. 입력이 음수이면 양수로, 양수이면 양수

        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(-3.14));

        // floor() : 소수점 이하를 없앤 정수값 출력
        // ceil() : 소수점이 있으면 무조건 올림
        // round() : 반올림
        System.out.println(Math.floor(10.9999));
        System.out.println(Math.floor(10.00001));

        System.out.println(Math.ceil(10.9999));
        System.out.println(Math.ceil(10.00001));

        System.out.println(Math.round(10.9999));
        System.out.println(Math.round(10.00001));

        // min() : 전달된 두 값 중 작은 값 출력
        // max() : 전달된 두 값 중 큰 값 출력
        System.out.println(Math.max(10, 4));
        System.out.println(Math.min(10, 4));
    }

}
