package sample.code.lessons.Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamMainMethods {

    public static void main(String[] args) throws IOException {
        //1.---integer Stream
        IntStream.range(1,10).forEach(System.out::print);
        System.out.println();

        //2.---integer Stream with a skip()
        IntStream.range(1,10).skip(5).forEach(x->System.out.print(x)); //skip() skips the first 5 elements of the stream.
        System.out.println(); //blank line
        //3.---integer Stream with a sum()
        System.out.println(IntStream.range(1,5).sum());

        //4. Stream.of, sorted and findFirst()
        Stream.of("Ava", "Andrew", "Denis", "Aneri", "Alberot")
                .sorted().findFirst().ifPresent(System.out::print);
        System.out.println(); //blank line

        //5.---Stream from Array,Sort, filter and print.
        String[] names ={"Ava", "Andrew", "Denis", "Aneri", "Alberot", "Ankit", "Habert","Amanda", "Hans", "Shivanka", "Silvia"};
        Arrays.stream(names).filter(x->x.startsWith("S")).sorted().forEach(System.out::println);
        System.out.println(); //blank line
        //or
        Stream.of(names).filter(x->x.startsWith("S")).sorted().forEach(System.out::println);
        System.out.println(); //blank line

        //6.---the average of squares of an integer array.
        Arrays.stream(new int[]{2,4,6,8,10}).map(x->x*x).average().ifPresent(System.out::println);
        System.out.println(); //blank line

        //7.---Stream from a List, filter and print
        List<String> people = Arrays.asList("Ava", "Andrew", "Denis", "Aneri", "Alberot", "Ankit", "Habert","Amanda", "Hans", "Shivanka", "Silvia");
        people.stream().map(String::toLowerCase).filter(x->x.startsWith("a")).forEach(System.out::println);// forEach is a terminal operation.
        System.out.println();

        //8.---Rows from a text file. sort, filter and print.
        Stream<String> bands = Files.lines(Paths.get("bands.txt"));
        bands.sorted().filter(x->x.length() > 13).forEach(System.out::println);
        bands.close();
        System.out.println();

        //9.---Stream rows from text file and save to list
        List<String> bands2 = Files.lines(Paths.get("bands.txt")).filter(x->x.contains(" terminal"))
                .collect(Collectors.toList());
        bands2.forEach(x->System.out.print(x));
        System.out.println();

        //10.---Stream rows from a csv file and count
        Stream<String> rows1= Files.lines(Paths.get("data.txt"));
        int rowCount = (int)rows1.map(x->x.split(",")).filter(x->x.length == 3).count();
        System.out.println(rowCount + " rows.");
        rows1.close();

        //11.---
        // 11. Stream rows from CSV file, parse data from rows
        Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
        rows2
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));
        rows2.close();

        // 12. Stream rows from CSV file, store fields in HashMap
        Stream<String> rows3 = Files.lines(Paths.get("data.txt"));
        Map<String, Integer> map = new HashMap<>();
        map = rows3
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])));
        rows3.close();
        for (String key : map.keySet()) {
            System.out.println(key + "  " + map.get(key));
        }

        // 13. Reduction - sum
        double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, (Double a, Double b) -> a + b);
        System.out.println("Total = " + total);

        // 14. Reduction - summary statistics
        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
                .summaryStatistics();
        System.out.println(summary);
    }
}
