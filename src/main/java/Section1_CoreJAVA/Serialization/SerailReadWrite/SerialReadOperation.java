package Section1_CoreJAVA.Serialization.SerailReadWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialReadOperation {

    public void SerialRead(){

        try {
            FileInputStream fis = new FileInputStream("SerialWriter.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fis);

            /*System.out.println("Objects are :: ");
            System.out.println(objectInputStream.readObject());*/

            Person aPerson = (Person)objectInputStream.readObject();
            System.out.println("Reading Object -- " + aPerson);

            fis.close();
            objectInputStream.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Unable to find a file");
        } catch (IOException e) {
            System.out.println("Unable to read a file");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
