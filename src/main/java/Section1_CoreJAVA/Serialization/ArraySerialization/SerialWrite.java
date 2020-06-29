package Section1_CoreJAVA.Serialization.ArraySerialization;

import java.io.*;

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

   }

}
