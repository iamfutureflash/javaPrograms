package CodeWithHarry;
class thread01 extends Thread{
    public thread01(String name){
        super(name);
    }
    public void run() {
        int i = 0;
        while(i<=10) {
            System.out.println(i+ " thank you " + this.getName());
            i++;
        }
    }
}
public class java_class_74_Java_Thread_Priorities {
    public static void main(String[] args) {
    thread01 t1 = new thread01("Harry1");
    thread01 t2 = new thread01("Harry2");
    thread01 t3 = new thread01("Harry3");
    thread01 t4 = new thread01("Harry4");
    thread01 t5 = new thread01("Harry5 ( MOST IMPORTANT ) ");
//    t1.setPriority(Thread.MIN_PRIORITY);
//    t2.setPriority(Thread.MIN_PRIORITY);
//    t3.setPriority(Thread.MIN_PRIORITY);
//    t4.setPriority(Thread.MIN_PRIORITY);
    t5.setPriority(Thread.MAX_PRIORITY);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    }
}
