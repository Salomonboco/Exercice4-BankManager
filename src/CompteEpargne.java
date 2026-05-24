public class CompteEpargne extends CompteBancaire {

    public double tauxInteret;

    // Constructeur
    public CompteEpargne(String compte, double solde, double tauxInteret) {
        super(compte, solde);
        this.tauxInteret = tauxInteret;
    }

}