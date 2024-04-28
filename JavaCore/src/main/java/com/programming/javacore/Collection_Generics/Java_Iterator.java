package com.programming.javacore.Collection_Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Java_Iterator {
    public static void main(String[] args) {

        List<String> listLanguages = new ArrayList();

        // add element to list
        listLanguages.add("Java");
        listLanguages.add("Python");
        listLanguages.add("PHP");
        listLanguages.add(".NET");
        listLanguages.add("C");
        listLanguages.add("C++");

        // print the list using Iterator
        System.out.println("List programming languages: ");
        Iterator<String> itr = listLanguages.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element);
        }

        // alter list language
        ListIterator<String> litr = listLanguages.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + " (CHANGED)");
        }


        System.out.println("List listLanguages after changed: ");
        itr = listLanguages.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element);
        }

        System.out.println();

        System.out.println("Print list with reverse order: ");
        while (litr.hasPrevious()) {
            String element = litr.previous();
            System.out.println(element);
        }
        System.out.println();

        // delete element C (CHANGED)
        litr = listLanguages.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            if ("C (CHANGED)".equals(element.toString())) {
                litr.remove();
            }
        }

        System.out.println("After alter listLanguages: ");
        itr = listLanguages.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element);
        }
        System.out.println();

    }
}

/*Java_Iterator : use print element*/