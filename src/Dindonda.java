import java.lang.Runnable;

public class Dindonda {
public static void main(String[] args) {
for(int r=0;r<3;r++){
Thread i=new Thread(new Campana("din", 5));

i.start();
try {
    i.sleep(0);
} catch (Exception e) {
    System.out.println(e.getMessage());
}


Thread y=new Thread(new Campana("don",5));

y.start();
try {
    y.sleep(500);
} catch (Exception e) {
    System.out.println(e.getMessage());
}

Thread t=new Thread(new Campana("dan",5));

t.start();
try {
    t.sleep(1000);
} catch (Exception e) {

    System.out.println(e.getMessage());
}

}
}
}
