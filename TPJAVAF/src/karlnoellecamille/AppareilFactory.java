package karlnoellecamille;

/**
 * Classe de fabrique pour créer des appareils.
 * Fournit une méthode statique pour instancier des objets de type Appareil.
 */
class AppareilFactory {
    
    /**
     * Crée un appareil en fonction du type spécifié.
     *
     * @param type le type de l'appareil (ORDINATEUR ou IMPRIMANTE)
     * @param identifiant l'identifiant de l'appareil
     * @param nom le nom de l'appareil
     * @param prixBase le prix de base de l'appareil
     * @return un objet de type Appareil
     * @throws IllegalArgumentException si le type d'appareil est inconnu
     */
    public static Appareil createAppareil(AppareilType type, String identifiant, String nom, double prixBase) {
        switch (type) {
            case ORDINATEUR:
                return new Ordinateur(identifiant, nom, prixBase);
            case IMPRIMANTE:
                return new Imprimante(identifiant, nom, prixBase);
            default:
                throw new IllegalArgumentException("Type d'appareil inconnu : " + type);
        }
    }
}