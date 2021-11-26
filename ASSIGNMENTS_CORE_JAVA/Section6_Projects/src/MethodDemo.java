import java.util.*;
public class MethodDemo {
    public static void main(String[] args) {
        mthd();
        mthd1("gaurav");
        System.out.println(giveMe99());
        System.out.println(sum(2,3));
        System.out.println("Enter the number whose square is required...");
        Scanner sc = new Scanner(System.in);
        double k = sc.nextDouble();
        System.out.println("The square of the entereed number is "+square(k));
    }
    //void method with no parameters...
    public static void mthd()
    {
        System.out.println("checking method");
    }

    //void method with paramters...
    public static void mthd1(String str)
    {
        System.out.println(str+" is smart");
    }

    //return method with no parameter
    public static int giveMe99()
    {
        return 99;
    }

    //return method with parameters
    public static int sum(int a,int b)
    {
        return a+b;
    }

    //TASK GIVEN IN THE TUTORIAL
    public static double square(double q)
    {
        return q*q;
    }
}
