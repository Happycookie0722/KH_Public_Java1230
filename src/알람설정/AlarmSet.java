package 알람설정;

import java.util.Scanner;

// 상근이라는 친구가 있는데, 이 친구는 매일 학교를 지각합니다.
// 창영이라는 친구가 지각하지 않는 방법을 알려 줍니다.
// 알람을 설정하면 자동으로 설정, 시간보다 45분 일찍 되도록 함.
// 입력 시간은 시간과 분으로 입력 받기, 입력 받은 시간에서 45분보다 이르게 울리도록 설정.
public class AlarmSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 : ");
        int hour = sc.nextInt();
        System.out.print("분 : ");
        int min = sc.nextInt();
        int calc = (hour * 60) + min; // 시간을 모두 분으로 변환

        if(calc < 45){
            calc = (24 * 60) + min; // 23시59분에서 하루가 넘어가는 경우를 위해 if문 추가
        }
        calc -= 45; // 분으로 변경된 값에서 45를 빼고 시간과 분을 출력
        System.out.printf("%d시 %d분\n", (calc/60),(calc%60));


    }
}
