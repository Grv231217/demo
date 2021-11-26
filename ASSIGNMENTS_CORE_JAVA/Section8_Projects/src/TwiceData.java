import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class TwiceData {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("nums.txt"));
            int x;
            PrintWriter pw = new PrintWriter("twice_nums.txt");
            while(sc.hasNext())
            {
                x = sc.nextInt();
                pw.println(2*x);
            }
            sc.close();
            pw.close();
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("File not found!");
        }
    }
}
