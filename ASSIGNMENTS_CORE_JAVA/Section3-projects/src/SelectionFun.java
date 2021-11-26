import java.util.Scanner;
public class SelectionFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age ;
        System.out.println("Welcome To pub & Grills");
        System.out.println("What is your age??");
        age = sc.nextInt();
        if(age>=21)
        {
            System.out.println("Here, you can have a beer..");
        }
        else if(age>=16)
        {
            System.out.println("You can have a coke..But still atleast you can drive");
        }
        else
        {
            System.out.println("you can have coke");
        }
    }
}
