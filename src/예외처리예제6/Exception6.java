package 예외처리예제6;
// throw : 예외 상황을 외부로 내보내는 것
// (main 에서 던지기를 하는 경우 예외처리를 하지 않음을 의미)
// 원하는 조건 상황에서 필요한 경우 예외 객체를 생성하면서 예외를 발생

public class Exception6 {
    public static void main(String[] args) {
        ThrowEx ex = new ThrowEx();
        ex.printStr(5);
    }
}

class ThrowEx {
    String str = null; // 참조하는 객체가 없음을 의미

    public void printStr(int cnt) {
        if(str == null) {
            System.out.println("str 이 null 이다.");
            throw new NullPointerException(); // NullPointerException 타입의 객체를 생성해 던진다.
        }
        for(int i = 0; i < cnt; i++) {
            System.out.println(str);
        }
    }

}