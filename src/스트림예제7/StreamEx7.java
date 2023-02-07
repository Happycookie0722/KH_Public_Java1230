package 스트림예제7;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림의 최종 연산 : 중개 연산을 통해 변환된 스트림은 마지막으로 최종 연산을 통해 요소를 소모하여 결과를 표시
// 최종 연산 시 모든 요소를 소모한 해당 스트림은 더 이상 사용 할 수 없다.
// forEach() : 요소를 출력
// reduce() : 첫번째와 두번째 요소를 가지고 연산을 수행한 뒤, 그 결과와 세번째 요소를 가지고 또 다시 수행
// Optional : NPE(Null Point Exception)을 방지할 수 있도록 도와주는 클래스.
// findFirst(), findAny() : 요소를 검색
// anyMatch(), notMatch(), noneMatch() : 요소의 검사
// anyMatch() : 해당 스트림의 일부 요소가 특정 조건을 만족할 경우 true 반환
// allMatch() : 해당 스트림의 모든 요소가 특정 조건을 만족할 경우 true 반환
// noneMatch() : 해당 스트림의 모든 요소가 특정 조건을 만족하지 않을 경우 true 반환
// count() : 해당 스트림 요소의 총 개수를 long 타입의 값으로 변환
// max() : 해당 스트림의 요소 중 제일 큰 값
// min() : 해당 스트림의 요소 중 제일 작은 값
// sum() : 해당 스트림 요소의 합계
// average() : 해당 스트림 요소의 평균 값을 구하는 Optional 객체
public class StreamEx7 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("넷", "셋", "둘", "하나");
        stream.forEach(System.out::println);

        Stream<String> stream1 = Stream.of("넷", "셋", "둘", "하나");
        Stream<String> stream2 = Stream.of("넷", "셋", "둘", "하나");
        Optional<String> result1 = stream1.reduce((s1,s2) -> s1 + "++" + s2);
        result1.ifPresent(System.out::println);

        IntStream intStream = IntStream.of(1,2,3,4,5,6,7,8,9,10);
        OptionalInt sum = intStream.reduce((s1,s2) -> s1 + s2);
        System.out.println(sum.getAsInt());

        // 요소의 검색 : findFirst(), findAny()
        IntStream stream3 = IntStream.of(4,2,7,3,5,1,6);
        IntStream stream4 = IntStream.of(4,2,7,3,5,1,6);
        OptionalInt rst1 = stream3.sorted().findFirst(); // 정렬한 뒤, 첫번째 값을 가져옴
        System.out.println(rst1);
        OptionalInt rst2 = stream4.sorted().findAny(); // 정렬 이후 첫번째 값을 가져옴(병렬 처리시에는 결과가 달라질 수 있음)
        System.out.println(rst2);

        // 요소의 검사 : anyMatch(), notMatch(), noneMatch()
        IntStream stream5 = IntStream.of(30, 90, 70, 10);
        IntStream stream6 = IntStream.of(30, 90, 70, 10);
        IntStream stream7 = IntStream.of(30, 90, 70, 10);

        System.out.println(stream5.anyMatch(n-> n > 80)); // true
        System.out.println(stream6.noneMatch(n-> n > 80)); // false
        System.out.println(stream7.allMatch(n-> n > 80)); // false

        // 요소의 통계 : count(), max(), min()
        IntStream stream8 = IntStream.of(30, 90, 70, 10);
        IntStream stream9 = IntStream.of(30, 90, 70, 10);
        IntStream stream10 = IntStream.of(30, 90, 70, 10);
        System.out.println(stream8.count());
        System.out.println(stream9.max().getAsInt());
        System.out.println(stream10.min().getAsInt());

        // 요소의 연산 : sum(), average()
        IntStream stream11 = IntStream.of(30, 90, 70, 10);
        DoubleStream stream12 = DoubleStream.of(30.3, 90.9, 70.7, 45, 56);
        System.out.println(stream11.sum());
        System.out.println(stream12.average().getAsDouble());
    }
}
