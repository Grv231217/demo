import java.util.*;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter the Integer");
        number = sc.nextInt();
        if(number%3==0)
        {
            System.out.println(number+" is divisible by 3");
        }
        else
        {
            System.out.println(number+" is not divisible by 3");
        }
    }

}
