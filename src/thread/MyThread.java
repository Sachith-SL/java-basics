package thread;

public class MyThread extends Thread{

    @Override
    public void run(){
        for (int i = 1; i < 101; i++) {
            System.out.println("In MyThread: "+i);
        }

    }

}
