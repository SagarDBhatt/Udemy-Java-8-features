package Section2_CollectionFramework.ComparatorInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RunnerClass {

    public static void main(String[] args) {
        Person p1 = new Person(1,25,"Sam");

        ArrayList<Person> listPerson = new ArrayList<Person>();
        listPerson.add(p1);
        listPerson.add(new Person(2,28,"Rob"));
        listPerson.add(new Person(3,30,"Dan"));
        listPerson.add(new Person(4,29,"Lynn"));

        //Not possible as Person object has three fields, Dev needs to define based on which field to sort using Comparator interface.
        //Collections.sort(listPerson);

        Collections.sort(listPerson,new SortByAge());

        for(Person p : listPerson){
            System.out.println(p);
        }
    }
}
