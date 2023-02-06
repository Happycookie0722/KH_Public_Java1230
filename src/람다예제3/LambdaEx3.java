package 람다예제3;
// 리턴 값이 있는 람다식 : MyFuncInterface fi = (x, y) -> {x < y ? x : y}
@FunctionalInterface
interface MyFuncInterface {
    public int min(int x, int y); // 메소드가 한 개만 존재해야한다.
}

public class LambdaEx3 {
    public static void main(String[] args) {
        MyFuncInterface fi = (x, y) -> x < y ? x : y; // 한 줄짜리 코드면 중괄호를 안넣어야함
        System.out.print(fi.min(3,4));
    }
}
