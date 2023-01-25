package 스트링버퍼;
import java.lang.*; // import java.lang.*; 를 넣지않아도 컴파일러가 자동으로 추가. (기본 패키지)
// StringBuffer : 문자열을 추가하거나 변경 할 때 사용하는 자료형(동기화 처리가 있음) ex) 엑셀 동시 작업시 읽기모드와 작업자모드
// StringBuilder : 문자열을 추가하거나 변경 할 때 사용하는 자료형(동기화 처리가 없음)
// String : 문자열을 +연산자로 추가하면 매번 더할 때 마다 새로운 문자열이 생성
public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); // StringBuffer 객체 생성
        sb.append("hello");
        sb.append(" ");
        sb.append("to Java");
        sb.append(" ");
        sb.append("javascript");
        //sb.delete(1, 3); // 1번 인덱스부터 3번 인덱스 미만까지 문자열을 삭제
        sb.insert(0, "test "); // 해당 인덱스에 문자열을 추가
        System.out.println(sb);
        System.out.println(sb.substring(0, 4)); // 시작 인덱스부터 종료 인덱스 미만까지 문자열 출력

    }
}
