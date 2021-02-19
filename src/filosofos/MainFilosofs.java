package filosofos;

public class MainFilosofs {
    public static void main(String[] args) {
        Cobert c0 = new Cobert();
        Cobert c1 = new Cobert();
        Cobert c2 = new Cobert();
        Cobert c3 = new Cobert();

        Filosofs descartes = new Filosofs("Descartes",c0, c1);
        Filosofs platon = new Filosofs("Platón",c1, c2);
        Filosofs niche = new Filosofs("Niche",c2, c3);
        Filosofs anaximenes = new Filosofs("Anaxímedes",c3, c0);

        descartes.start();
        platon.start();
        niche.start();
        anaximenes.start();
    }




}
