package p01_query_builder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //query_builder
        Scanner input = new Scanner(System.in);
        query_builder q1 = new query_builder();

        System.out.println("insert field name");
        String inner1 = input.next();

        System.out.println("insert table name");
        String inner2 = input.next();

        System.out.println("insert your condition");
        String inner3 = input.next();

        q1.select(inner1).from(inner2).where(inner3).print();
    }
}
