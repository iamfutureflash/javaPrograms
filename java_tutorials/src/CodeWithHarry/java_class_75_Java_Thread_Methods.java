package CodeWithHarry;
class t01 extends Thread{
    public void run() {
        int i = 0;
        while(i<=40000) {
            System.out.println(i+ " thank you ");
            i++;
        }
    }
}
class t02 extends Thread{
    public void run() {
        int i = 0;
        while(i<=40000) {
            System.out.println(i+ " bye ");
            i++;
        }
    }
}
public interface java_class_75_Java_Thread_Methods {
    public static void main(String[] args) {
        t01 t1 = new t01();
        t02 t2 = new t02();
//        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        try {
            Thread.sleep(5);
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();

    }
}