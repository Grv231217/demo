import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class NamesAges {
    public static void main(String[] args) {
        Scanner sc1;
        try {
            sc1 = new Scanner(new File("name.txt"));
            //sc1 = new Scanner(new File("name.txt"));
            Scanner sc2 = new Scanner(new File("age.txt"));
            PrintWriter pw = new PrintWriter("nameAge.txt");
            int ag;String str;
            while(sc1.hasNext())
            {
                str = sc1.nextLine();
                ag = sc2.nextInt();
                pw.println(str+" is "+ag+" years of age");
            }
            sc1.close();
            sc2.close();
            pw.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found!");
        }
        catch(InputMismatchException ex)
        {
            System.out.println("mismatch!");
        }
    }
}
