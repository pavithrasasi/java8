package com.bct.java8featureslambda;
import java.util.ArrayList;
import java.util.List;
public class Importassignment{
    public static void main(String[] args) {
//        create a collection
        List<String> name = new ArrayList<String>();
//        Create an integer based collection and check the even and odd numbers
//        using lambda and stream.
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(13);
        numbers.add(2);
        numbers.add(87);
        
        numbers.stream().forEach(i -> {
           if (i.intValue() % 2 == 0)
           {System.out.println("number is even");;}
           else {System.out.println("number is odd");;}});
    }
}



