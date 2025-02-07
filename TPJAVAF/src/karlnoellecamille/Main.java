package karlnoellecamille;

public class Main {
    public static void main(String[] args) {
        
        Inventaire inventaire = Inventaire.getInstance();

        
        Appareil ordinateur = new Ordinateur("ORD123", "MacBook Pro", 1500.0);
        Appareil imprimante = new Imprimante("IMP456", "HP LaserJet", 300.0);

       
        inventaire.ajouterAppareil(ordinateur);
        inventaire.ajouterAppareil(imprimante);

    
        inventaire.afficherInventaire();

        
        inventaire.supprimerAppareil("IMP456");

        
        inventaire.afficherInventaire();

        
        Appareil ordinateurSecurise = new OptionSecurite(ordinateur);
        Appareil ordinateurOptimise = new OptionPerformance(ordinateurSecurise);

        
        System.out.println("\nDétails après personnalisation :");
        System.out.println(ordinateurOptimise.getDescription());
        System.out.println("Prix final : " + ordinateurOptimise.getPrixFinal() + "€");
    }
}