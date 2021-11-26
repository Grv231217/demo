import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.*;
public class FileInputJava {
    public static void main(String[] args) {
        Scanner infile;
        try {
           // FileReader fr= new FileReader("input.txt");
            infile = new Scanner(new File("input.txt"));
            int input;int sum=0;
            while(infile.hasNext())
            {

                input = infile.nextInt();
                sum+=(int)input;
            }
            System.out.print(sum);//Printing the result which has been asked in the assignment given along the video
            //fr.close();
        }
        catch ( FileNotFoundException ex)
        {
            System.out.println("cant find respective file");
            System.out.println(ex.getMessage());
        }
        catch ( InputMismatchException ex)
        {
            System.out.println("Mismatch data type found! ERROR");
        }
    }
}
