import java.util.*;
public class Project3_3_GuessTheNumber {
    public static void main(String[] args) {
        Random rn = new Random();
        int systemsNumber;
        systemsNumber = rn.nextInt(100);
        int number=-1;
        Scanner sc = new Scanner(System.in);
        int count=0;
        while(number!=systemsNumber)
        {
            count+=1;
            System.out.println("Guess the Integer...");
            number = sc.nextInt();
            if(number==systemsNumber)
            {
                System.out.println("Congratulations! you guessed the right number in "+count+" guesses");
            }
            else
            {
                if(number<systemsNumber)
                {
                    System.out.println("Your guess is too low!");
                }
                else
                {
                    System.out.println("Your guess is too high!");
                }
            }
        }
    }
}
