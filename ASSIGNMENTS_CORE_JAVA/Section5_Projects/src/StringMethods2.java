import java.util.*;
//Implementing other String methods like toUpperCase, toLowerCase, isAtIndex, SubString
public class StringMethods2 {
    public static void main(String[] args) {
        String name = "GAURAV verma";
        String var;
        name = name.toUpperCase(Locale.ROOT);
        System.out.println("UPPER CASE TRANSFORMATION: "+name);
        name =name.toLowerCase(Locale.ROOT);
        System.out.println("LOWER CASE TRANSFORMATION: "+name);
        System.out.println("Index of first occurrence of v is "+name.indexOf('v'));
        System.out.println("Last 5 letters..."+name.substring(7));
    }
}
