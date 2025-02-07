package karlnoellecamille;

class AppareilFactory {
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