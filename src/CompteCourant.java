public class CompteCourant extends CompteBancaire {

    public double limite;

    // Constructeur
    public CompteCourant(String compte, double solde, double limite) {
        super(compte, solde);
        this.limite = limite;
    }

}