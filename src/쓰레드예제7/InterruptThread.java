package 쓰레드예제7;

public class InterruptThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("쓰레드 실행 중...");
            Thread.sleep(1); // sleep 이 추가 되어 있음
        } catch (InterruptedException e) {
            System.out.println("Interrupt 발생으로 쓰레드가 종료");
        }
        System.out.println("자원 정리 중...");
        System.out.println("실행 종료");
    }
}
