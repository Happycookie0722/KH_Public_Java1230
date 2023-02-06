package 람다예제1;

// 함수형 프로그램 : 순수함수, 불변성, 조건문과 반복문 사용 금지, 1급 객체(객체를 매개변수로 전달 가능)
// 람다 표현식 : 화살표 -> 기호를 사용하여 람다 표현식 작성
// - 매개변수의 타입을 추론할 수 있으면 생략한다.
// - 매개변수가 하나인 경우 괄호() 를 생략할 수 있다.
// - 함수의 몸체가 하나의 명령문으로 이루진 경우에는 {} 중괄호로 생략 가능.
// - 함수의 몸체가 하나의 return 문으로만 이루어져 있으면 {} 중괄호로 생략 불가.
// 자바에서 람다식을 구현하기 위해서는 함수형 인터페이스를 만들고, 인터페이스에 람다식으로 구현할 인터페이스 선언 필요.

interface Calculator {
    int sum (int a, int b); // 추상 메소드 선언
}
class MyCalculator implements Calculator {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}

public class LambdaEx1 {
    public static void main(String[] args) {
//        MyCalculator mc = new MyCalculator(); // 일반적인 메소드 구현방법
//        int rst = mc.sum(3, 4);
//        System.out.println(rst);

        Calculator mc = (a, b) -> a + b; // 인터페이스 상속을 받아서 클래스 대신 람식으로 구현한 방법
        int rst = mc.sum(3, 4);
        System.out.println(rst);
    }
}
