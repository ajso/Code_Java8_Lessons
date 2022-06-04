package sample.code.lessons.Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
DAO - Data access Object.

 */
public class BookDAO {

//Getting these from the database.
    public static List<Books> listAll(){

        List<Books> books = new ArrayList<>();
        books.add(new Books(21, "Core Java", 245));
        books.add(new Books(23, "Big Data", 120));
        books.add(new Books(22, "Understanding Mechanics", 545));
        books.add(new Books(24, "Python Programming", 320));

        return books;

//        return Stream.of(
//                new Books(21, "Core Java", 245),
//                new Books(23, "Big Data", 120),
//                new Books(22, "Understanding Mechanics", 545),
//                new Books(24, "Python Programming", 320)
//        ).collect(Collectors.toList());

    }
}
