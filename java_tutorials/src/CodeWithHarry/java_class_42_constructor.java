package CodeWithHarry;
class employee_1{
    private int id;
    private String name;

    public employee_1(){id = 01;name = "your name";}
    public employee_1(int myid, String myname){ id = myid;name = myname;}
    public employee_1(int myid){ id = myid;}
    public employee_1(String myname){ name = myname;}
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}
public class java_class_42_constructor {
    public static void main(String[] args) {
        employee_1 tarun = new employee_1(24,"puneet vaishnav");
//        tarun.setName("puneet");
//        tarun.setId(24);
        System.out.println("id and name is "+ tarun.getId() + " " + tarun.getName());

    }
}
