package 스트림예제1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 스트림은 배열, 컬렉션 등의 자료를 일관성 있게 처리하게 한다. (자료의 대상과 상관없이 동일한 연산을 수행)
// 한번 생성하면 한번만 사용 가능, 원본 데이터를 변경하지 않음, 병렬 처리 지원, 내부 반복자 사용
// 스트림의 동작은 생성 -> 중간 연산 -> 최종 연산으로 수행
public class StreamEx1 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr)); // 생성
//        list.stream().filter(s->s.intValue() >= 5).forEach(s->System.out.println(s));
        //                      중간 연산               최종 연산
        // for 문에서            for(조건문)            {출력문}
        // mapToInt : 스트림을 IntStream 으로 변환해주는 메소드
        int sum = list.stream().mapToInt(e->e).sum(); // mapToInt() 중간 연산, sum() 최종 연산
        int count = (int) list.stream().mapToInt(e->e).count();
        System.out.println("합 : "+ sum);
        System.out.println("카운트 : " + count);
    }
}
