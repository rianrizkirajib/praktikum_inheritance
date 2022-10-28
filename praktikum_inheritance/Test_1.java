package praktikum_inheritance;
class Mobil {
    public int x = 5;
}
class Motor extends Mobil {
    public int x =10;
    public void Info(int x) {
        System.out.println("Nilai x sebagai parameter = " + x);
        System.out.println("Data member x di class Motor = " + this.x);
        System.out.println("Data member x di class Mobil = " + super.x);
 }
}
public class Test_1 {
    public static void main(String args[]) {
        Motor test = new Motor();
        test.Info(20);
 }
}