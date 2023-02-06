package 람다예제2;
// 매개변수가 있는 람다식

@FunctionalInterface // 함수형 인터페이스 문법체크를 위한 어노테이션, 맞지 않을 경우 에러발생
                     // 메소드가 하나만 들어 갈 수 있음.
interface MyFuncInterface { // 함수형 인터페이스를 생성하기 위해 자바는 따로 인터페이스를 구현해야 한다.
    public void method(int x); // 자바 문법의 특정 때문에 인터페이스가 필요하다.
}
public class LambdaEx2 {
    public static void main(String[] args) {
        MyFuncInterface fi = x -> {
            int result = x + 5;
            System.out.println(result); // 구현부 {} 가 2줄 이상인 경우 중괄호 붙임
        };
        fi.method(2);
    }
}
