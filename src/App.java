public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("sono nel main");
        
        Runnable i=new ContaNaniUno("pippo");
        Thread u=new Thread(i);
        u.start();

        Runnable y=new ContaNaniUno("pluto");
        Thread d=new Thread(i);
        d.start();

        
        System.out.println("finito main");

    }
}
