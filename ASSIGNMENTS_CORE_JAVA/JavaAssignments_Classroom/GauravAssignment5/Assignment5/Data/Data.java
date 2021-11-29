package Gaurav.Assignment5.Data;

public class Data {
    int memberVariable1;
    char memberVariable2;

    public static void main(String[] args) {

    }
    public void printClassVariables()
    {
        System.out.println(memberVariable1);
        System.out.println(memberVariable2);
    }
    public void printLocalVariables()
    {
        int localVar1;char localVar2;
//        System.out.println(localVar1);
//        System.out.println(localVar2);
        /* EXPLANATION: You are using an uninitialized variable within a method and Java requires those
         to be initialized before you use them. They don’t get a default value. Class member variables
          and static variables do get a default value but not variables used within your method code. */
    }
}
