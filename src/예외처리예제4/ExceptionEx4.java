package 예외처리예제4;

import java.io.FileWriter;
import java.io.IOException;

// finally : 프로그램 실행 도중 예외가 발생하면 catch 구문이 수행된다.
// 하지만 예외 발생 여부와 상관없이 항상 수행되어야 하는 구문이 있는 경우 finally 로 처리
public class ExceptionEx4 {
    public static void main(String[] args) {
        FileWriter f = null;
        try {
            f = new FileWriter("test.txt");
            f.write("test");
        } catch (IOException e) {
            e.printStackTrace();  // 예외처리 발생 당시 Call Stack 에 있던 결과값을 화면에 출력
        } finally {
            if(f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
