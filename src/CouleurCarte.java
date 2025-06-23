package src;

public enum CouleurCarte {

    BLEU_FONCE("\u001B[34m"),   // Bleu
    BLEU_CLAIR("\u001B[36m"),   // Cyan
    VERT("\u001B[32m"),         // Vert
    JAUNE("\u001B[33m"),        // Jaune
    ROUGE("\u001B[31m");        // Rouge

    private final String codeAnsi;

    CouleurCarte(String codeAnsi) {
        this.codeAnsi = codeAnsi;
    }

    public String getCodeAnsi() {
        return codeAnsi;
    }
}