import java.util.*;
//Implementation of method overloading
public class MethodOverloading {
    public static void main(String[] args) {
        int q=getResult(1);
        System.out.println("The result is "+q);
        q=getResult(1,2);
        System.out.println("The result is "+q);
        q=getResult(3,"4");
        System.out.println("The result is "+q);
        String str=getResult("gaurav","verma");
        System.out.println("The result is "+str);
    }
    public static int getResult(int q)
    {
        return 2*q;
    }
    public static int getResult(int q,int r)
    {
        return q*r;
    }
    public static int getResult(int q,String r)
    {
        return q*Integer.parseInt(r);
    }
    public static String getResult(String q,String r)
    {
        return q+r;
    }
}
