package 열거형연습;
// 타입 체크를 할 수 있는 장점이 있음
public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer1 = new Developer("이동현", DevType.BACKEND, Career.JUNIOR, Gender.MALE);
        developer1.devInfo();


    }
}
