package 싱글톤;
// 싱글톤 : 프로그램 전체에서 단 하나의 객체만 만들도록 보장 하는 것
// 스프링 프레임워크의 서블릿 객체 생성 시 사용된다.
// 사용이유 : 메모리 효율에 대한 측면과 데이터 공유의 편의성을 위해 사용
public class SingletonMain {
    // Singleton singleton = new Singleton(); private 사용을 했기 때문에 다른 클래스에서 객체 생성 불가
    Singleton singleton1 = Singleton.getSingleton(); // 이미 만들어져 있는 싱글톤 객체의 주소를 가져옴
    Singleton singleton2 = Singleton.getSingleton();
//        if(singleton1 == singleton2) {
//        System.out.print("같은 싱글톤 객체입니다.");
//    } else {
//        System.out.print("다른 싱글톤 객체입니다.");
//    }
}
