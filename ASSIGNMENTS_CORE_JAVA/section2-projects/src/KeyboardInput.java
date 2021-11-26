//Implementing scanner class
import  java.util.Scanner;
public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        String name;
        System.out.println("What is your name? ");
        name=keyboard.nextLine();

        int age;
        System.out.println("what is your age? ");
        age=keyboard.nextInt();
        keyboard.nextLine();

        String city;
        System.out.println("Which city do you live in? ");
        city= keyboard.nextLine();

        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("City is "+city);

//        //ASSIGNMENT...
//        int number;
//        number= keyboard.nextInt();
//        number*=2;
//        System.out.println("Entered number is "+number);
    }
}
