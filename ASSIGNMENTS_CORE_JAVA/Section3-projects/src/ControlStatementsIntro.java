import java.util.*;

//Control statements explanation....
public class ControlStatementsIntro {
    public static void main(String[] args) {
        /*there are 2 types of control statements as shown below */

        /*1)sequential control statements.
        These are the one's that follow the common sequence/flow in which the program statements are
        written.The example for it as shown below:*/
        int number;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        System.out.println("The entered value is "+number);


        /*2)decision based control statements:
        These include the commonly used if-else, and switch statements where there is specific decision
        involved while going along with the flow of the code.
         */
        int age=15;
        if(age>16)
        {
            System.out.println("You can Drive!");
        }
        else
        {
            System.out.println("You Cannot Drive!");
        }

        /*3)Loops based control flow:
        This includes repetition of some selective statements, and are used when requirement arises of
         repetition of a set of statements a number of times.
         */
        for(int i=0;i<5;i++)
        {
            System.out.println("Current value is "+i);
        }
    }
}
