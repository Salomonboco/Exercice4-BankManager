public class Main {

    public static void main(String[] args) {

        // Création d'un CompteCourant
        CompteCourant cc = new CompteCourant("CC-001", 150000, 50000);
        System.out.println("=== Compte Courant ===");
        System.out.println("Compte : " + cc.getCompte());
        System.out.println("Solde  : " + cc.getSolde());
        System.out.println("Limite : " + cc.limite);

        // Modification via setter
        cc.setCompte("CC-999");
        cc.setSolde(200000);
        System.out.println("Après modification :");
        System.out.println("Compte : " + cc.getCompte());
        System.out.println("Solde  : " + cc.getSolde());

        // Création d'un CompteEpargne
        CompteEpargne ce = new CompteEpargne("CE-001", 500000, 3.5);
        System.out.println("\n=== Compte Epargne ===");
        System.out.println("Compte       : " + ce.getCompte());
        System.out.println("Solde        : " + ce.getSolde());
        System.out.println("Taux interet : " + ce.tauxInteret);

        // Création d'un CertificatDepot
        CertificatDepot cd = new CertificatDepot("CD-001", 1000000, 12);
        System.out.println("\n=== Certificat de Depot ===");
        System.out.println("Compte : " + cd.getCompte());
        System.out.println("Solde  : " + cd.getSolde());
        System.out.println("Duree  : " + cd.duree + " mois");
    }


}