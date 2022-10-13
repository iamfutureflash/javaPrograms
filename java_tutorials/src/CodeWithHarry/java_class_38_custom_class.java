package CodeWithHarry;
 class Employee{
 int id;
 String full_name;
 String nick_name;
 int Salary;
public void print_all_Details(){
    System.out.println("Employee id is " + id);
    System.out.println("name = " + full_name);
    System.out.println("nick name = " + nick_name);
    System.out.println("Salary = " + Salary);
}
public String getFullName(){
return full_name;
}
public String getNickName(){
return nick_name;
}
public int getSalary(){
return Salary;
}
public int getId(){
return id;
}
}
public class java_class_38_custom_class {
    public static void main(String[] args) {
       Employee tarun = new Employee();
       tarun.id = 01;
       tarun.full_name = "Tarun Vaishnav";
       tarun.nick_name = "tarun007";
       tarun.Salary = 50000;
       tarun.print_all_Details();
        Employee puneet = new Employee();
        puneet.id = 02;
        puneet.full_name = "Puneet Vaishnav";
        puneet.nick_name = "iamfutureflash";
        puneet.Salary = 100000;
        puneet.print_all_Details();
    }
}
