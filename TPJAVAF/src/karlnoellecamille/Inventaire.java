package karlnoellecamille;
import java.util.HashMap;
import java.util.Map;

class Inventaire {
    private static Inventaire instance;
    private Map<String, Appareil> appareils; 

    private Inventaire() {
        appareils = new HashMap<>();
    }

    public static Inventaire getInstance() {
        if (instance == null) {
            instance = new Inventaire();
        }
        return instance;
    }

    public void ajouterAppareil(Appareil appareil) {
        appareils.put(appareil.identifiant, appareil);
        System.out.println(appareil.nom + " ajouté à l'inventaire.");
    }

    public void supprimerAppareil(String identifiant) {
        if (appareils.containsKey(identifiant)) {
            System.out.println(appareils.get(identifiant).nom + " supprimé de l'inventaire.");
            appareils.remove(identifiant);
        } else {
            System.out.println("Aucun appareil trouvé avec l'ID : " + identifiant);
        }
    }

    public void afficherInventaire() {
        if (appareils.isEmpty()) {
            System.out.println("L'inventaire est vide.");
        } else {
            System.out.println("Inventaire des appareils :");
            for (Appareil appareil : appareils.values()) {
                System.out.println(appareil.getDescription());
            }
        }
    }
}