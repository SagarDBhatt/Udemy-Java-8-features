package Section2_CollectionFramework.ComparatorInterface;

import java.util.Comparator;

public class sortByName implements Comparator<Person> {

    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
