package karlnoellecamille;

/**
 * Enum représentant les différents types d'appareils.
 */
enum AppareilType {
    ORDINATEUR,
    IMPRIMANTE,
    SCANNER
}

/**
 * Classe abstraite représentant un appareil.
 * Chaque appareil a un identifiant, un nom, un prix de base et un type.
 */
abstract class Appareil {
    protected String identifiant;
    protected String nom;
    protected double prixDeBase;
    protected AppareilType type;

    /**
     * Constructeur de la classe Appareil.
     *
     * @param identifiant l'identifiant de l'appareil
     * @param nom le nom de l'appareil
     * @param prixDeBase le prix de base de l'appareil
     * @param type le type de l'appareil
     */
    public Appareil(String identifiant, String nom, double prixDeBase, AppareilType type) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prixDeBase = prixDeBase;
        this.type = type;
    }

    /**
     * Active l'appareil.
     */
    public abstract void activer();

    /**
     * Renvoie une description de l'appareil.
     *
     * @return la description de l'appareil
     */
    public abstract String getDescription();

    /**
     * Renvoie le prix final de l'appareil.
     *
     * @return le prix de base de l'appareil
     */
    public double getPrixFinal() {
        return prixDeBase; 
    }
}

/**
 * Classe représentant un ordinateur, qui est un type d'appareil.
 */
class Ordinateur extends Appareil {

    /**
     * Constructeur de la classe Ordinateur.
     *
     * @param identifiant l'identifiant de l'ordinateur
     * @param nom le nom de l'ordinateur
     * @param prixDeBase le prix de base de l'ordinateur
     */
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

/**
 * Classe représentant une imprimante, qui est un type d'appareil.
 */
class Imprimante extends Appareil {

    /**
     * Constructeur de la classe Imprimante.
     *
     * @param identifiant l'identifiant de l'imprimante
     * @param nom le nom de l'imprimante
     * @param prixDeBase le prix de base de l'imprimante
     */
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