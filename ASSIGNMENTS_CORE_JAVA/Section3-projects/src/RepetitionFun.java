import java.sql.SQLOutput;
import java.util.*;
public class RepetitionFun {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count1=0;
        //while-loop
        while(count1<=10)
        {
            System.out.println("current value: "+count1);
            count1++;
        }

        //Do-while loop
        count1=0;
        //semi-colon must with do-while pair looping
        do {
            System.out.println("current value: "+count1);
            count1++;
        }while (count1<=10);

        //FOR-loop
        count1=0;
        for(int i=0;i<=10;i++)
        {
            System.out.print(count1+" ");
            count1++;
        }

        //ASSIGNMENT/TASK:
        int number;
        System.out.println("Enter the number for assignment");
        number = sc.nextInt();
        int sum=0;
        while(number>=0)
        {
            if(number>=0)
            {
                sum+=number;
                number = sc.nextInt();
            }
        }
        System.out.println("Done with the assignment & the sum is "+sum);
    }
}
