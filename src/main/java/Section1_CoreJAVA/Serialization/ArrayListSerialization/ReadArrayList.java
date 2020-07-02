package Section1_CoreJAVA.Serialization.ArrayListSerialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadArrayList {

    static ArrayList<Person> arrayList = new ArrayList<>();

    public static void readArrayList(){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("ArrayListPerson"));

            Person aPerson;
            //ArrayList<Person> arrayList = new ArrayList<>();

            while((aPerson  = (Person) objectInputStream.readObject())!=null){
                  arrayList.add(aPerson);
            }

        }
        catch (EOFException e){
            print();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void print(){
        for(Person p : arrayList){
            System.out.println("Person Object == " + p);
            //System.out.println("1111");
        }
    }
}
