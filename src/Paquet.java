package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Paquet {

    private final List<Carte> cartes;

    public Paquet() {
        this.cartes = new ArrayList<>();
    }

    public void ajouterCarte(Carte carte) {
        cartes.add(carte);
    }

    public void melanger() {
        for (int i = 0; i < 3; i++) {
            Collections.shuffle(cartes);
        }
    }

    public Carte piocher() {
        if (cartes.isEmpty())
            return null;

        return cartes.removeFirst();
    }

    public int taille() {
        return cartes.size();
    }

    public Carte getCarte(int index) {
        if (index < 0 || index >= cartes.size())
            return null;

        return cartes.get(index);
    }


    public boolean estVide() {
        return cartes.isEmpty();
    }

    public void toutRetourner() {
        for (Carte carte : cartes) {
            carte.retourner();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Carte carte : cartes) sb.append(carte.toString()).append(" ");
        sb.append("\n");

        return sb.toString();
    }
}