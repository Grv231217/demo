import java.util.*;
public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            arr.add(i+23);
        }
        System.out.println("The sum of elements in the liast is :"+SumOfElements(arr));
    }
    public static int SumOfElements(ArrayList<Integer> arr)
    {
        int sum=0;
        for(int x:arr)
        {
            sum+=x;
        }
        return sum;
    }
}
