package Section2_CollectionFramework.ComparatorInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import java.util.*;

public class RunnerClass {

    public static void main(String[] args) {
        Person p1 = new Person(1,25,"Sam");

        ArrayList<Person> listPerson = new ArrayList<Person>();
        listPerson.add(p1);
        listPerson.add(new Person(2,28,"Rob"));
        listPerson.add(new Person(3,30,"Dan"));
        listPerson.add(new Person(4,29,"Lynn"));

        ArrayList list = new ArrayList();

        list.add(12);
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(4);


        Collections.sort(list);

        System.out.println("After Sorting List (with single param:  ");
        for(Object a : list){
            System.out.println(a);
        }

        //Collections.sort(listPerson);

        //Implement sortByName class to sort the objects by class name
        Collections.sort(listPerson,new sortByName());

        System.out.println("After Sorting by Name");
        for(Person p : listPerson)
        {
            System.out.println(p);
        }

//Sort the objects based on ID:

        Collections.sort(listPerson,new sortByID());

        System.out.println("After sorting by ID");

        for(Person p2 : listPerson){
            System.out.println(p2);
        }



    }
}
