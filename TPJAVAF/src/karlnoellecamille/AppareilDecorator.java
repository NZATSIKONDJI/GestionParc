package karlnoellecamille;

abstract class AppareilDecorator extends Appareil {
    protected Appareil appareil;

    public AppareilDecorator(Appareil appareil) {
        super(appareil.identifiant, appareil.nom, appareil.prixDeBase, appareil.type);
        this.appareil = appareil;
    }

    @Override
    public abstract String getDescription();

    @Override
    public abstract double getPrixFinal();
}

class OptionSecurite extends AppareilDecorator {
    private double coutAntivirus = 50.0;

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
		
		
	}
}

class OptionPerformance extends AppareilDecorator {
    private double coutOptimisation = 100.0;

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
		
		
	}
}
