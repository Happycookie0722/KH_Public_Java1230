package 쓰레드예제2;
// 쓰레드 생성 방법  1. Thread 클래스를 상속 받는 방법 (구현이 쉬움, 쓰레드를 상속 받았기 때문에 다른 클래스 상속받는건 불가)
//                2. Runnable 인터페이스로 구현하는 방법 (확장성이 좋음, 다른 여러 클래스로부터 상속을 받을 수 있음)
//                      Runnable 변수 = new Sample();
//                      Thread thread = new Thread(변수);
//                3. Runnable 인터페이스를 이용한 익명의 객체로 구현
//                4. Runnable 인터페이스를 이용한 람다식으로 구현
// setPriority(1~10) : 1 ~ 10 사이의 값으로 우선 순위를 주는것. 숫자가 높을수록 우선순위가 높음(자주 나올 확률이 높다)
public class ThreadEx2 {
    public static void main(String[] args) {
        Runnable task = new Sample();
        Thread thread = new Thread(task); // 실체 쓰레드가 생성
        Thread thread2 = new Thread(task);
        thread.start(); // start() 메소드 호출 시 자신의 run() 메소드를 실행
        thread2.start();

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                    System.out.println("" + Thread.currentThread() + sum);
                }
                System.out.println(Thread.currentThread() + "합계 : " + sum);
            }
        };
        Thread thread3 = new Thread(task2);
        thread3.start();

        Runnable task3 = () -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
                System.out.println("" + Thread.currentThread() + sum);
            }
            System.out.println(Thread.currentThread() + "합계 : " + sum);
        };
        Thread thread4 = new Thread(task3);
        thread4.start();

        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println("$$$$$여기는 메인 입니다,$$$$$$$$$$");
            }
        }
    }
}

class Basic {

}

class Sample extends Basic implements Runnable { // Runnable 은 여러 클래스에게 상속을 받을 수 있음

    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i < 100; i++) {
            sum += i;
            System.out.println("" + Thread.currentThread() + sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}
