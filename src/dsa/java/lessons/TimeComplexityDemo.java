package dsa.java.lessons;

public class TimeComplexityDemo {

    public static void main(String[] args) {
        double now = System.currentTimeMillis();

        TimeComplexityDemo demo = new TimeComplexityDemo();
        System.out.println(demo.findSum(99999));

        System.out.println("Time taken is - " + (System.currentTimeMillis()-now) + " millisecs");
    }
    //Takes almost no time

    private int findSum(int n) {
        return n*(n +1)/2;
    }


    //Takes some time.
//    public int findSum(int n){
//        int sum=0;
//        for(int i=1; i<=n; i++){
//            sum = sum+i;
//        }
//        return sum;
//    }
}
