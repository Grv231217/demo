import java.util.*;
//implementation of array based first assignment/project
public class Proj4_1_Arrays {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Taking Input...");
        for(int i=0;i<5;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("Giving Output by multiplying each with 2...");
        for(int val:array)
        {
            System.out.println(val*2);
        }
    }
}
