package praktikum_inheritance;
public class Pegawai {
       public String nama;
    public double gaji;
}

class Manajer extends Pegawai {
    public String departemen;
    
    public void IsiData(String n, String d){
        nama=n;
        departemen=d;
    } 
}