package Section1_CoreJAVA.Serialization.ArrayListSerialization;

import java.util.ArrayList;

public class RunnerArrayList {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<Person>();

        personArrayList.add(new Person(1,"Pat",50));
        personArrayList.add(new Person(2,"kev",60));
        personArrayList.add(new Person(3,"Sam", 26));

        WriteArrayList.writeArrayList(personArrayList);
        ReadArrayList.readArrayList();

    }
}
