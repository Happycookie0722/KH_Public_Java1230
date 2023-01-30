package Arrays과일정렬;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// Arrays sort() : Comparator 사용하기
// 정렬은 기본적으로 오름차순 정렬
// Arrays.sort(배열이름, new Collections.reverseOrder()) : 내림차순 정렬 (기본 타입을 클래스 타입으로 변환 시켜야한다.)
// 문자열 길이를 비교하기 : length()
// compareTo() : 문자열을 ASCII 코드값으로 비교해 결과를 양수/0/음수 로 반환
// 반환 값이 양수이면 정렬 조건이 되고 음수이면 현 상태 유지의 조건
public class FruitEx {
    public static void main(String[] args) {
//        Integer[] arr = {5, 3, 5 ,6, 7, 123, 567, 667};
//        올림차순 정렬
//        Arrays.sort(arr);
//        for(int e : arr) System.out.print(e + " ");
//
//        내림차순 정렬
//        Arrays.sort(arr, Collections.reverseOrder());
//
//        조건형 정렬
//        Arrays.sort(배열, new Comparator<자료형 클래스타입>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 리턴값;
//            }
//        });

        // 임의의 10개 과일이름의 배열 생성, 길이 순으로 정렬하고 만약 길이가 같으면 사전순으로 정렬
        String[] fruitArr = {"Apple", "Banana", "Kiwi", "Strawberry", "Blueberry", "Pineapple", "Orange", "Melon", "Grape", "Pare"};


        Arrays.sort(fruitArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) return 1; // 첫번째가 두번째 보다 길기 때문에 정렬 조건에 해당
                else {
                    if(o1.length() == o2.length()) {
                        return o1.compareTo(o2); // o1보다 o2가 사전 순서상 앞이면 양수, 같으면 0, 뒤에 있으면 -1 리턴
                    }
                    return -1; // 정렬하지 않는 조건
                }
            }

        });
        System.out.println(Arrays.toString(fruitArr));
        String test = "abcd";
        System.out.println(test.compareTo("ab")); // 양수
        System.out.println(test.compareTo("abcd")); // 0
        System.out.println(test.compareTo("abcde")); // 음수
        System.out.println(test.compareTo("ac")); // 음수
    }
}
