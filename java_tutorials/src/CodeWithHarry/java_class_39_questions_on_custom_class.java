package CodeWithHarry;
import java.util.Scanner;
class Employee1 {
    public Scanner scan = new Scanner(System.in);
    int id;
    String full_name;
    String nick_name;
    int Salary;

    public void print_all_Details() {
        System.out.println("Employee id is " + id);
        System.out.println("name = " + full_name);
        System.out.println("nick name = " + nick_name);
        System.out.println("Salary = " + Salary);
    }

    public String getFullName() {
        return full_name;
    }

    public String getNickName() {
        return nick_name;
    }

    public int getSalary() {
        return Salary;
    }

    public int getId() {
        return id;
    }

    public void set_name(String setname) {
        full_name = setname;
    }
}
class cell_phone{
    public void ring(){
        System.out.println("Phone is ringing");
    }
    public void vibrate(){
        System.out.println("Phone is vibrating");
    }
    public void OnFlash(){
        System.out.println("Flash is on");
    }
}
class square{
    public int area(int side){
        return side*side;
    }
    public int perimeter(int perimeter){
        return 4*perimeter;
    }
}
class rectangle{
    public int area(int a, int b){
        return a*b;
    }
    public int perimeter(int a, int b){
        int sum = a+b;
        int c = 2 * sum;
        return c;
    }
}
class game{
    public void fire(){
        System.out.println("fire on enemy");;
    }
    public void run(){
        System.out.println("run to make strike");;
    }
    public void hit(){
        System.out.println("hit on enemy");;
    }
}
class circle{
    public static float pi = 3.14f;
    public float area(float radius){
        return (pi * radius);
    }
    public float circumference(float radius){
        return 2*pi*radius;
    }
}
public class java_class_39_questions_on_custom_class {
    public static void main(String[] args) {
/*
        //problem 01
      Employee1 tarun = new Employee1();
      tarun.full_name = "TARUN VAISHNAV";
      tarun.nick_name = "tarun007";
        tarun.id = 98;
        tarun.Salary = 60000;
        tarun.set_name("hero tarun");
        tarun.print_all_Details();

        //problem 02
        cell_phone r9pr5g = new cell_phone();
        r9pr5g.vibrate();
        r9pr5g.ring();
        r9pr5g.OnFlash();
        //problem 03
         square sq = new square();
        System.out.println("perimeter of square is " + sq.area(2));
        System.out.println("perimeter of square is " + sq.perimeter(4));

        //problem 04
                    rectangle rec = new rectangle();
        System.out.println("area of rectangle " + rec.area(4,2));
        System.out.println("preimeter of rectangle " + rec.perimeter(4,2));
        System.out.println();

        //problem 06
        circle cir = new circle();
        System.out.println("area of circle is " + cir.area(4));
        System.out.println("circumference of circle is " + cir.circumference(4));

*/
        game player = new game();
        player.fire();
        player.hit();
        player.run();
    }
}
