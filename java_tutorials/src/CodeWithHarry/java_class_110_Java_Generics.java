package CodeWithHarry;
import java.util.ArrayList;

class MyGenerics<T1 , T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public MyGenerics(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

public class java_class_110_Java_Generics {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("str1");
        al.add(54);
        al.add(643);
//        int a = al.get(2);
//        System.out.println(a);
        MyGenerics<String, Double> g1 = new MyGenerics(23," puneet vaishnav ", 98.99);
        String str1 = g1.getT1();
        Double dbl = g1.getT2();
        System.out.println(str1 + dbl);
        MyGenerics<Integer, String> g2 = new MyGenerics(23,555, " hero man is my fav show");
        Integer num = g2.getT1();
        String str2 = g2.getT2();
        System.out.println(num + str2);
    }
}
