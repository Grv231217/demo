import java.util.*;
//implementation of different string methods

public class StringMethods1 {
    public static void main(String[] args) {
        String name1="Gaurav";
        String name2="Gaurav";
        String name3="Varaug";
        String name4="gaurav";
        /* we know very well that strings are referenced data types and thus they store memory address
        rather than  string values. So using comparison operators directly would not work. Thus we need
        other string methods for comparison and other work. Like charat(), equals(), compareTo().
         */
        for(int i=0;i<name1.length();i++)
        {
            System.out.println(name1.charAt(i)+" ");
        }
        if(name1.equals(name4))
        {
            System.out.println("name1 == name4");
        }
        if(name2.compareTo(name3)>0)
        {
            System.out.println("name2 >= name3");
        }
        else
        {
            System.out.println("name2 < name3");
        }
    }
}
