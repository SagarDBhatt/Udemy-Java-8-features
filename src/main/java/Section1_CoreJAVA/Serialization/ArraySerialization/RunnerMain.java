package Section1_CoreJAVA.Serialization.ArraySerialization;

import Section1_CoreJAVA.Serialization.SerialReadOperation;

public class RunnerMain {
    public static void main(String[] args) {
        Person[] aPerson = {new Person(1,"Sam",10), new Person(2, "Ram", 20), new Person(3, "Fam",30)};
        SerialWrite writeObject = new SerialWrite();

        writeObject.writeArray(aPerson);

        SerialRead readObject = new SerialRead();
        readObject.read(aPerson);
    }
}
