package 쓰레드예제7;

import java.util.Scanner;

// 쓰레드의 안정한 종료(Stop 플래그, interrupt())
public class ThreadEx7 {
    public static void main(String[] args) throws InterruptedException {
//        Scanner sc = new Scanner(System.in);
//        RunThread runThread = new RunThread();
//        runThread.start();
//        Thread.sleep(5000);
//
        // interrupt 를 걸어서 종료시키는 방법
        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();
        Thread.sleep(5000);
        interruptThread.interrupt();
    }
}
