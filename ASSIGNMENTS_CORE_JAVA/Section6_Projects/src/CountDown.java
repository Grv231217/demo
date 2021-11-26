import java.util.*;
public class CountDown {
    public static void main(String[] args) {
        //countDownFrom(10);
        countUpTo(3,12);//Task given in video tutorial...
    }
    public static void countDownFrom(int num)
    {
        if(num>=0)
        {
            System.out.println("On count..."+num);
            countDownFrom(num-1);
        }
    }
    public static void countUpTo(int q,int r)
    {
        if(q<=r)
        {
            System.out.println("On count..."+q);
            countUpTo(q+1,r);
        }
    }
}
