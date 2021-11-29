package Assignment7.Task2;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Cycle[] obj = new Cycle[]{new Unicycle(), new Bicycle(), new Tricycle()};
        Unicycle unicycle = (Unicycle)obj[0];
        unicycle.balance();
        Bicycle bicycle = (Bicycle)obj[1];
        bicycle.balance();
        Tricycle tricycle = (Tricycle)obj[2];
    }
}