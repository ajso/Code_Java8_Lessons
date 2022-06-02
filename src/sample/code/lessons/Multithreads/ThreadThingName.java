package sample.code.lessons.Multithreads;

public class ThreadThingName extends Thread{

    private int threadNumber;


    public ThreadThingName(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){

            System.out.println(i + " From thread " + threadNumber);

//            affecting a thread, doesn't affect other threads.
            if(threadNumber == 4){
                throw new RuntimeException();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
