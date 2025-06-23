package src;

public class Main {

    public static void main(String[] args) {
        Paquet paquet = new Paquet();

        for (int i = 0; i < 5; i++) paquet.ajouterCarte(new Carte(-2));
        for (int i = 0; i < 10; i++) paquet.ajouterCarte(new Carte(-1));
        for (int i = 0; i < 15; i++) paquet.ajouterCarte(new Carte(0));

        for (int valeur = 1; valeur <= 12; valeur++) {
            for (int i = 0; i < 10; i++) {
                paquet.ajouterCarte(new Carte(valeur));
            }
        }

        paquet.melanger();
        System.out.println(paquet);
    }
}
