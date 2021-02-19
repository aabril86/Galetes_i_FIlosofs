package galetes;

public class Fill extends Thread{
    Pot pot;

    public Fill(Pot pot, String nom) {
        super(nom);
        this.pot = pot;
    }

    public void run(){


            while(pot.getGaletes() > 0) {

                pot.agafarGaletes();
                System.out.println(getName() + " ha agafat galetes: " + pot.getGaletes());
                pot.setGaletes(pot.getGaletes() - 1);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                pot.deixaPot();
                System.out.println(getName() + " deixa el pot de galetes");
            }


    }
}
