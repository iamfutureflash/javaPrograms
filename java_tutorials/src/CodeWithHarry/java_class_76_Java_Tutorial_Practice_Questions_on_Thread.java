package CodeWithHarry;

/**
 * //PROBLEM 01 STARTS
 * class thr1 extends Thread{
 *     public void run() {
 *         int i = 0;
 *         while(true){
 *             System.out.println(i + " good morning");
 *             i++;
 *         }
 *     }
 * }
 * class thr2 extends Thread{
 *     public void run() {
 *         int i = 0;
 *         while(true){
 *             System.out.println(i + " welcome");
 *             i++;
 *         }
 *     }
 * }
 * public class java_class_76_Java_Tutorial_Practice_Questions_on_Thread {
 *     public static void main(String[] args) {
 *         thr1 t1 = new thr1();
 *         thr2 t2 = new thr2();
 *         t1.start();
 *         t2.start();
 *     }
 * }
 * //PROBLEM 01 ENDS
 *
 *
 * //PROBLEM 02 STARTS
 *
 * class thr1 extends Thread{
 *       public void run() {
 *           int i = 0;
 *           while(true){
 *               try {
 *                   Thread.sleep(2000);
 *               } catch (InterruptedException e) {
 *                   throw new RuntimeException(e);
 *               }
 *               System.out.println(i + " good morning");
 *               i++;
 *           }
 *       }
 *   }
 *   class thr2 extends Thread{
 *       public void run() {
 *           int i = 0;
 *           while(true){
 *               try {
 *                   Thread.sleep(2000);
 *               } catch (InterruptedException e) {
 *                   throw new RuntimeException(e);
 *               }
 *               System.out.println(i + " welcome");
 *               i++;
 *
 *           }
 *       }
 *   }
 *
 * //PROBLEM 02 ENDS
 *
 *
 * //PROBLEM 03 STARTS
 * public class java_class_76_Java_Tutorial_Practice_Questions_on_Thread {
 *       public static void main(String[] args) {
 *           thr1 t1 = new thr1();
 *           thr2 t2 = new thr2();
 *           t1.setPriority(8);
 *           t2.setPriority(8);
 *           System.out.println(t1.getPriority());
 *           System.out.println(t2.getPriority());
 * //          t1.start();
 * //          t2.start();
 *       }
 * }
 * //PROBLEM 03 ENDS
 *
 *
 * //PROBLEM 04 STARTS
 *
 * class thr1 extends Thread{
 *       public void run() {
 *           int i = 0;
 * //          while(i<10){
 * //              try {
 * //                  Thread.sleep(200);
 * //              } catch (InterruptedException e) {
 * //                  throw new RuntimeException(e);
 * //              }
 * //              System.out.println(i + " good morning");
 * //              i++;
 * //          }
 *       }
 *   }
 *   class thr2 extends Thread{
 *       public void run() {
 *           int i = 0;
 * //          while(i<10){
 * //              try {
 * //                  Thread.sleep(200);
 * //              } catch (InterruptedException e) {
 * //                  throw new RuntimeException(e);
 * //              }
 * //              System.out.println(i + " welcome");
 * //              i++;
 * //
 * //          }
 *       }
 *   }
 *   public class java_class_76_Java_Tutorial_Practice_Questions_on_Thread {
 *       public static void main(String[] args) {
 *           thr1 t1 = new thr1();
 *           thr2 t2 = new thr2();
 *           t1.setPriority(8);
 *           t2.setPriority(8);
 *           System.out.println(t1.getPriority());
 *           System.out.println(t2.getPriority());
 *           System.out.println(t1.getState());
 *           System.out.println(t2.getState());
 *           t1.start();
 *           t2.start();
 *           System.out.println(t1.getState());
 *           System.out.println(t2.getState());
 *       }
 * }
 *
 * //PROBLEM 04 ENDS
 *
 *
 * //PROBLEM 05 STARTS
 *
 * System.out.println(t2.currentThread().getState());
 *
 * //PROBLEM 05 ENDS
 * **/
class thr1 extends Thread{
      public void run() {
          int i = 0;
//          while(i<10){
//              try {
//                  Thread.sleep(200);
//              } catch (InterruptedException e) {
//                  throw new RuntimeException(e);
//              }
//              System.out.println(i + " good morning");
//              i++;
//          }
      }
  }
  class thr2 extends Thread{
      public void run() {
          int i = 0;
//          while(i<10){
//              try {
//                  Thread.sleep(200);
//              } catch (InterruptedException e) {
//                  throw new RuntimeException(e);
//              }
//              System.out.println(i + " welcome");
//              i++;
//
//          }
      }
  }
  public class java_class_76_Java_Tutorial_Practice_Questions_on_Thread {
      public static void main(String[] args) {
          thr1 t1 = new thr1();
          thr2 t2 = new thr2();
          t1.setPriority(8);
          t2.setPriority(8);
          System.out.println(t1.getPriority());
          System.out.println(t2.getPriority());
          System.out.println(t1.getState());
          System.out.println(t2.getState());
          t1.start();
          t2.start();
          System.out.println(t1.getState());
          System.out.println(t2.getState());
          System.out.println(t2.currentThread().getState());
      }
}