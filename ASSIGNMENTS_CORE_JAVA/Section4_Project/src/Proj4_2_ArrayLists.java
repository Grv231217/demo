import java.util.*;
//PROJECT TO REVERSE THE ARRAY LIST AFTER TAKING INPUT TILL A -VE NUMBER IS ENTERED
public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        ArrayList<Double> arrG = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double vr;
        System.out.println("Enter the value for respective operation or a -ve value to exit");
        vr = sc.nextDouble();
        while(vr>=0)
        {
            arrG.add(vr);
            System.out.println("Enter the value for respective operation or a -ve value to exit");
            vr = sc.nextDouble();
        }
        System.out.println("Printing the number is reverse order");
        for(int i=arrG.size()-1;i>-1;i--)
        {
            System.out.println(arrG.get(i));
        }
    }
}
