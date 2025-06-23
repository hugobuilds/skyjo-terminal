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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int taille = main.taille();

        sb.append("👤 ").append(nom).append(" (Score: ").append(score).append(")\n");

        if (taille == 0) {
            sb.append("Plus aucune carte\n");
            return sb.toString();
        }

        int nbColonnes = taille / 3;

        for (int ligne = 0; ligne < 3; ligne++) {
            for (int col = 0; col < nbColonnes; col++) {
                int index = col * 3 + ligne;
                Carte carte = main.getCarte(index);

                String contenu = carte != null ? carte.toString() : " ";
                sb.append("[ ").append(padCenter(contenu)).append(" ] ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    private String padCenter(String s) {
        int padding = 3 - s.replaceAll("\u001B\\[[;\\d]*m", "").length();
        int left = padding / 2;
        int right = padding - left;
        return " ".repeat(left) + s + " ".repeat(right);
    }
}