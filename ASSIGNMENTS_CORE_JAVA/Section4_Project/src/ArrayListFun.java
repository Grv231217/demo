import java.util.*;
//Implementation of Array list ...
public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String> arrL=new ArrayList<>();
        arrL.add("Gaurav");
        arrL.add("varaug");
        arrL.add("varun");
        arrL.add("rounak");
        for(int i=0;i<arrL.size();i++)
        {
            System.out.println(arrL.get(i));
        }
        //TASK GIVEN :; to use an enhanced for loop instead
        for(String val:arrL)
        {
            System.out.println(val);
        }
    }
}
