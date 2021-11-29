import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text:");
        String str = scan.nextLine();
        if (Pattern.matches("[A-Z].*[.]", str)) {
            System.out.println("Given input matches with the regular expression");
        } else {
            System.out.println("Given input doesn't match with the regular expression");
        }
    }
}