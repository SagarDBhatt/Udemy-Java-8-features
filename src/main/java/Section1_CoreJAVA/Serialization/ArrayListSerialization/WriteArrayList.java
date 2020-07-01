package Section1_CoreJAVA.Serialization.ArrayListSerialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteArrayList {

    public static void writeArrayList(ArrayList<Person> aPerson){

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("ArrayListPerson"));

            for(Person p : aPerson){
                objectOutputStream.writeObject(p);
            }
            System.out.println("File Write successful!!");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
