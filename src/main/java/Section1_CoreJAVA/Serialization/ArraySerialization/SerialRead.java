package Section1_CoreJAVA.Serialization.ArraySerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialRead {

    public void read(Person[] person){

        try {
            FileInputStream inputStream = new FileInputStream("arrayOutput.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            for(Person person1 : person){
                System.out.println(objectInputStream.readObject());
            }

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

    }
}
