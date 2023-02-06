package 람다예제6;

import java.util.function.ToIntBiFunction;

// 매개변수의 메소드 참조
// ToIntBiFunction<String, String> : 두 개의 문자열을 입력 받아 int 값을 반환
// compareToIgnoreCase() : 대소문자 구분 없이 문자열을 ASCII 코드 값으로 비교 후 결과를 반환
public class LambdaEx6 {
    public static void main(String[] args) {
        ToIntBiFunction<String, String> function;
        function = (a, b) -> a.compareTo(b);
        print(function.applyAsInt("Java8", "JAVA8"));

        // 메소드 참조로 변환
        function = String::compareTo;
        print(function.applyAsInt("Java8", "JAVA8"));
    }

    static void print(int order) {
        if(order < 0) System.out.println("사전순으로 먼저 나옵니다.");
        else if(order == 0) System.out.println("동일한 문자열입니다.");
        else System.out.println("사전순으로 나중에 나옵니다.");
    }
}
