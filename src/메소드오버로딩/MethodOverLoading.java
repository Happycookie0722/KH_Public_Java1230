package 메소드오버로딩;
// 객체지향 언어의 4가지 특징 : 상속, 데이터은닉(캡슐화), 다형성(오버로딩, 오버라이딩), 추상화
// 메소드 오버로딩 : 이름이 같은 메소드를 중복하여 정의하는 것
// 메소드 오버로딩의 조건
// 1. 메소드 이름이 같아야 한다.
// 2. 반환 타입은 해당 사항이 없음.
// 3. 매개 변수의 타입이 다르거나 갯수가 다르거나 순서가 다르면 가능하다. (OR 조건)
public class MethodOverLoading {
    public static void main(String[] args) {
        System.out.println(sum(100,200));
        System.out.println(sum(100, "200", 300));
        System.out.println(sum("seoul", "busan", "incheon"));
        System.out.println(sum(100, 200, 300, 400));
    }
    static int sum (int x, int y) {
        return x + y;
    }
    // 1. 위와 메소드 이름은 같지만 매개변수의 갯수가 다르므로 오버로딩
    static int sum (int x, int y, int z) {
        return x + y + z;
    }
    // 2. 매개변수의 타입이 다름
    static String sum (int x, String y, int z) {
        return x + y + z ;
    }
    // 3. 반환 타입은 오버로딩 규칙과 상관없으며, 매개변수의 갯수와 타입이 같은게 존재한다.
    static double sum (int x, int y, int z, int aa ) { // int aa를 추가하지 않으면 오류 발생
        return (double)(x + y + z);
    }
    // 4. 2번과 들어있는 매개변수의 종류는 같지만 순서가 다르기 때문에 가능하다.
    static String sum (String x, int y, int z) {
        return x + y + z;
    }

    static String sum (String x, String y, String z) {
        return x + y + z;
    }
}
