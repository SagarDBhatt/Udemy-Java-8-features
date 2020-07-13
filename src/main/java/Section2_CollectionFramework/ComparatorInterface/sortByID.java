package Section2_CollectionFramework.ComparatorInterface;

import java.util.Comparator;

public class sortByID implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {

        if(o1.getId() <= o2.getId())
            return -1;
        else
            return 1 ;
    }
}
