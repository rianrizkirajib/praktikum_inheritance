package praktikum_inheritance;
public class Murid extends Guru{
    int c;
public void show_Variabel(){
    System.out.println("NIlai a="+ super.a);
    System.out.println("NIlai b="+ super.b);
    System.out.println("NIlai c="+ c);
}
}