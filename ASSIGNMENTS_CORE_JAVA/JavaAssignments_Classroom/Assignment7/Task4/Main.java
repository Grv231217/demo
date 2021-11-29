package Assignment7.Task4;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Unicycle cycle1 = new Unicycle();
        cycle1.factories();
        Bicycle cycle2 = new Bicycle();
        cycle2.factories();
        Tricycle cycle3 = new Tricycle();
        cycle3.factories();
    }
}