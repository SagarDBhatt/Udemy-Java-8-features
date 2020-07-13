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

        //Collections.sort(listPerson);

          


    }
}
