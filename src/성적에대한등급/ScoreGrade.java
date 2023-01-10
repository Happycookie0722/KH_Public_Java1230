package 성적에대한등급;

import java.util.Scanner;

// 성적을 입력 받아서 입력 받은 값이 0 ~ 100가 아닌 경우
// "성적을 잘못 입력 하셨습니다." 라고 출력
// 90점 이상이면 A, 80 이상이면 B, 70 이상이면 C, 60 이상이면 D, 나머지는 F로 출력
public class ScoreGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        int score = sc.nextInt();
        if(score >= 0 && score <= 100){
            if(90 <= score) System.out.println("성적은 A 입니다."); // 코드가 한 줄인 경우 { } 를 생략해도 된다.
            else if (80 <= score) System.out.println("성적은 B 입니다.");
            else if (70 <= score) System.out.println("성적은 C 입니다.");
            else if (60 <= score) System.out.println("성적은 D 입니다.");
            else System.out.println("성적은 F 입니다.");
        } else {
            System.out.println("성적을 잘못 입력하셨습니다.");
        }

        }
}
