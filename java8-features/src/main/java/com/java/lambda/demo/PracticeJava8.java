package com.java.lambda.demo;

import java.util.*;

public class PracticeJava8 {

    public  static void main (String args[]){


        List<Integer> list= new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(14);

        Collections.sort(list); //Ascending
        System.out.println("here we are printing the list in ascending order "+list);
        Collections.reverse(list);//descending
        System.out.println("Printing the list in descending order"+list);

        //Here i am doing with the help of stream
        list.stream().sorted().forEach(t-> System.out.println("printing the list in the ascending" +
                "order with help of stream "+t));

        //Inorder to reverse the order with help of stream all we need to do is just to pass the comparator.reverse int he sorted pipeline method

        list.stream().sorted(Comparator.reverseOrder()).forEach(reversed ->
                System.out.println("List is in descending order with help of stream api "+reversed));




    }

}


