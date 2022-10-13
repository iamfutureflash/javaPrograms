package CodeWithHarry;
class myThread1 extends Thread {
    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println(i + " cooking");
//            System.out.println("i am happy");
            i++;
        }
    }
}
class myThread2 extends Thread {
    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println(i +" chatting");
//            System.out.println("i am sad");
            i++;
        }
    }
}
public class java_class_70_Creating_a_Thread_by_Extending_Thread_class {
    public static void main(String[] args) {
    myThread1 t1 = new myThread1();
    myThread2 t2 = new myThread2();
    t1.start();
    t2.start();
    }
}
