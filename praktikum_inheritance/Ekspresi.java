package praktikum_inheritance;
public class Ekspresi {
    protected String getEkspresi(){
        return "Manis";
    }
    public void speak(){
        System.out.println("Saya itu "+getEkspresi());
    }
}