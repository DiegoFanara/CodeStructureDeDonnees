package mv.sdd;

public class ActionDepot implements Runnable{

    private Compte compte;

    public ActionDepot(Compte compte) {
        super();
        this.compte = compte;
    }

    @Override
    public void run(){
        compte.depot(500);
    }

}
