import java.util.*;
//Another minor project/assignment on array list....
public class proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrNames = new ArrayList<>();
        ArrayList<Integer> arrAge = new ArrayList<>();
        String name;
        int age;
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter the name: ");
            name = sc.nextLine();
            System.out.print("Enter the age: ");
            age = sc.nextInt();
            sc.nextLine();
            arrNames.add(name);
            arrAge.add(age);
        }
        System.out.println("Printing the results");
        for(int i=0;i<5;i++)
        {
            System.out.println(arrNames.get(i)+" is "+arrAge.get(i)+" years old");
        }
    }
}
