package Assignment7;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[]{new Mouse(), null, null};
        rodent[0].info();
        rodent[1] = new Gerbil();
        rodent[1].info();
        rodent[2] = new Hamster();
        rodent[2].info();
    }
}