//FIRST MAJOR ASSIGNMENT...
import java.util.Scanner;
public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n1,n2,n3;
        n1=inp.nextInt();
        n2=inp.nextInt();
        n3= inp.nextInt();
        int mean=(n1+n2+n3)/3;
        System.out.println("The mean is: "+mean);
    }
}
