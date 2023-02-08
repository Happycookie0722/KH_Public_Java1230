package 스트림으로홀수짝수정렬;

import 배열의응용.ArrayApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 7개의 정수를 입력 받아 홀수 짝수 나누어 출력 하기
// 스트림을 이용해서 하기
public class StreamTextEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        Integer[] inputNum = new Integer[7];
        for(int i = 0; i < 7; i++) {
            inputNum[i] = (sc.nextInt());
        }
        List<Integer> list = new ArrayList<>(Arrays.asList(inputNum));
        list.stream().filter(e-> e % 2 == 1).forEach(n->System.out.print(n + " "));
        System.out.println();
        list.stream().filter(e-> e % 2 == 0).forEach(n->System.out.print(n + " "));


    }
}
