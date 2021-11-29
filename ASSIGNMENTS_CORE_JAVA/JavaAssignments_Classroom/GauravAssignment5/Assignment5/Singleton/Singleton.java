package Gaurav.Assignment5.Singleton;

public class Singleton {
    String str;

    //EXPLANATION:
    /*here the method is static so this cannot be used as it refers to the current object in a class,
    and we know that class instance will not have access to this method which is static
     */
    public static Singleton fun(String name) {
//        this.str = name;
        return new Singleton();
    }

    public void print() {
        System.out.println(this.str);
    }
}

