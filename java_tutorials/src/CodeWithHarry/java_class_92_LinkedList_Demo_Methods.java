package CodeWithHarry;

import java.util.ArrayList;
import java.util.LinkedList;

public class java_class_92_LinkedList_Demo_Methods {
    public static void main(String[] args) {
        LinkedList<Integer> a1 = new LinkedList<Integer>();
        LinkedList<Integer> a2 = new LinkedList<Integer>();
        a2.add(15);
        a2.add(16);
        a2.add(17);
        a2.add(18);
        a1.addAll(a2);
        a1.add(5);
        a1.add(0,6);
        a1.add(4);
        System.out.println(a1.indexOf(18));
        System.out.println(a1.lastIndexOf(18));
        a1.set(0,99);
        a1.addFirst(44);
        a1.addLast(900);
//        a1.clear();
        for (int i = 0; i <a1.size();i++){
            System.out.print(a1.get(i));
            System.out.print(", ");
        }
    }
}
