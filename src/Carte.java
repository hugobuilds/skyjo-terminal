package src;

public class Carte {

    private final int valeur;
    private final CouleurCarte couleur;
    private boolean visible;

    public Carte(int valeur) {
        this.valeur = valeur;
        this.couleur = determinerCouleur(valeur);
        this.visible = false;
    }

    private CouleurCarte determinerCouleur(int valeur) {
        if (valeur <= -1) return CouleurCarte.BLEU_FONCE;
        else if (valeur == 0) return CouleurCarte.BLEU_CLAIR;
        else if (valeur <= 4) return CouleurCarte.VERT;
        else if (valeur <= 8) return CouleurCarte.JAUNE;
        else return CouleurCarte.ROUGE;
    }

    public int getValeur() {
        return valeur;
    }

    public CouleurCarte getCouleur() {
        return couleur;
    }

    public boolean estVisible() {
        return visible;
    }

    public void retourner() {
        this.visible = true;
    }

    @Override
    public String toString() {
        if (!visible)
            return "✖";

        String gras = "\u001B[1m";
        String reset = "\u001B[0m";

        return couleur.getCodeAnsi() + gras + String.format("%2d", valeur) + reset;
    }
}