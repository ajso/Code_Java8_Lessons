package sample.code.lessons.Multithreads;

public class MultithreadingMain {

    public static void main(String[] args){
//        Object of the multi thread class.
//        ThreadThingName thing = new ThreadThingName();
//        adding another thread
//        ThreadThingName thing2 = new ThreadThingName();

//        Using a for loop, running 5 threads at the same time.
        for(int i=0; i<=10; i++){
            ThreadThingName thing = new ThreadThingName(i);
            thing.start(); //starts the thread and calls the run().
            thing.isAlive(); //return a true or false whether the thread is still running or not.

            try {
//                join() waits for the program to die. waits for the first thread to complete then start a new one.
                thing.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        thing.start();
//        thing2.start();
//        Both threads will run at the same time
    }
}
