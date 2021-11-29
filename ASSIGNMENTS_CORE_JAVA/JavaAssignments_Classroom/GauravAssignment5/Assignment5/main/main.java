package Gaurav.Assignment5.main;
import Gaurav.Assignment5.Singleton.Singleton;
import Gaurav.Assignment5.Data.Data;
public class main {

    public static void main(String[] args) {
        Data data = new Data();
        data.printClassVariables();
        data.printLocalVariables();
        Singleton single = Singleton.fun("Shivkesh");
        single.print();
    }
}
