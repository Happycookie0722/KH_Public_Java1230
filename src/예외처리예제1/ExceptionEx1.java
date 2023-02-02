package 예외처리예제1;

import java.io.FilterOutputStream;

// 자바에는 어떻게 할 수 없는 에러와 대응 가능한 예외로 나누어진다.
// 대응 가능한 예외는 예외처리 구문을 통해 해결 할 수 있다.
// 예외처리 구문 이전에 프로그램에서 조건문 등을 통해 발생할 수 있는 문제는 사전에 차단해야 한다.
// ArrayIndexOutOfBoundException : 할당되지 않은 배열의 인덱스에 접근할 때 발생
public class ExceptionEx1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            for (int i = 0; i <= arr.length; i++) { // 배열의 범위 초과로 오류가 발생
                arr[i] = 1;
                System.out.println(arr[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("예외 처리를 합니다.");
        }
        System.out.println("프로그램 정상 종료");
    }
}
