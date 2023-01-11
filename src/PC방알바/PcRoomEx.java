package PC방알바;
// 피씨방에는 피씨가 100대 있습니다.
// 손님은 자신이 원하는 피씨를 사용하고 싶어합니다.
// 손님의 수 입력 : 5
// 손님이 선택한 좌석 번호 : 1 1 3 3 5 => 2
// 거절 횟수 : 2

import java.util.Scanner;

public class PcRoomEx {
    public static void main(String[] args) {
        int[] pcRoom = new int[100];
        Scanner sc = new Scanner(System.in);
        int rejectCnt = 0; // 거절 횟수를 누적하는 변수
        System.out.print("손님의 수 입력 : ");
        int num = sc.nextInt();  // 손님의 수 입력
        for(int i = 0; i < num; i++) {  // 입력 받은 손님의 수 만큼 좌석 번호를 입력 받음
            System.out.print("좌석 번호 입력 : ");
            int seatNum = sc.nextInt(); // 각 손님의 좌석 번호를 입력 받음
            if(pcRoom[seatNum -1] == 1) rejectCnt++;
            else pcRoom[seatNum -1] = 1;
            }
        System.out.println(rejectCnt);
        }
    }



