package sample.code.lessons.Lambdas;

public class CalculatorImpl {

    public static void main(String[] args) {

        //(parameter1, parameter2) -> { body }
        //Calculator interface implementation. with lambda.
        //Ordinary
//        Calculator calculator = () ->{
//            System.out.println("Switch on the calculator");
//        };
        //display the text.
        //calculator.switchOn();

       // Calculator calculator = (x, y)-> x+y;
//        OR
//        Calculator calculator1 = Integer::sum;
//        int result = calculator1.sum(546, 57);
//
//        System.out.println(result);

//        With some logic

        Calculator calculator = (x, y) -> {

            if(y>x) {
                throw new RuntimeException("y is greater than x, can't add");
            }else {
                return x + y;
            }
        };
        System.out.println(calculator.sum(45, 10));
    }
    }

