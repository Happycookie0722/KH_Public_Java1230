package 스트림예제6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림 중개 연산 : 생성된 스트림은 중개 연산을 통해 또 다른 스트림으로 변환 된다.
// 중개 연산은 연속으로 연결해서 여러개 사용 가능하다.
// filter() : 해당 스트림에서 주어진 조건에 맞는 요소로만 구성된 새로운 스트림 반환
// distinct() : 요소의 중복 제거(내부적으로 equals() 메소드 사용)
// map() : 스트림의 요소들을 주어진 함수에 인수로 전달하여, 그 반환값으로 이루어진 새로운 스트림을 반환.
public class StreamEx6 {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(7,5,5,2,1,3,5,4,6);
        IntStream stream2 = IntStream.of(7,5,5,1,2,3,4,5,6,7);
        // 스트림에서 중복 요소를 제거
        stream1.distinct().forEach(e->System.out.print(e + " "));
        System.out.println();

        // 스트림에서 홀수만 골라 내기
        stream2.filter(n->n % 2 != 0).forEach(e->System.out.print(e + " "));
        System.out.println();

        // map() : 입력한 원소를 토대로 스트림으로 반환
        Stream<String> stream3 = Stream.of("HTML", "JAVA", "CSS", "JAVASCRIPT");
        stream3.map(s->s.length()).forEach(System.out::println);

        // flatmap() : 입력한 원소를 가장 작은 단일 스트림으로 반환
        String[] arr = {"I study hard", "You study JAVA", "I am Hungry"};
        Stream<String> stream4 = Arrays.stream(arr);
        stream4.flatMap(s->Stream.of(s.split(" +"))).forEach(System.out::println);

        // limit() : 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소만으로 이루어진 새로운 스트림을 반환
        IntStream stream5 = IntStream.range(0, 10);
        stream5.limit(10).forEach(n->System.out.print(n + " "));
        System.out.println();

        // skip() : 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소를 제외한 나머지 요소만으로 이루어진 스트림 반환
        IntStream stream6 = IntStream.range(0, 10);
        stream6.limit(5).forEach(n->System.out.print(n + " "));
        System.out.println();

        // skip()과 limit() 을 함께 사용하기
        IntStream stream7 = IntStream.range(0, 10);
        stream7.skip(3).limit(5).forEach(n->System.out.print(n + " "));
        System.out.println();

        // 스트림 정렬 sorted() : 해당 스트림을 주어진 비교자(comparator)를 이용하여 정렬
        Stream<String> stream8 = Stream.of("JAVA", "HTML", "CSS", "JAVASCRIPT");
        stream8.sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();

        Stream<String> stream9 = Stream.of("JAVA", "HTML", "CSS", "JAVASCRIPT");
        stream9.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
        System.out.println();

    }
}
