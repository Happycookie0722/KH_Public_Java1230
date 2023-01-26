package 박싱과언박싱;
// 프로그램의 동작에 있어 기본타입의 데이터를 객체로 취급해야 하는 경우가 있음(컬렉션 프레임워크, 제너릭)
// Wrapper 클래스는 8개의 기본 타입에 대해 객체 타입으로 포장해주는 클래스
// Boxing : 기본 타입을 자동으로 래퍼 클래스 타입으로 변환
//          byte, short, int, long, float, double, char, boolean
//      =>  Byte, Short, Integer, Long, Float, Double, Character, Boolean
// UnBoxing : 래퍼 클래스 타입을 기본 타입으로 변환
public class BoxingEx {
    public static void main(String[] args) {
        // Integer num = new Integer(17); // 기본적인 정수형에 대한 Wrapper 클래스 타입
        Integer num = 17; // 자바 1.5 이후에 변경 된 사항
        // int n = num.intValue(); // 이전 버전에서 사용하던 언박싱
        int n = num; // 자바 1.5 이후에 변경 된 언박싱

        // Character ch = new Character('X');
        Character ch = 'X';

    }
}
