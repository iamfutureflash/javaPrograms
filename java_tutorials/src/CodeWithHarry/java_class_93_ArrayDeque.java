package CodeWithHarry;

import java.util.ArrayDeque;

public class java_class_93_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<Integer>();
        ad1.add(1);
        ad1.add(2);
        ad1.add(3);
        ad1.addFirst(6);
        ad1.addLast(9);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
