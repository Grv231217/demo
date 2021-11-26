import java.util.*;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        String[] firstName = new String[5];
        String[] lastName = new String[5];
        String str1,str2;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("enter the first name: ");
            str1 = sc.nextLine();
            System.out.println("enter the last name: ");
            str2 = sc.nextLine();
            firstName[i] = str1;
            lastName[i] = str2;
            System.out.println();
        }
        System.out.println("The output is : ");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.println("Name is "+firstName[i]+" "+lastName[j]);
            }
        }
    }
}
