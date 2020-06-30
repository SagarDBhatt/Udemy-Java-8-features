package Section1_CoreJAVA.Serialization.ArraySerialization;

import java.io.*;
import java.util.ArrayList;

public class SerialWrite {

   public void writeArray(Person[] personArray){

       try {
           FileOutputStream fos = new FileOutputStream(new File("arrayOutput.txt"));
           ObjectOutputStream outputStream = new ObjectOutputStream(fos);

           for(Person p : personArray){
               outputStream.writeObject(p);
           }

           outputStream.close();
           fos.close();
       }
       catch (FileNotFoundException e) {
           e.printStackTrace();
       }
       catch (IOException e) {
           e.printStackTrace();
       }

   }//End of writeArray(Person[] personArray)

    public void writeArrayList(ArrayList<Person> arrayList){

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("ArrayListPerson.bin"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            for(Person p : arrayList){
                objectOutputStream.writeObject(p);
                System.out.println("File Write Successful!!!");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
