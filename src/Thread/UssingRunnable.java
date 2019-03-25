package Thread;

public class UssingRunnable implements Runnable {
    @Override
    public void run() {

        System.out.println("Another thread is running with Runnable interface......");

    }
    public static void main(String[] args){

        UssingRunnable amni = new UssingRunnable();
        Thread obj = new Thread(amni);
        obj.start();
    }

}
