package Section1_CoreJAVA.Serialization.ArraySerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialRead {

    public void read(){

        try {
            FileInputStream inputStream = new FileInputStream("arrayOutput.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            System.out.println("Reading Object Successfully!!!");

            Person[] aPerson1 = (Person[]) objectInputStream.readObject();

            for(Person person1 : aPerson1){
                System.out.println(person1);
            }

            inputStream.close();
            objectInputStream.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
/*        finally {
            inputStream.close();
        }*/
    }// end of read(Person[] person)
}
