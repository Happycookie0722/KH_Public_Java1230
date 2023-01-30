package Map기본;
// HashMap : 키와 값의 쌍(Pair)로 구성되어 있음. 키는 중복될 수 없고 값은 중복 가능.
// 키의 중복 여부 확인은 HashCode 를 이용해서 확인한다.
// Hash 알고리즘의 특징은 키 값을 해시함수의 입력으로 전달하여 정수값의 결과를 반환함

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
// map.get(키값) : 객체 찾기
// map.remove(키값) : 객체 삭제
// map.size() : map 의 총 배열 갯수
// for(String key : map.keySet()) : 향상된 for 문 사용법
// map.remove(키값) : 키로 Map.entry 제거
// map.replace(키값, 바꾸려는 값) : 값을 바꾸는 방법
// map.clear() : 객체를 전체 삭제

public class MapTestEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
//         객체 추가
        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호", 80);
        map.put("동그라미", 99); // 중복된 키값이 있으므로 나중에 들어온 값으로 대체. 값은 변경 될 수 있음

//         객체 찾기
//      System.out.println(map.get("동그라미")); // 키에 대한 값을 출력 => 값인 가격이 출력
//
//         객체 삭제
//      map.remove("동그라미"); // 키를 넣어서 값을 삭제
//
//         map 의 총 갯수
//      map.size();

//       map 순회 방법 (반복자 : Iterator 사용)

//      Set<String> keySet = map.keySet();
//      Iterator<String> iterator = keySet.iterator();
//      while(iterator.hasNext()) {
//          String key = iterator.next();
//          Integer value = map.get(key);
//          System.out.println(key + " : " + value);
//      }

//         향상된 for 문을 이용하는 방법
//      for(String key : map.keySet()) {
//            System.out.println(key + " : " + map.get(key));
//        }
//      map.remove("최수연"); // 키로 Map.entry 제거
//      map.replace("이준호" , 91); // 값을 바꾸는 방법
//      map.clear(); // 객체를 전체 삭제
    }
}
