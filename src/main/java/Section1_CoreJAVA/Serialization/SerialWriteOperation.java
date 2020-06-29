package Section1_CoreJAVA.Serialization;

import java.io.*;

public class SerialWriteOperation {

    public void serialWrite(Person aPerson){

        try {
            FileOutputStream fout = new FileOutputStream(new File("SerialWriter.txt"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);

            objectOutputStream.writeObject(aPerson);

            objectOutputStream.close();
            fout.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("Unable to write a file");
        } catch (IOException e) {
            System.out.println("Unable to generate a writable file");
            e.printStackTrace();

        }

    }
}
