package mv.sdd;

public class ActionRetrait implements Runnable{

    private Compte compte;

    public ActionRetrait(Compte compte) {
        super();
        this.compte = compte;
    }

    @Override
    public void run(){
        compte.retrait(200);
    }

}
