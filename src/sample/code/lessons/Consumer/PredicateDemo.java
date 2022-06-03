package sample.code.lessons.ConsumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
this is used for conditional checks/Statements.
implements Predicate<Integer> - using traditional java.
 */
public class PredicateDemo {

//    @Override - Using the traditional java to get results.
//    public boolean test(Integer t) {
//        //predicate example.
//        if(t%2 == 0){
//            return true;
//        }else{
//            return false;
//        }
//    }

    public static void main(String[] args) {
//    Traditional implementation: the implementation of the predicate.
//        Predicate<Integer> predicate = new PredicateDemo();
//        boolean result = predicate.test(16);
//        System.out.println(result);

// Implementation using the lambda expression. First remove the implements stmt.
        Predicate<Integer> predicate = (t)->{
            if(t%2==0){
                return true;
            }else {
                return false;
            }
        };
        System.out.println(predicate.test(12));

// Or Another way to write a lambda.
        Predicate<Integer> predicate1 = t->t%2 == 0;
        System.out.println(predicate.test(13));

// Example using Stream APi:
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
//        Print number from the list that are divisible by 2.
        list1.stream().filter(predicate1).forEach(t->System.out.println("Printing Even" + t));
//        Or
        list1.stream().filter(t->t%2==0).forEach(t->System.out.println("Printing another even" +t));
    }
}
