import java.util.*;
//ASSIGNMENT FOR CONTINUE-BREAK
public class ContinueBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ctr=0;
        //Printing even numbers through 10, usage of break & continue.
        while(ctr<=10)
        {
            if(ctr%2!=0)
            {
                ctr+=1;
                continue;
            }
            System.out.println("EVEN: "+ctr);
            ctr+=1;
        }
    }
}
