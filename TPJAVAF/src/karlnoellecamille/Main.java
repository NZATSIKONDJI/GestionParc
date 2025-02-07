package karlnoellecamille;

/**
 * Classe principale de l'application.
 * Contient la méthode main pour tester les fonctionnalités de l'inventaire et des appareils.
 */
public class Main {
    public static void main(String[] args) {
        // test1
        System.out.println("=== Test de l'Inventaire (Singleton) ===");
        Inventaire inventaire = Inventaire.getInstance();

        // test2
        System.out.println("\n=== Création des appareils via la Factory ===");
        Appareil ordinateur1 = AppareilFactory.createAppareil(AppareilType.ORDINATEUR, "ORD123", "MacBook Pro", 1500.0);
        Appareil imprimante1 = AppareilFactory.createAppareil(AppareilType.IMPRIMANTE, "IMP456", "HP LaserJet", 300.0);
        Appareil ordinateur2 = AppareilFactory.createAppareil(AppareilType.ORDINATEUR, "ORD789", "Dell XPS", 1800.0);

        // test 3
        inventaire.ajouterAppareil(ordinateur1);
        inventaire.ajouterAppareil(imprimante1);
        inventaire.ajouterAppareil(ordinateur2);

        inventaire.afficherInventaire();

        // test 4
        System.out.println("\n=== Suppression d'un appareil ===");
        inventaire.supprimerAppareil("IMP456");
        inventaire.afficherInventaire();

        // test 5
        System.out.println("\n=== Personnalisation d'un appareil avec le Decorator ===");

        Appareil ordinateurSecurise = new OptionSecurite(ordinateur1); 
        Appareil ordinateurOptimise = new OptionPerformance(ordinateurSecurise); 

        System.out.println(ordinateurOptimise.getDescription());
        System.out.println("Prix final : " + ordinateurOptimise.getPrixFinal() + "€");
    }
}