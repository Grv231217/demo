import java.util.*;
public class funWith2DArrays {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        fill2dArray(arr);
        print2dArray(arr);
        twice2dArray(arr);
        print2dArray(arr);
    }
    public static void fill2dArray(int[][] arr)
    {
        Random rn = new Random();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = rn.nextInt(100);
            }
        }
    }
    public static void print2dArray(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    //TASK GIVEN IN VIDEO TUTORIAL....
    public  static void twice2dArray(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]*=2;
            }
        }
    }
}
