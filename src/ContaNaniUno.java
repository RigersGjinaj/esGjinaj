import javax.lang.model.element.Name;

public class ContaNaniUno implements Runnable {

public ContaNaniUno(String name)
{
    super();
    
}   

public void run (){

System.out.println("SONO NEL THREAD");
for(int i=0;i<400;i++){
System.out.println(i+1);
}

}   
}
