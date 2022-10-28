package praktikum_inheritance;
public class Senang extends Ekspresi{
    
    protected String getSenang(){
        return"Senang";
    }
    public void laugh(){
        System.out.println("Hahaha : " + getSenang());
 }
}