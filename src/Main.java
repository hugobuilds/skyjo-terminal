package src;

public class Main {

    public static void main(String[] args) {
        Carte carte1 = new Carte(-1);
        Carte carte2 = new Carte(0);
        Carte carte3 = new Carte(4);
        Carte carte4 = new Carte(8);
        Carte carte5 = new Carte(10);

        carte1.retourner();
        carte2.retourner();

        carte5.retourner();

        System.out.println(carte1);
        System.out.println(carte2);
        System.out.println(carte3);
        System.out.println(carte4);
        System.out.println(carte5);
    }
}
