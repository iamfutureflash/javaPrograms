package CodeWithHarry;
class A{
    public int a =6;
    public int harry(){
        return 6;
    }
    public void meth2(){
        System.out.println("i am method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("i am method 2 of class B");
    }
    public void meth3(){
        System.out.println("i am method 3 of class B");
    }
}
public class java_class_48_Method_Overriding {
    public static void main(String[] args) {
    A a = new A();
    a.meth2();
    B b = new B();
    b.meth2();
    }
}
