package 피타고라스정리예제;

import java.util.*;

public class PythagorasEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int tmp = 0;

        System.out.print("각 변의 길이 입력 : ");
        for(int i = 0; i < 3; i++) {
            tmp = sc.nextInt();
            if(tmp == 0) System.out.println();
            list.add((tmp * tmp));
        }
        list.sort(Comparator.naturalOrder());
        if((list.get(0) + list.get(1)) == list.get(2)) System.out.println("True");
        else System.out.println("False");

    }

}
