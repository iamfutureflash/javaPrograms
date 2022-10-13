package CodeWithHarry;

class MyRunnableThread01 implements Runnable {
    public void run(){
        int i = 0;
        while(i <=40000) {
            System.out.println(i + " thread 1");
            i++;
        }
    }
}

class MyRunnableThread02 implements Runnable {
    public void run(){
        int i = 0;
        while(i <=40000) {
            System.out.println(i + " thread 2");
            i++;
        }
    }
}

public class java_class_71_Creating_a_Java_Thread_Using_Runnable_Interface {
    public static void main(String[] args) {
    MyRunnableThread01 t1 = new MyRunnableThread01();
    Thread t11 = new Thread(t1);
    MyRunnableThread02 t2 = new MyRunnableThread02();
    Thread t21 = new Thread(t2);
    t11.start();
    t21.start();
    }
}
