package Arrays클래스;

import java.util.Arrays;
import java.util.Scanner;

// Arrays 클래스는 배열을 다루기 위한 다양한 메소드를 포함하고 있다.
public class ArraysMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 갯수를 입력 : ");
        int Num = sc.nextInt();
        int[] arr = new int[Num];
        System.out.print("찾을 수 입력 : ");
        int key = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * Num) + 1;
        }
        System.out.println(Arrays.toString(arr)); // 배열을 문자열로 찍어준다.

        // 배열의 값을 정리하기
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int rst = Arrays.binarySearch(arr, key); // 찾으려는 수의 해당 인덱스 값을 반환
        if(rst >= 0) System.out.println("결과 : " + rst);
        else System.out.print("해당 숫자가 없음");
    }
}
