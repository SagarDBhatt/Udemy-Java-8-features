package Section1_CoreJAVA.Serialization;

public class Runner {

    public static void main(String[] args) {
        Person aPerson = new Person();
        aPerson.setPersonName("Sam");
        aPerson.setPersonAge(25);
        aPerson.setPersonId(1);

        /*SerialWriteOperation serialWriteOperation = new SerialWriteOperation();
        serialWriteOperation.serialWrite(aPerson);*/

        SerialReadOperation serialReadOperation = new SerialReadOperation();
        serialReadOperation.SerialRead();
    }

}
