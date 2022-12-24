package Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Soru01 {

    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();
        myList.add("D");
        myList.add("U");
        myList.add("H");
        myList.add("A");
        myList.add("N");

        ListIterator<String> itr = myList.listIterator();

        while (itr.hasNext()){
            String el = itr.next();
            itr.set(el + "?");
        }
        System.out.println(myList);


    }

}