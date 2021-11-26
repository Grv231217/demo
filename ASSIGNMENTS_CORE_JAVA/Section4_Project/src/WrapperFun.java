import java.util.*;
public class WrapperFun {
    public static void main(String[] args) {
        /*Arraylist stores the data dynamically,but it cannot be used with primitive type data. So we use
        wrapper classes*/
        //total 8 wrapper classes are there for each of the 8 primitive types.
        ArrayList<Integer> arrH=new ArrayList<Integer>();
        arrH.add(3);
        System.out.println(arrH.get(0));
        String str="457";
        int valU=Integer.parseInt(str);
        System.out.println(valU);

        //TASK: FOR DOUBLE
        String sr="3.14159";
        double vl=Double.parseDouble(sr);
        System.out.println(vl);
    }
}
