import java.util.*;
public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("seattle");

        str.append("is just awesome");
        System.out.println(str);

        str.insert(7," at ");
        System.out.println(str);

        str.replace(1,3,"grv");
        System.out.println(str);

        str.delete(1,3);
        System.out.println(str);
    }
}
