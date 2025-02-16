package thread;

public class Task implements Runnable{

    private final int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            System.out.println("In Task "+taskId+" : "+i);
        }
    }
}
