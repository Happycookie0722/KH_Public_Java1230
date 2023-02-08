package 입출력스트림예제6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Scanner 입력으로 파일을 읽기
public class inStreamEx6 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/입출력스트림예제6/test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(fis); // 스캐너의 입력으로 파일을 읽음
        while(sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}
