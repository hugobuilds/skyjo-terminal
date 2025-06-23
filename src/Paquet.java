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
        Collections.shuffle(cartes);
    }

    public Carte piocher() {
        if (cartes.isEmpty())
            return null;

        return cartes.removeFirst();
    }

    public int taille() {
        return cartes.size();
    }

    public boolean estVide() {
        return cartes.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Carte carte : cartes) {
            carte.retourner();
            sb.append(carte.toString()).append(" ");
        }

        return sb.toString();
    }
}