package karlnoellecamille;
import java.util.ArrayList;
import java.util.List;

class Inventaire {
    private static Inventaire instance; 
    private List<Appareil> appareils;

    private Inventaire() {
        appareils = new ArrayList<>();
    }

    
    public static Inventaire getInstance() {
        if (instance == null) {
            instance = new Inventaire();
        }
        return instance;
    }

   
    public void ajouterAppareil(Appareil appareil) {
        appareils.add(appareil);
        System.out.println(appareil.nom + " ajouté à l'inventaire.");
    }

    
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
