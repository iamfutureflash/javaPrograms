package CodeWithHarry;
class MyThread extends Thread {
    /* Using Thread class with name by extending Thread class
     * Thread(String name)
     * public void run(){
     *         System.out.println("hello");
     *     }
     *
     * */
    public MyThread(String name){
        super(name);
    }
    public void run(){
        System.out.println("hello");
    }
}
public class java_class_73_Constructors_from_Thread_class {
    public static void main(String[] args) {
    MyThread myThread = new MyThread("iamfutureflash");
    myThread.start();
    MyThread myThread01 = new MyThread("tarun vaishnav");
    myThread01.start();
    System.out.println("The id of mythred thread is "+ myThread.getId());
    System.out.println("The name of mythred thread is "+ myThread.getName());
    System.out.println("The id of mythred01 thread is "+ myThread01.getId());
    System.out.println("The name of mythred01 thread is "+ myThread01.getName());
    }
}
