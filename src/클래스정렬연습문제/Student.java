package 클래스정렬연습문제;

import java.util.Comparator;

public class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Comp implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.score == o2.score) {
            return o1.name.compareTo(o2.name);  // 성적이 같은 경우 이름을 사전순으로 정렬
        }
        return o1.score - o2.score;
    }
}

