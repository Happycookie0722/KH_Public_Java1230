package 쓰레드예제6;
// 세마포어(Semaphore) : 여러 개의 프로세서가 하나의 공통 메모리 영역(Critical Section)에 접근 하는 것을 방지
// 뮤텍스(Mutex) : 여러 개의 쓰레드가 공통의 메모리 영역에 접근하는 것을 방지(= synchronized)
public class WorkObject {
    // 해당 methodA 는 동기화 처리가 돼서 동시 접근 허용을 하지 않음
    // methodA 에 하나의 쓰레드만 들어올 수 있고 그 쓰레드가 작업이 끝나기 전까지는 다른 쓰레드가 접근불가
    public synchronized void methodA() {
        System.out.println("Thread 의 methodA() 작업실행...");
        notify(); // 일시정지 상태에 있는 ThreadB 를 실행 대기 상태로 만듦
        try {
            wait(); // ThreadA 를 대기 상태로 만듦
        } catch (InterruptedException e) {}
    }

    public synchronized void methodB() {
        System.out.println("Thread 의 methodB() 작업실행...");
        notify(); // 일시정지 상태에 있는 ThreadA 를 실행 대기 상태로 만듦
        try {
            wait();
        } catch (InterruptedException e) {}
    }
}

class ThreadA extends Thread {
    private WorkObject workObject;
    public ThreadA(WorkObject workObject) {
        this.workObject = workObject;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            workObject.methodA();
        }
    }
}

class ThreadB extends  Thread {
    private WorkObject workObject;
    public ThreadB(WorkObject workObject) {
        this.workObject = workObject;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            workObject.methodB();
        }
    }
}
