import java.util.*;

//ASSIGNMENT BASED UPON RANDOM CLASS
public class DiceSimulation {
    public static void main(String[] args) {
        Random rn = new Random();
        int myRandomNumber;
        System.out.println("WELCOME TO DICE SIMULATION....");
        for(int i=0;i<10;i++)
        {
            System.out.println("Iteration no "+i);
            myRandomNumber = rn.nextInt(7);
            System.out.println("Dice throws outcome is.. "+myRandomNumber);
        }
    }

}
