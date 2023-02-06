package 람다예제4;
// 클래스 멤버와 로컬변수 : 클래스 멤버는 제약 없이 사용 가능, 로컬 변수는 제약이 있음.
public class LambdaEx4 {
    public static void main(String[] args) {
        UsingThis ut = new UsingThis();
        UsingThis.Inner inner = ut.new Inner();
        inner.method();
    }
}

interface MyFuncInterface {
    public void method();
}

class UsingThis {
    public int outerField = 10;

    class Inner {
        int innerFiled = 20;
        void method() {
            int localVal = 40; // 메소드 내의 지역 변수의 값은 변경 될 수 없음
            // localVal = 30; 변경 될 경우 오류 발생
            MyFuncInterface mi = () -> {
                System.out.println("외부필드 : " + outerField);
                System.out.println("외부필드 : " + UsingThis.this.outerField);
                System.out.println("내부필드 : " + innerFiled);
                System.out.println("내부필드 : " + this.innerFiled);
                System.out.println("지역변수 : " + localVal);
            };
            mi.method();
        }
    }
}

