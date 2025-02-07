package karlnoellecamille;

/**
 * Classe abstraite représentant un décorateur d'appareil.
 * Permet d'ajouter des fonctionnalités à un appareil existant.
 */
abstract class AppareilDecorator extends Appareil {
    protected Appareil appareil;

    /**
     * Constructeur du décorateur d'appareil.
     *
     * @param appareil l'appareil à décorer
     */
    public AppareilDecorator(Appareil appareil) {
        super(appareil.identifiant, appareil.nom, appareil.prixDeBase, appareil.type);
        this.appareil = appareil;
    }

    @Override
    public abstract String getDescription();

    @Override
    public abstract double getPrixFinal();
}

/**
 * Classe représentant l'option de sécurité pour un appareil.
 * Ajoute un coût pour l'installation d'un antivirus.
 */
class OptionSecurite extends AppareilDecorator {
    private double coutAntivirus = 50.0;

    /**
     * Constructeur de l'option de sécurité.
     *
     * @param appareil l'appareil à décorer avec l'option de sécurité
     */
    public OptionSecurite(Appareil appareil) {
        super(appareil);
    }

    @Override
    public String getDescription() {
        return appareil.getDescription() + " + Option Sécurité (Antivirus installé)";
    }

    @Override
    public double getPrixFinal() {
        return appareil.getPrixFinal() + coutAntivirus;
    }

    @Override
    public void activer() {
        // Logique pour activer l'option de sécurité si nécessaire
    }
}

/**
 * Classe représentant l'option de performance pour un appareil.
 * Ajoute un coût pour l'optimisation de la mémoire et des logiciels.
 */
class OptionPerformance extends AppareilDecorator {
    private double coutOptimisation = 100.0;

    /**
     * Constructeur de l'option de performance.
     *
     * @param appareil l'appareil à décorer avec l'option de performance
     */
    public OptionPerformance(Appareil appareil) {
        super(appareil);
    }

    @Override
    public String getDescription() {
        return appareil.getDescription() + " + Option Performance (Optimisation mémoire/logicielle)";
    }

    @Override
    public double getPrixFinal() {
        return appareil.getPrixFinal() + coutOptimisation;
    }

    @Override
    public void activer() {
        // Logique pour activer l'option de performance si nécessaire
    }
}