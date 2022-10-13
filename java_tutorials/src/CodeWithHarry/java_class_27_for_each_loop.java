package CodeWithHarry;

import javax.swing.*;

public class java_class_27_for_each_loop {
    public static void main(String[] args) {
     int [] marks = {55,67,99,98,65};
//     float [] marks = {55.4f,67.43f,99.34f,98.3f,65.34f};
//     String [] names = {"harry", "shlok", "rahul", "gagan", "sourabh"};
//        System.out.println(marks.length);
//        System.out.println(marks[3]);
//        System.out.println(names[3]);
//        System.out.println( names.length);
//        System.out.printf("hi name and length is :- %s   %s",names[3],names.length);
//        for (int i = 0; i <marks.length; i++) {
//            System.out.printf("%d ",marks[i]);
//        }
        //for each loop
        for(int i: marks){
            System.out.print(i+ " ");
        }

    }
}
