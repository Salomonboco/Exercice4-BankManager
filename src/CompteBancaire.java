public class CompteBancaire {

    private String compte;
    private double solde;

    // Constructeur
    public CompteBancaire(String compte, double solde) {
        this.compte = compte;
        this.solde = solde;
    }

    // SETTER : guichet pour modifier le compte
    public void setCompte(String compte) {
        this.compte = compte;
    }

    // GETTER : caissier pour lire le compte
    public String getCompte() {
        return this.compte;
    }

    // SETTER : guichet pour modifier le solde
    public void setSolde(double solde) {
        if (solde >= 0) {
            this.solde = solde;
        }
    }

    // GETTER : caissier pour lire le solde
    public double getSolde() {
        return this.solde;
    }

}