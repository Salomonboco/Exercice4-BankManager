public class CertificatDepot extends CompteBancaire {

    public int duree;

    // Constructeur
    public CertificatDepot(String compte, double solde, int duree) {
        super(compte, solde);
        this.duree = duree;
    }

}