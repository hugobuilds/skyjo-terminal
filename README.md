# Skyjo - Version Java (Affichage Terminal)

Projet de développement en Java d’une version textuelle du jeu de cartes **Skyjo**, jouable dans le terminal. Ce projet a vocation à évoluer vers une version web par la suite.

## Objectif du jeu

Skyjo se joue en plusieurs manches. Chaque joueur essaie d’avoir le score **le plus bas possible**.  
Dès qu’un joueur atteint **100 points ou plus**, la partie s’arrête. Le joueur avec **le plus petit total** gagne.

---

## Fonctionnalités prévues (v1 - terminal)

- [ ] Création et gestion des joueurs
- [ ] Distribution des cartes (12 cartes en grille 4x3 par joueur)
- [ ] Affichage texte des cartes visibles / cachées + couleurs (pour l'esthétisme)
- [ ] Système de tour par joueur (piocher, échanger, retourner)
- [ ] Règle spéciale : 3 cartes identiques dans une colonne = colonne retirée
- [ ] Fin de manche, décompte des points
- [ ] Gestion du score global
- [ ] Fin de partie : score ≥ 100, victoire au plus bas score

---

## Structure du jeu (extrait des règles officielles)

- **Cartes** : de -2 à 12
- **Nombre total** : 150 cartes
    - -2 (x5), -1 (x10), 0–12 (x15 ou x10 selon valeur)

### Déroulement d’une manche :
1. Chaque joueur reçoit 12 cartes, posées face cachée en grille 4x3.
2. On retourne 2 cartes visibles au choix.
3. Le joueur ayant la somme **la plus élevée** commence.
4. À chaque tour :
    - Choix 1 : piocher une carte visible (de la défausse) → échange direct avec une des 12 cartes de son jeu (la mettre face visible).
    - Choix 2 : piocher une carte face cachée (de la pioche) → la garder (échange) ou la défausser.
    - Si une colonne contient 3 cartes identiques, elle est retirée immédiatement.

5. Une manche se termine lorsqu’un joueur a révélé toutes ses cartes.
6. Tous les autres joueurs jouent **encore un tour**.

### Décompte :
- Somme des cartes visibles.
- Si le joueur qui a terminé la manche n’a **pas** le plus petit score → **son score est doublé**.
- Les points sont ajoutés au total global.

---

## Lancer le jeu

```bash
reste encore à determiner