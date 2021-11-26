import java.util.*;
public class HouseDemo {
    public static void main(String[] args) {
        House obj1 = new House();
        House obj2 = new House();
        obj1.setColor("blue");
        obj1.setNumStories(123);
        obj1.setNumWindows(23);
        printHouseData(obj1);//IMPLEMENTED THE TASK GIVEN IN TUTORIAL ....
//        System.out.println("My house details are "+obj1.getColor()+" "+obj1.getNumStories()+" "+obj1.getNumWindows());
        obj2.setNumStories(123);
        obj2.setNumWindows(23);
        printHouseData(obj2);//IMPLEMENTED THE TASK GIVEN IN TUTORIAL ....
//        System.out.println("My house details are "+obj2.getColor()+" "+obj2.getNumStories()+" "+obj2.getNumStories());
    }
    public static void printHouseData(House obj)
    {
        System.out.println("Number of stories are "+obj.getNumStories());
        System.out.println("Number of windows are "+obj.getNumWindows());
        System.out.println("And the house color is "+obj.getColor());
    }
}
