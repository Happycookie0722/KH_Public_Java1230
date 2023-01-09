package 어레이리스트로또;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// ArrayList 활용해 중복제거
public class ArrayListLotto {
    public static void main(String[] args) {
       /*
        List<Integer> list = new ArrayList<>(); // ArrayList 는 배열과 다르게 크기를 지정할 필요가 없음
        int tmp; // 로또 번호를 생성해 임시 저장하는 공간
        while(true) {
            tmp = (int)((Math.random()*45)+1); // 1 ~ 45 까지의 임의 숫자를 생성
            if(!list.contains(tmp)) {
                list.add(tmp);
            }
            if(list.size() == 6) break;
        }
        for(int e : list) System.out.print(e + " ");
    }
        */

        HashSet<Integer> set = new HashSet<>();
        while (true) {
            int tmp = (int) ((Math.random() * 6) + 1);
            set.add(tmp);
            if (set.size() == 6) break;
        }
        System.out.print(set);
    }
}
