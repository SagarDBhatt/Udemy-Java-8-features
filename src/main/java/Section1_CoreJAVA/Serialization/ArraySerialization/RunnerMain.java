package Section1_CoreJAVA.Serialization.ArraySerialization;

import Section1_CoreJAVA.Serialization.SerialReadOperation;

import java.util.ArrayList;

public class RunnerMain {
    public static void main(String[] args) {
        Person[] aPerson = {new Person(1,"Sam",10), new Person(2, "Ram", 20), new Person(3, "Fam",30)};

        ArrayList<Person> arraylistPerson = new ArrayList<Person>();
        arraylistPerson.add(new Person(1,"A",10));
        arraylistPerson.add(new Person(2,"B",20));

        SerialWrite writeObject = new SerialWrite();
       // writeObject.writeArray(aPerson);

        writeObject.writeArrayList(arraylistPerson);

        SerialRead readObject = new SerialRead();
        //readObject.read(aPerson);
    }
}
