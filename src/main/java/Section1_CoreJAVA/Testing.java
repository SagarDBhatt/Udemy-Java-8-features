package Section1_CoreJAVA;

public class Testing {

    public int getMaxElement(Integer[] array){
        int temp =array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>temp)
                temp=array[i];
        }
        return temp;
    }

    public static void main(String[] args) {

        Integer[] testElement = {50,20,2,1};
        Integer[] testElement2 = {1};
        Integer[] testElement3 = {0,0,0};


        Testing obj = new Testing();

        if(obj.getMaxElement(testElement) == 50)
            System.out.println("Test passed");
        else
            System.out.println("Test failed");

        if(obj.getMaxElement(testElement2) == 0)
            System.out.println("Test passed");
        else
            System.out.println("Test failed");

        if(obj.getMaxElement(testElement3) == 0)
            System.out.println("Test passed");
        else
            System.out.println("Test failed");
    }
}
