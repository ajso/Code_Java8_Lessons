package sample.code.lessons.Optional;

import sample.code.lessons.MapFlapMap.CustomerMap;
import sample.code.lessons.MapFlapMap.EkartDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
===================Optional Class=====================
Either an object contains some data or it contains null value. Normally, if the obj contains data then execute the code else throw null
pointer exception. With optional class, the problem was solved.

 */
public class OptionalMain {

    //getting customers by email.
    public static CustomerMap getCustomerByEmail(String email){
        List<CustomerMap> customer_emails = EkartDatabase.getAll();
        return customer_emails.stream().filter(customer -> customer.getEmail().equals("email")).findAny().get();

    }

    public static void main(String[] args) {
        CustomerMap customer = new CustomerMap(42, "Jimmy Makumbi", null, Arrays.asList("0557211840", "0567512453"));

    /*
    ways to create an optional method, i.e Using:-
    1.empty()
    2.of()
    3.ofNullable()
     */
        //===========empty e.g==
        Optional<Object> emptyOptional = Optional.empty();
        //System.out.println(emptyOptional);

        //========.of==========
        // is used when the object is not(never) null. else will return nullPointerException.
        //Optional<String> emailOptional = Optional.of(customer.getEmail());
        //System.out.println(emailOptional);

        //===========ofNullable=====
        // This can be used even when the object is null(may or may not be null). it will return an empty object.
        Optional<String> emailOfNullable = Optional.ofNullable(customer.getEmail());
//        System.out.println(emailOfNullable);
        //To get the value whilst not sure if it's available, we use the if statement.
        if(emailOfNullable.isPresent()){
            System.out.println(emailOfNullable.get()); //if false this statement doesnot execute.
        }

        //To return a default value whilst the obj is empty.
        //System.out.println(emailOfNullable.orElse("default@gmail.com")); //default return type.

        //To throw a custom exception
        //System.out.println(emailOfNullable.orElseThrow(()->new IllegalArgumentException("email not present")));

        //Using a map, converting the null obj to upper case.
        System.out.println(emailOfNullable.map(String::toUpperCase).orElseGet(()->"default@gmail.com")); //orElseGet takes supplier

    getCustomerByEmail("dawudi@gmail.com"); //throws a no value present exception. here we can implement all the other methods tried.
    }

}
