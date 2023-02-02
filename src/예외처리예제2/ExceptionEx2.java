package 예외처리예제2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// FileNotFoundException : 파일을 찾을 수 없을때 발생하는 에러
// IOException : FileNotFoundException 가 자식클래스
// NullPointException : 내가 참조하고 있는 객체가 없는 경우 발생
public class ExceptionEx2 {
    public static void main(String[] args) {
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("../database.properties"));
//            br.readLine();
//            br.close();
//        } catch (IOException e) { // 입출력 관련된 에러
//            System.out.println("파일을 발견할 수 없습니다.");
//        }
//            System.out.println("프로그램 종료");
        Test test = null; // 참조변수가 참조하는 객체가 없음을 의미 Test test = new Test(); 로 수정해야 함
        String str = test.name;
        System.out.println(str);
    }
}

class Test {
    String name = "테스트";
}