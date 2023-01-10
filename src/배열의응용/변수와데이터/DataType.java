package 변수와데이터;

//클래스 이름은 파일 이름과 동일해야 함.
//실수는 소수점 이하 값이 존재하고, 기본은 double 형이 기본.
public class DataType {
    //public = 접근 제한자 static = 정적변수 void = 반환 타입 (메서드를 실행하고 되돌릴 값이 없음) main = JVM 을 실행하기 위한 첫 위치 설정
    public static void main(String[] args) {
        int age = 20; // 정수값을 저장하기 위해서 age 변수를 선언, 선언과 동시에 값을 초기화.
        double value ; // 실수값을 저장하기 위해서 value 변수를 선언,

        int num1, num2 ; //같은 타입의 변수는 콤마(,)로 구분해서 동시에 선언 가능. value = 3.14;
        double num3 = 3.14; //선언과 동시에 초기화
        String name = "곰돌이사육사";
        int hour = 3;
        int minute = 55;

        System.out.println(hour + "시" + minute + "분");
        System.out.println(name);

        NameCard ns = new NameCard();
        ns.name = "곰돌이사육사";
        ns.age = 20;
        System.out.println(ns.name);


    }
}
// 사용자 정의 자료형
class NameCard {    // public 은 하나만 사용할 수 있으므로, 사용하지 않는다.
    String name;
    int age;
    String addr;
    String eMail;
    String phoneNumber;
}