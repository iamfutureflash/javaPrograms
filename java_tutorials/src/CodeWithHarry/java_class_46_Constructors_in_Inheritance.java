package CodeWithHarry;
class Base1{
    public Base1() {
        System.out.println("I am a constructor of base 1");
    }
    int difference(int x ,int y){
        return x-y;
    }
    public Base1(int x , int y) {
        System.out.println("I am a constructor of base 1 with ");
        System.out.println("difference between x and y is "+ difference(x,y));
    }
}
class Derived1 extends Base1{
Derived1(){
        System.out.println("i am a constructor of derived 1");
    }
    int multiply(int x, int y){
    return x*y;
    }
    Derived1(int x, int y){
        super(x,y);
        System.out.println("i am a constructor of derived 1");
        System.out.println("multiply is " + multiply(x,y));
    }
}
class child1 extends Derived1{
    public child1() {
        System.out.println("hi i am constructor of child 1");
    }
    public int sum(int x, int y){
        return x+y;
    }
    public child1(int x, int y)
    {
        super(x,y);
        System.out.println("hi i am constructor of child 1");
        System.out.println("sum is " + sum(x,y));
    }
}
public class java_class_46_Constructors_in_Inheritance {
    public static void main(String[] args) {
        child1 ch = new child1(5,5);
    }
}
