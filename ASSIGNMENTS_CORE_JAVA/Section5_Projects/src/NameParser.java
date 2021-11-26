import java.util.*;
public class NameParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName;String lastName;String name;
        System.out.println("Kindly enter your first & last name");
        name = sc.nextLine();
        int x=0;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)==' ')
            {
                x=i;
                break;
            }
        }
        firstName=name.substring(0,x);
        lastName=name.substring(x+1,name.length());
        System.out.println(firstName.toUpperCase(Locale.ROOT));
        System.out.println(lastName.toLowerCase(Locale.ROOT));

    }
}
