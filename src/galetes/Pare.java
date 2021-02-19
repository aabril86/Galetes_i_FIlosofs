package galetes;

public class Pare extends Thread{

    Pot pot;

    public Pare(Pot pot, String nom) {
        super(nom);
        this.pot = pot;
    }

    public void run(){
        while(true) {
            pot.posarGaletes();
            System.out.println(getName() + " omple el pot");
        }
    }
}
