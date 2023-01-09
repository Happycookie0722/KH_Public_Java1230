package 배열의응용;

import java.util.Arrays;

// 배열의 복사 : 원칙적으로 자바에서 배열은 한번 생성하면 크기를 변경할 수 없다.
//             하지만 배열의 복사를 통해서 크기를 변경할 수 있다.
public class ArrayApp {
    public static void main(String[] args) {
        // arraycopy() : 배열 값을 복사할 때 사용
        // System.arraycopy(Object src, int srcPos, Object dest, int destPos, int lenngth);

        /*
        int[] arr1 = {1,2,3,4,5};
        int len = 10;
        int[] arr2 = new int[len];
        arr2[0] = 100;
        arr2[1] = 200;
        arr2[2] = 300;
        System.arraycopy(arr1, 0, arr2,5,arr1.length);
        for(int e : arr2) System.out.println(e);



        // copyOf() : 배열의 원하는 길이만큼 새로운 배열로 복사
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = Arrays.copyOf(arr1, 10); // (복사할 값, 배열의 길이를 지정)
        for(int e : arr2) System.out.print(e + " ");

         */

        // 얕은 복사와 깊은 복사
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[arr1.length];
        // int[] arr2 = arr1;    참조형은 값에 대한 주소를 표시하는데, 여기서 주소가 복사 되기 떄문에 얕은 복사가 일어남.

        //System.arraycopy(arr1,0,arr2, 0, arr1.length); // 실제 값을 복사하므로 깊은 복사
        //int[] arr2 = Arrays.copyOf(arr1, arr1.length); // 깊은 복사 2번째 방법
        for(int i = 0; i < arr1.length; i++) {          // 깊은 복사 3번쨰 방법
            arr2[i] = arr1[i];
        }
        arr1[0] = 100;
        for(int e : arr1) System.out.println(e + " ");
        System.out.println( " ");
        for(int e : arr2) System.out.println(e + " ");
    }
}
