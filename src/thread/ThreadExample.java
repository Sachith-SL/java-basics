package thread;

public class ThreadExample {
    public static int constValue= 100;
    public static void example() {
        MyThread myThread = new MyThread();
        MyThread2 newThread = new MyThread2();
        Thread myThread2 = new Thread(newThread);
        myThread.start();
        myThread2.start();

        for (int i = 1; i < 101; i++) {
            System.out.println(constValue+"                    Out MyThread: " + i);
            if(i==50){
                // Wait for the thread2 to finish
                while(myThread2.isAlive()) {
                    System.out.println("Waiting...");
                }
                ThreadExample.constValue=200;
            }

        }

        System.out.println("final value of const: "+ThreadExample.constValue);

        System.out.println(myThread.isDaemon());
    }
}
