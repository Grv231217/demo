import java.util.*;

//Implementation of random class
public class RandomFun {
    public static void main(String[] args) {
        Random rn = new Random();
        int myRandomNumber;
        myRandomNumber = rn.nextInt();
        System.out.println(myRandomNumber);
        myRandomNumber = rn.nextInt(1000);
        System.out.println(myRandomNumber);
        myRandomNumber = rn.nextInt(1000)+10000;
        System.out.println(myRandomNumber);
    }
}
