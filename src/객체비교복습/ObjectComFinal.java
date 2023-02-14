package 객체비교복습;

import java.util.Iterator;
import java.util.TreeSet;

// 10명의 성적을 입력 받음 (미리 만들어 둠)
// 이름 국어 영어 수학
// 총점이 높은 순으로 정렬, 총점이 같으면 이름순 정렬
// Comparator, Comparable, Collection 의 sort
// treeSet 의 특징 : list 와 달리 값이 들어가면 자동으로 정렬한다. (나뭇가지처럼 기준 값이 하나 주어지고 값보다 작으면 왼쪽, 크면 오른쪽)
public class ObjectComFinal {
    public static void main(String[] args) {
        TreeSet<StudentInfo> info = new TreeSet<>();
        info.add(new StudentInfo("최치열", 80, 80, 100));
        info.add(new StudentInfo("우영우", 100, 98, 95));
        info.add(new StudentInfo("이준호", 77, 67, 88));
        info.add(new StudentInfo("남행선", 55, 45, 35));
        info.add(new StudentInfo("남해이", 99, 97, 94));

        for(StudentInfo e : info) System.out.println(e.getTotal() + " : " + e.getName());

        Iterator<StudentInfo> iterator = info.iterator();
        while(iterator.hasNext()) {
            StudentInfo next = iterator.next();
            System.out.println(next.getTotal() + " : " + next.getName());
        }
    }
}

class StudentInfo implements Comparable<StudentInfo> {
    private String name;
    private int Kor;
    private int Eng;
    private int Mat;

    public StudentInfo(String name, int kor, int eng, int mat) {
        this.name = name;
        Kor = kor;
        Eng = eng;
        Mat = mat;
    }
    int getTotal() {
        return Kor + Eng + Mat;
    }
    public String getName() {
        return name;
    }
    @Override
    public int compareTo(StudentInfo o) {
        if(this.getTotal() == o.getTotal()) return this.name.compareTo(o.name);
        return o.getTotal() - this.getTotal();
    }
}
