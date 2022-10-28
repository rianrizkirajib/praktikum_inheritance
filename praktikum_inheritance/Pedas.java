package praktikum_inheritance;
public class Pedas extends Ekspresi{
   
    protected String getSad(){
        return "Pedas";
    }
    public void cry(){
        System.out.println("HAAAAAAAAAH : "+ getSad());
 }
}