package mv.sdd;

public class Compte {
    private double solde;

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void depot(double montant) {
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        solde += montant;
    }

    public void retrait(double montant){

        if (montant < solde) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            solde -= montant;
        }

    }

}
