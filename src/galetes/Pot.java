package galetes;

public class Pot {
    private int galetes = 10;
    private boolean lliure;


    public Pot(){
        lliure = true;
    }

    public synchronized void agafarGaletes(){
        try{
            while(!lliure || galetes == 0) wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        lliure = false;
        notifyAll();
    }

    public synchronized void deixaPot(){
        lliure = true;
        notifyAll();
    }

    public int getGaletes() {
        return galetes;
    }

    public void setGaletes(int galetes) {
        this.galetes = galetes;
    }

    public synchronized void posarGaletes(){
        try{
            while (!lliure || galetes > 0) wait();
            lliure = false;
            galetes = 10;
            lliure = true;
            notifyAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
