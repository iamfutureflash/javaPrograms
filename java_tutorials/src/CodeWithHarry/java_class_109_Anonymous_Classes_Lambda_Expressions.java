package CodeWithHarry;
@FunctionalInterface
interface DemoAno{
    void meth1(int a);
//    void meth2();
}
/*
class AnnoDemo implements DemoAno{
    public void display(){
        System.out.println("Hello");
    }
    @Override
    public void meth1() {
        System.out.println("i am meth1");
    }
    @Override
    public void meth2() {
        System.out.println("i am meth1");
    }
}
*/
public class java_class_109_Anonymous_Classes_Lambda_Expressions {
    public static void main(String[] args) {
/*
    AnnoDemo ad = new AnnoDemo();
        ad.meth1();
        DemoAno obj = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("i am meth1");
            }

            @Override
            public void meth2() {
                System.out.println("i am meth2");
            }
        };
        obj.meth1();
*/
        DemoAno obj = (a)->{System.out.println("i am method 1 " + a);};
        obj.meth1(6);
    }
}
