import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class FileOutputFun {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        String str;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            str = sc.nextLine();
            arr.add(str);
        }
        try {
            PrintWriter pw = new PrintWriter("output.txt");
            for(String st:arr)
            {
                pw.println(st);
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
