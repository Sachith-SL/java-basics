package thread;

public class MyThread2 implements Runnable {


    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            ThreadExample.constValue=50;
            System.out.println(ThreadExample.constValue+"                                                In MyThread2: " + i);
        }
    }
}
