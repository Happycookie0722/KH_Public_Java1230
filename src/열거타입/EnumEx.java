package 열거타입;

import java.util.Random;

// values() : 해당 열거체의 모든 상수를 저장한 배열을 생성 후 반환
enum Rainbow {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}
public class EnumEx {
    public static void main(String[] args) {
        Rainbow[] array = Rainbow.values();
        for(Rainbow e : array) System.out.print(e + " ");
    }
}
