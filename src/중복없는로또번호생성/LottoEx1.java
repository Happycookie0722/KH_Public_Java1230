package 중복없는로또번호생성;

import java.util.Arrays;

// 중복 없는 로또 번호 생성하기
// 1. 6개의 로또 번호 생성해서 출력하기 (배열 사용)
// 2. 중복 없는 로또 번호 생성 후 출력
// 3. ArrayList 사용해서 출력 (중복 없음)
// 4. Set을 이용해서 로또 번호 출력 (중복 없음)
public class LottoEx1 {
    public static void main(String[] args) {
        // 6개의 배열 생성
        // 반복문을 순회 하면서 랜덤함수를 이용해 배열에 로또번호 추가
        // 마지막에 배열에 포함된 로또 번호 출력

       /*
       int[] lotto = new int[6];
        for(int i = 0; i < lotto.length; i++)
        {
            lotto[i] += (int)((Math.random()*45)+1);
        }
        System.out.println(Arrays.toString(lotto));
       */
        int[] lotto = new int[6];
        int index = 0;
        int tmp = 0;
        boolean isExist = false; // 로또 배열에 지금 생성한 값과 동일한 값이 있는지 확인하기 위해 생성

        while(true) {
            tmp = (int)((Math.random()*45)+1);         // tmp 에 1 ~ 45 까지의 숫자를 생성
            for(int i = 0; i < lotto.length; i++) {    // lotto 의 index 길이까지 for 문을 이용하여 반복
                if(lotto[i] == tmp) isExist = true;    // tmp 의 숫자와 lotto 배열의 숫자중 같은 번호가 있는지 확인 후
            }                                          // 중복으로 존재하는 경우 isExist 값을 true 로 바꾼다.
            if(isExist == false) lotto[index++] = tmp; // 중복으로 존재하지 않을시 tmp의 숫자를 lotto로 옮긴 후 인덱스 위치를 바꾼다.
            if(index == 6) break;                      // 인덱스가 6이 될 경우 자동으로 종료.
            isExist = false;                           // 인덱스 길이가 6이 되기 전까지 중복 값을 다시 찾기 위해. isExist를 다시 false 로 반복
        }
        System.out.println(Arrays.toString(lotto));
    }
}
