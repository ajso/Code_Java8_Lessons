package sample.code.lessons.Streams;

import java.util.List;
import java.util.stream.Collectors;

//Map() and FlapMap() are widely used when dealing with streams of data.
/*
These both methods are intermediate method that return another stream as part of the output.
map() - Used for transformation
      -It takes stream<T> as an input and returns a stream<R>(another stream)
      -performs one-to-one mapping.
      -processes a stream of value
      -Does only mapping.
      -perform data transformation from stream to stream.

flatMap() - used for transformation and flattering data. i.e flatMap() = map()+flattering
      -performs one-to-many mapping
      -processed a stream of streams of values
      -Does mapping and flattering.
      -performs data transformation from stream of stream to stream.
 */
public class MapFlatMap {

    public static void main(String[] args) {
        //implementing map() and flattering
        List<CustomerMap> customers = EkartDatabase.getAll(); //return a list of customers

        //List<CustomerMap> converting to List<String> using map() -> Data Transformation
        // customer->customer.getEmail() - is the mapping logic. - One-to-one mapping. i.e one customer has one email.
        List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emails);

        //To get phone numbers. customer -> customer.getPhoneNumbers(): this is a one-to-many scenario
        //1. using map
        List<List<String>> mobileNo = customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(mobileNo); // this returns unflattered data(Stream of stream data)

        //Solution: first do the flattering then do the mapping - flatMap() take input as a stream of stream
        List<String> flatteredMobileNo = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(flatteredMobileNo);

    }
}
