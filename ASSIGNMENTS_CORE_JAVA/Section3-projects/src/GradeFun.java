import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);
        switch (grade)
        {
            case 'a':
            case 'A':
                System.out.println("Excellent!");
                break;

            case 'b':
            case 'B':
                System.out.println("Good!");
                break;

            case 'c':
            case 'C':
                System.out.println("You can do better");
                break;

            case 'd':
            case 'D':
                System.out.println("you are about to fail");
                break;

            case 'e':
            case 'E':
                System.out.println("you are failed!");
                break;

            default:
                System.out.println("Invalid Entry!");
                break;
        }
    }
}
