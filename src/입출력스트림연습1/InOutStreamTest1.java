package 입출력스트림연습1;

import 클래스정렬연습문제.Student;

import javax.print.attribute.standard.MediaSize;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class InOutStreamTest1 {
    public static void main(String[] args) throws IOException {
//        FileInputStream is = null;
//        TreeSet<StudentInfo> ts = new TreeSet<>();
//        try {
//            is = new FileInputStream("src/입출력스트림연습1/score.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        Scanner sc = new Scanner(is);
//
//        while(sc.hasNextLine()) {
//            String Line = sc.nextLine();
//            String[] strArr = Line.split(" ");
//            ts.add(new StudentInfo(strArr[0],
//                    Integer.parseInt(strArr[1]),
//                    Integer.parseInt(strArr[2]),
//                    Integer.parseInt(strArr[3])));
//        }
//        for(StudentInfo e : ts) {
//            System.out.println(e.getName() + " : " + e.getTotal());
//        }
//        is.close();
        TreeSet<StudentInfo> ts = new TreeSet<>();
        FileInputStream is = null;
        try{
            is = new FileInputStream("src/입출력스트림연습1/score.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(is);

        while(sc.hasNextLine()) {
            String Arr1 = sc.nextLine();
            String[] strArr = Arr1.split(" ");
            ts.add(new StudentInfo(strArr[0],
                    Integer.parseInt(strArr[1]) ,
                    Integer.parseInt(strArr[2]),
                    Integer.parseInt(strArr[3])));
        }
        for(StudentInfo e : ts) System.out.println(ts);


    }
}
