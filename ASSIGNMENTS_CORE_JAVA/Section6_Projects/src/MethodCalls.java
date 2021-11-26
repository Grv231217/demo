import java.util.*;
public class MethodCalls {
    public static void main(String[] args) {
        getSomething();
    }
    public static void getSomething()
    {
        System.out.println("In Get something");
        int result=getSomeValue();
        System.out.println("The result is "+result);
    }
    public static int getSomeValue()
    {
        return 150;
    }
}
