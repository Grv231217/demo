import java.util.*;
//Implementation of array
public class ArrayFun {
    public static void main(String[] args) {
        int[] arr;
        //Again array are reference data type, as they store the memory address where actual data is stored
        //more specifically they store the Byte address.
        arr=new int[5];
        arr[0]=12;
        arr[1]=4;
        arr[2]=54;
        arr[3]=2;
        //If one tries to access the array larger the specified boundary, then they will get out of bound
        //exception
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("new one..");
        arr[4]=23;
        //another way of printing..
        for(int num:arr)
        {
            System.out.println(num);
        }
    }
}
