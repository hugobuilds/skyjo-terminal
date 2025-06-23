package src;

public class Joueur {

    private final String nom;
    private int score;
    private final Paquet main;

    public Joueur(String nom) {
        this.nom = nom;
        this.score = 0;
        this.main = new Paquet();
    }

    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }
    public Paquet getMain() {
        return main;
    }

    public void ajouterScore(int points) {
        this.score += points;
    }

    public void afficherMain() {
        int taille = main.taille();

        if (taille == 0) {
            System.out.println(nom + " : Plus aucune carte");
            return;
        }

        int nbColonnes = taille / 3;

        System.out.println("Main de " + nom + " (" + taille + " cartes)");

        for (int ligne = 0; ligne < 3; ligne++) {
            for (int col = 0; col < nbColonnes; col++) {
                int index = col * 3 + ligne;
                Carte carte = main.getCarte(index);
                System.out.print("[ " + carte + " ]" + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    @Override
    public String toString() {
        return nom + " (Score: " + score + ")";
    }
}