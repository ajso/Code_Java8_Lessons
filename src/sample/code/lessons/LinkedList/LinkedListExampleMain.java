package sample.code.lessons.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExampleMain {

    public static void main(String[] args) {
        //These classes are both members of the java collection framework. they both implement the list interface.
        //LinkedList of names
        LinkedList<String> namesLinkedList = new LinkedList<>();
        //adding to a linkedList
        namesLinkedList.add("Andrew");
        namesLinkedList.add("Francis");
        namesLinkedList.add("Innocent");
        namesLinkedList.add("Carol");

        //comparing with arrayLists. all with the same method call.
        ArrayList<String> namesArrayList = new ArrayList<>();
        //Adding to an arrayList
        namesArrayList.add("Curt");
        namesLinkedList.add("Jackie");
        namesLinkedList.add("Joseph");
        namesLinkedList.add("Omar");

//NOTE: Implementation.
        //printing from a linkedList
        System.out.println(namesLinkedList.get(3)); //element at index 0.

        //Similarly, printing from an arrayList.
        System.out.println(namesArrayList.get(0)); //element at index 1.


//NOTE: Differencese. 1. in arraylist getting an item from the list is faster.
//                    2. in a linkedList adding items to a list is faster

//NOTE: Choice of usage depends on the amount of data the application will hold.
// LinkedLists for large data apps(adding data at the begining and the end kind).


    }
}
