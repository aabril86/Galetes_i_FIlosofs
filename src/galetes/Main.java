package galetes;

public class Main {
    public static void main(String[] args) {
        Pot pot = new Pot();

        Pare Pepe = new Pare(pot, "Pepe");
        Fill Joan = new Fill(pot, "Joan");
        Fill Anna = new Fill(pot, "Anna");

        Pepe.start();
        Joan.start();
        Anna.start();
    }
}
