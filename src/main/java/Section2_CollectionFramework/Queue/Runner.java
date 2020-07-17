package Section2_CollectionFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Runner {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();

        for(int i=1;i<=8;i++)
        q.add(i);

        for(Integer val : q){
            System.out.println("Queue value = " + val);
        }

        System.out.println("Elements of Queue = " + q);
    }
}
