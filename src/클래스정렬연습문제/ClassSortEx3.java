package 클래스정렬연습문제;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

// 첫번째 줄에 학생의 수 N을 입력
// 두번째 줄부터 학생의 이름과 성적을 공백 기준으로 입력
public class ClassSortEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Student> ts = new TreeSet<>(new Comp());

        System.out.print("학생의 수 입력 : ");
        int StNum = sc.nextInt();
        System.out.print("이름과 성적 입력 : ");
        for(int i = 0; i < StNum; i++) {  // 학생의 수 만큼 이름과 성적을 입력 받아 새 객체를 생성.
            ts.add(new Student(sc.next(), sc.nextInt()));
        }
        for(Student e : ts) {
            System.out.println("이름 : " + e.name);
            System.out.println("점수 : " + e.score);
        }
    }
}
