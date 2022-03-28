public class Campana implements Runnable {

    private String suono;
    private int volte;

    public Campana(String suono,int volte){
        this.suono=suono;
        this.volte=volte;
    }
    public void run(){
        for(int i=0;i<volte;i++){
            System.out.println((i+1)+"suono"+" ");
        }
    }
}
