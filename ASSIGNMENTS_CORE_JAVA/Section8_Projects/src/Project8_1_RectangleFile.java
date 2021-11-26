import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Project8_1_RectangleFile {
    public static void main(String[] args) {
        Scanner sc1;
        try {
            sc1 = new Scanner(new File("RectangleData.txt"));
            int x=0,y=0;int ctr=0;
            while(sc1.hasNext())
            {
                x = sc1.nextInt();
                y = sc1.nextInt();
                Rectangle r = new Rectangle(x,y);
                System.out.println("Length is "+r.getLength());
                System.out.println("Width is "+r.getWidth());
                System.out.println("Area is "+r.area());
                System.out.println("Perimeter is "+2*(r.getWidth()+r.getLength()));
                System.out.println();
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("File not found !!");
        }
    }
}
