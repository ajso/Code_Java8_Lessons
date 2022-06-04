package sample.code.lessons.Lambdas;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

/*
This will return the books base in the sorting order.
 */
public class BookService {


    public List<Books> getBooksInSort(){
        //create an object of the DAO
        List<Books> bk = new BookDAO().listAll();
//        Collections.sort(bk, new MyComparator());

        //Instead of a traditional way we can use lambda to compare using the comparator interface.
//        Collections.sort(bk, new Comparator<Books>() {
//            @Override
//            public int compare(Books o1, Books o2) {
//                return o1.getBook_name().compareTo(o2.getBook_name()); //sorted by name.
//            }
//        });

        //This also works fine.
//        Collections.sort(bk, ((o1, o2) ->o1.getBook_name().compareTo(o2.getBook_name()) ));

        //Or This also works fine.
        Collections.sort(bk, (Comparator.comparing(Books::getBook_name)));

        return bk;
    }

    public static void main(String[] args) {
        List<Books> booksInSort = new BookService().getBooksInSort();
        System.out.println(booksInSort);
    }

}

//inner class to do the sorting. Using a traditional way to compare. customer comparator.
//class MyComparator implements Comparator<Books> {
//
//    @Override
//    public int compare(Books o1, Books o2) {
//        //The logic for the sorting implementation. based on the name.
//        return o1.getBook_name().compareTo(o2.getBook_name()); //sorted by name.
//    }
//}
