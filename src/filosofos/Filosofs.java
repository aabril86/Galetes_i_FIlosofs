package filosofos;

public class Filosofs extends Thread{
    String nom;
    Cobert cd;
    Cobert ce;

    public Filosofs(String nom, Cobert cd, Cobert ce) {
        this.nom = nom;
        this.cd = new Cobert();
        this.ce = new Cobert();
    }

    public void run(){
        while(true){
            //menjar();
            //pensar();
        }
    }
}
