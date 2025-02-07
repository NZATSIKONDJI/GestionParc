package karlnoellecamille;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe singleton représentant un inventaire d'appareils.
 * Permet d'ajouter, de supprimer et d'afficher des appareils.
 */
class Inventaire {
    private static Inventaire instance; 
    private List<Appareil> appareils;

    private Inventaire() {
        appareils = new ArrayList<>();
    }

    /**
     * Retourne l'instance unique de la classe Inventaire.
     *
     * @return l'instance d'Inventaire
     */
    public static Inventaire getInstance() {
        if (instance == null) {
            instance = new Inventaire();
        }
        return instance;
    }

    /**
     * Ajoute un appareil à l'inventaire.
     *
     * @param appareil l'appareil à ajouter
     */
    public void ajouterAppareil(Appareil appareil) {
        appareils.add(appareil);
        System.out.println(appareil.nom + " ajouté à l'inventaire.");
    }

    /**
     * Supprime un appareil de l'inventaire par son identifiant.
     *
     * @param identifiant l'identifiant de l'appareil à supprimer
     */
    public void supprimerAppareil(String identifiant) {
        for (Appareil appareil : appareils) {
            if (appareil.identifiant.equals(identifiant)) {
                appareils.remove(appareil);
                System.out.println(appareil.nom + " supprimé de l'inventaire.");
                return; 
            }
        }
        System.out.println("Aucun appareil trouvé avec l'ID : " + identifiant);
    }

    /**
     * Affiche tous les appareils de l'inventaire.
     */
    public void afficherInventaire() {
        if (appareils.isEmpty()) {
            System.out.println("L'inventaire est vide.");
        } else {
            System.out.println("Inventaire des appareils :");
            for (Appareil appareil : appareils) {
                System.out.println(appareil.getDescription());
            }
        }
    }
}