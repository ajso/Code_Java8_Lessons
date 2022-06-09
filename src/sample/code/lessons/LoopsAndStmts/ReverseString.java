package sample.code.lessons.LoopsAndStmts;

import java.util.Locale;
import java.util.Scanner;

/*
============Algorithm========

 */
public class ReverseString {

    public static String StringReverser(){
        StringBuilder builder = new StringBuilder("Boy");
        builder.reverse();

        return builder.toString();
    }

    public static void main(String[] args) {

        System.out.println(StringReverser());


    }
}
