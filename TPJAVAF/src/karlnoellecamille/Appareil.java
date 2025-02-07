package karlnoellecamille;


enum AppareilType {
    ORDINATEUR,
    IMPRIMANTE,
    SCANNER
}


abstract class Appareil {
    protected String identifiant;
    protected String nom;
    protected double prixDeBase;
    protected AppareilType type;


    public Appareil(String identifiant, String nom, double prixDeBase, AppareilType type) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prixDeBase = prixDeBase;
        this.type = type;
    }

    
    public abstract void activer();
    
    public abstract String getDescription();
    
    public double getPrixFinal() {
        return prixDeBase; 
}
}

class Ordinateur extends Appareil {

    
    public Ordinateur(String identifiant, String nom, double prixDeBase) {
        super(identifiant, nom, prixDeBase, AppareilType.ORDINATEUR);
    }

    
    @Override
    public void activer() {
        System.out.println(nom + " (ID: " + identifiant + ") démarre avec son système d'exploitation.");
    }

  
    @Override
    public String getDescription() {
        return "Type : " + type + ", Nom : " + nom + ", Prix de base : " + prixDeBase + "€";
    }
}


class Imprimante extends Appareil {

   
    public Imprimante(String identifiant, String nom, double prixDeBase) {
        super(identifiant, nom, prixDeBase, AppareilType.IMPRIMANTE);
    }

    
    @Override
    public void activer() {
        System.out.println(nom + " (ID: " + identifiant + ") s'allume et effectue un test d'impression.");
    }

    
    @Override
    public String getDescription() {
        return "Type : " + type + ", Nom : " + nom + ", Prix de base : " + prixDeBase + "€";
    }
}


