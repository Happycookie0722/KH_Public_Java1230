package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// add() : 특정 위치에 삽입
// get() : 해당 인덱스의 값을 가져옴
// size() : List 내부에 있는 요소의 개수를 반환
// contain() : 해당 값이 내부에 있는지 확인
// remove() : 문자열을 입력시 : 해당 값이 있으면 삭제하고 true 반환, 없으면 false
//            인덱스 입력시 : 해당 인덱스의 값을 삭제하고 나머지 배열 값을 리턴
// Array.asList() : // 이미 만들어져 있는 배열을 복사해서 가져옴
public class ArrayListEx {
    public static void main(String[] args) {
//        List<String> pitches = new ArrayList<>();
//        pitches.add("138");
//        pitches.add("129");
//        pitches.add(0,"142"); // 특정 위치에 값을 삽입할 수 있다.
//        System.out.println(pitches);
//        System.out.println(pitches.get(1)); // 해당 인덱스의 값을 가져옴
//        System.out.println(pitches.size()); // List 내부에 있는 요소의 개수를 반환
//        System.out.println(pitches.contains("142")); // 해당 값이 내부에 있는지 확인. 있으면 true
//        System.out.println(pitches.remove("140")); // 해당 값이 있으면 삭제하고 true 반환, 없으면 false
//        System.out.println(pitches.remove(0)); // 해당 인덱스의 값을 삭제하고 해당 값을 리턴
        String[] data = {"138", "129", "142"};
        List<String> pitches = new ArrayList<>(Arrays.asList(data)); // 이미 만들어져 있는 배열을 추가
    }
}
