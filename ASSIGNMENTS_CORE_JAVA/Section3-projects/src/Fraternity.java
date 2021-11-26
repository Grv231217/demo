import java.util.*;

//Implementing
public class Fraternity {
    public static void main(String[] args) {
        System.out.println("Welcome to the university....");
        Scanner sc = new Scanner(System.in);
        char gender;int age;
        System.out.println("Kindly let us know your age...");
        age = sc.nextInt();
        System.out.println("And also your gender please...M/F");
        gender = sc.next().charAt(0);
        if(age>=19 && gender=='M')
        {
            System.out.println("Congrats! you are eligible to join the fraternity...");
        }
        else
        {
            System.out.println("Sorry, you are not eligible to join the fraternity...");
        }
    }
}
