public class Main {

    public static void main(String[] args) {

        // Création d'un CompteCourant
        CompteCourant cc = new CompteCourant("CC-001", 150000, 50000);
        System.out.println("=== Compte Courant ===");
        System.out.println("Compte : " + cc.compte);
        System.out.println("Solde  : " + cc.solde);
        System.out.println("Limite : " + cc.limite);

        // Création d'un CompteEpargne
        CompteEpargne ce = new CompteEpargne("CE-001", 500000, 3.5);
        System.out.println("=== Compte Epargne ===");
        System.out.println("Compte       : " + ce.compte);
        System.out.println("Solde        : " + ce.solde);
        System.out.println("Taux interet : " + ce.tauxInteret);

        // Création d'un CertificatDepot
        CertificatDepot cd = new CertificatDepot("CD-001", 1000000, 12);
        System.out.println("=== Certificat de Depot ===");
        System.out.println("Compte : " + cd.compte);
        System.out.println("Solde  : " + cd.solde);
        System.out.println("Duree  : " + cd.duree + " mois");

    }

}