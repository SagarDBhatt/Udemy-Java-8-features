package Section1_CoreJAVA.Serialization.ArraySerialization;

import java.io.*;

public class SerialRead {

    public void readArray(){

        try {
            FileInputStream inputStream = new FileInputStream("arrayOutput.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            System.out.println("Reading Object Successfully!!!");

            Person aPerson;
            while((aPerson = (Person) objectInputStream.readObject()) != null){
                System.out.println(aPerson);
            }

            inputStream.close();
            objectInputStream.close();
        }
        catch (FileNotFoundException e) {
           // e.printStackTrace();
            System.out.println("File Not Found Exception");
        }
        catch (EOFException e){
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch(ClassCastException e){
            System.out.println("Unable to cast the class Person!!");
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

/*        finally {
            inputStream.close();
        }*/
    }// end of read(Person[] person)
}
