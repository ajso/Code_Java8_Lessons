package sample.code.lessons.ArraysVsArrayList;

import java.util.ArrayList;
import java.util.Arrays;

//Arrays or ArrayList are used when you have just a group or collection of the same type of objects.
public class ArraysVsArrayListMain {

    public static void main(String[] args) {

//NOTE: Using/Declaring an Array. e.g array of Strings. 2.Arrays can hold primitive datatypes or Objects.

        //String[] friends = new String[5]; //5 - indicates the size of the array(this will hold 5 elements), it can't be changed once created.

        //Directly initializing the array with values.
        String[] friendsArray2 = {
                "Ecurut", "Francis", "Lukwago", "Richard", "Gloria", "Ahmed"
        };

//NOTE: Declaring an arrayList. ArrayLists do not have a fixed size. 2. ArrayList can only hold Objects.
        //ArrayList<String> friendsArrayList = new ArrayList<>();

        //Directly initializing values of the arrayList
        ArrayList<String> friendsArrayList2 = new ArrayList<>(
                Arrays.asList("Ecurut", "Francis", "Lukwago", "Richard", "Gloria", "Ahmed")
        );

//NOTE: Getting Values from and Array Vs getting values from an ArrayList.
        //Access with index.
        System.out.println(friendsArray2[1]); // accessing the 2nd element with arrays.

        //using ArrayList, we make a method call using get()
        System.out.println(friendsArrayList2.get(2)); //accessing the 3rd element.

//NOTE: Getting the size of the array.
        System.out.println(friendsArray2.length); // this will output the size of the arrays.
        System.out.println(friendsArrayList2.size()); // output the size of the arrayList.

//NOTE: Adding an element to the end of an array or the end of an arrayList.

        //ARRAYS have a fixed size. can't be increased. :(

        //With ArrayList, however.
        friendsArrayList2.add("ChrisLovel");
        System.out.println(friendsArrayList2.get(6)); // Adding an element to an arrayList.

        //setting an element.
        friendsArray2[0] = "David";
        System.out.println(friendsArray2[0] +" Added to an Array"); // setting a new name at index[0].

        //with ArrayList
        friendsArrayList2.set(0, "David");
        System.out.println(friendsArrayList2.get(0) + " Added to an arrayList"); // setting a new name at index[0] in arrayList.

//NOTE: Removing an element from an Array of arrayList.
        //We can't do this with arrays. we can't change the size of an array.
        //With ArrayList, However.
        friendsArrayList2.remove(1);
        System.out.println(friendsArrayList2 + " An element is removed from an arrayList");

//NOTE: Printing our arrays and arrayList
        //Arrays.
        for(int i=0; i<friendsArray2.length; i++){
            System.out.println(friendsArray2[i]);
        }












    }

}
