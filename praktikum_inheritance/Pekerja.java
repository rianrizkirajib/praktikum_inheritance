package praktikum_inheritance;
import java.util.Date;
public class Pekerja {
    private static final double BASE_SALARY = 10000.00;
    private String Name = "";
    private double Salary = 0.0;
    private Date birthDate;
   
    public Pekerja(String name, double salary, Date DoB){
        this.Name=name;
        this.Salary=salary;
        this.birthDate=DoB;
 }
    public Pekerja(String name,double salary){
        this(name,salary,null);
 }
    public Pekerja(String name, Date DoB){
        this(name,BASE_SALARY,DoB);
 }
    public Pekerja(String name){
        this(name,BASE_SALARY);
        
 }
    public String GetName(){ return Name;}
    public double GetSalary(){ return Salary; }
    public Date GetbirthDate(){return birthDate; }
}
class Manager extends Pekerja {
    
//menambahkan atribut untuk kelas manager
    
    private String department; 

    public Manager(String name, double salary, Date DoB) {
        super(name, salary, DoB);
    }
    public Manager(String n,String dept){
        super(n);
        department=dept;
 }
    public Manager(String dept, int par, String financial){
        super(dept);
        department=dept;
 }
    public String GetDept(){
        return department;
 }
}

 class TestManager {
    public static void main(String[] args) {
        Manager Utama = new Manager("Ahmad","Bagian Gudang");
        System.out.println("Name:"+ Utama.GetName());
        System.out.println("Salary:"+ Utama.GetSalary());
        System.out.println("Department:"+ Utama.GetDept());
        
        Utama = new Manager("Udin","Obe");
        System.out.println("Name:"+ Utama.GetName());
        System.out.println("Salary:"+ Utama.GetSalary());
        System.out.println("Department:"+ Utama.GetDept());
 }
}