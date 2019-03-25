package Thread;

public class ExtendThread extends Thread {

    public void run(){
        System.out.println("Thread is Running.....");
    }

    public static void main(String[] args){

        ExtendThread obj = new ExtendThread();
        obj.start();
    }

}
