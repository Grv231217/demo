import java.util.Scanner;
public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String adjective1,girls_Name,adjective2,occupation1,place,clothing,hobby,adjective3,occupation2;
        String boysName,mansName;
        System.out.println("Enter an adjective ");
        adjective1=sc.nextLine();
        System.out.println("What is the girl's name?");
        girls_Name= sc.nextLine();
        System.out.println("Enter another adjective");
        adjective2=sc.nextLine();
        System.out.println("what's your occupation?");
        occupation1=sc.nextLine();
        System.out.println("which place do you live at?");
        place=sc.nextLine();
        System.out.println("let us know the type od clothing ");
        clothing=sc.nextLine();
        System.out.println("kindly enter your hobby");
        hobby=sc.nextLine();
        System.out.println("Enter another adjective ");
        adjective3= sc.nextLine();
        System.out.println("Mention any other occupation if any ");
        occupation2= sc.nextLine();
        System.out.println("Enter a boysName ");
        boysName=sc.nextLine();
        System.out.println("Enter a mansName");
        mansName=sc.nextLine();
        System.out.println("There once was a "+adjective1+ "girl named "+girls_Name+" who was a "+adjective2+" " +
                occupation1+" in the Kingdom of " +place+" She loved to wear "+clothing+" and to "+hobby+", see " +
                "that was a problem. So, that's what we " +
                "should have" +" done. She wanted to marry the "+adjective3+" "+occupation2+" named +"+boysName+
                ", but her father, King " +
                mansName+", forbade her from seeing him.");
    }
}
