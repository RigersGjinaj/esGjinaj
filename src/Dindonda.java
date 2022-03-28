import java.lang.Runnable;

public class Dindonda {
public static void main(String[] args) {

new Thread(new Campana("din", 5)).start();
new Thread(new Campana("don",5)).start();

}
}
