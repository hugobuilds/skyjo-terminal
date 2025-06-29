package src;

import java.util.*;

public class Jeu {
    private List<Joueur> joueurs;
    private Joueur gagnant;
    private Joueur perdant;
    private Map<Joueur, List<Integer>> scoresParPartie;

    public Jeu() {
        this.joueurs = new ArrayList<>();
        this.scoresParPartie = new HashMap<>();
        this.gagnant = null;
        this.perdant = null;
    }

    public void ajouterJoueur(Joueur joueur) {
        joueurs.add(joueur);
        scoresParPartie.put(joueur, new ArrayList<>());
    }

    public void enregistrerScores(Map<Joueur, Integer> scores) {
        for (Map.Entry<Joueur, Integer> entry : scores.entrySet()) {
            Joueur joueur = entry.getKey();
            int score = entry.getValue();
            scoresParPartie.get(joueur).add(score);
        }
        verifierFinDuJeu();
    }

    private void verifierFinDuJeu() {
        Map<Joueur, Integer> scoresTotaux = new HashMap<>();

        for (Joueur joueur : joueurs) {
            int total = scoresParPartie.get(joueur).stream().mapToInt(Integer::intValue).sum();
            scoresTotaux.put(joueur, total);
            if (total > 100 && perdant == null) {
                perdant = joueur;
            }
        }

        gagnant = joueurs.stream()
                .min(Comparator.comparingInt(j -> scoresTotaux.get(j)))
                .orElse(null);
    }

    public Joueur getGagnant() {
        return gagnant;
    }

    public Joueur getPerdant() {
        return perdant;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public Map<Joueur, List<Integer>> getScoresParPartie() {
        return scoresParPartie;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Historique des scores (par partie) :\n");

        sb.append(String.format("%-10s", "Partie"));
        for (Joueur joueur : joueurs) {
            sb.append(String.format("| %-10s", joueur.getNom()));
        }
        sb.append("\n");
        sb.append("-".repeat(12 + joueurs.size() * 13)).append("\n");

        int maxParties = scoresParPartie.values().stream()
                .mapToInt(List::size)
                .max()
                .orElse(0);

        for (int i = 0; i < maxParties; i++) {
            sb.append(String.format("%-10s", "Partie " + (i + 1)));
            for (Joueur joueur : joueurs) {
                List<Integer> scores = scoresParPartie.get(joueur);
                String score = i < scores.size() ? String.valueOf(scores.get(i)) : "";
                sb.append(String.format("| %-10s", score));
            }
            sb.append("\n");
        }

        // Ligne des totaux
        sb.append(String.format("%-10s", "Total"));
        for (Joueur joueur : joueurs) {
            int total = scoresParPartie.get(joueur).stream().mapToInt(Integer::intValue).sum();
            sb.append(String.format("| %-10d", total));
        }
        sb.append("\n");

        return sb.toString();
    }
}