package praktikum_inheritance;
public class Inher_Ovrid {
    
public static void main(String[] args) {
    Guru objectGuru = new Guru();
    Murid objectMurid = new Murid();
    


objectGuru.a=1;
objectGuru.b=1;
System.out.println("Object Guru (Superclass)            :");
objectGuru.show_variabel();

objectMurid.c=5;
System.out.println("Object Murid (Superclass dari Guru) :");
objectMurid.show_Variabel();
}
}