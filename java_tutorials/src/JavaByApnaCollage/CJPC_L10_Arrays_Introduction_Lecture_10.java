package JavaByApnaCollage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CJPC_L10_Arrays_Introduction_Lecture_10 {
    public static void findMaxMin(){
        int a[] = {12,343,435,23,45,23,566,783,344,67,34,232,676,454,23,5,55,3232,3,6,-12,23,-54};
        int min,max,temp;
        try {
            for (int i = 0; i < a.length-1; i++) {
                for (int j = 0; j < a.length-1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            }
            for(int i = 0;i<a.length;i++){
                System.out.print(" "+a[i]+" ");
            }
            min = a[0];max = a[a.length-1];
            System.out.println(" min = "+ min + " max = "+ max);
        }catch (Exception e) {
            System.out.println(e);
        }

        }
    public static void checkArrayInAssendingOrderOrNot(){
        // inserting at array a
        int a[] = {12,13,23,2,465,56,7,4,3,78,3456,545,453,546,5676765,76};
        int b[] = new int[a.length];
        //this for loop copy each value of array a in array b
        for(int i=0;i<a.length;i++){
            b[i] = a[i];
        }
        int temp;
        //in this try catch block nested for loop which sort array a
        try {
            for (int i = 0; i < a.length-1; i++) {
                for (int j = 0; j < a.length-1; j++) {
                    if (a[j] > a[j + 1]) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.print("a:- ");
        //this for loop print's array a
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]+" ");
        }
        System.out.println();
        System.out.print("b:- ");
        //this for loop print's array b
        for(int i=0;i<b.length;i++){
            System.out.print(" "+b[i]+" ");
        }
        System.out.println();
        //this for loop is compairing array a to b
        for(int i = 0;i<a.length;i++){
            if(a[i]==b[i]){
                System.out.print("sorted   at    index:- "+ i+"  "+a[i]+" = "+b[i]);
                System.out.println();
                //something
            }else {
                System.out.println("not sorted at index :- "+ i+"  "+a[i]+"=/="+b[i] );
                //something
            }
        }
    }
    public static void main(String[] args) {
        /*
        Arrays Introduction | Java Complete Placement Course | Lecture 10
        int[] marks = new int[3];
        int marks[] = new int[3];
        int marks[];
        int[] marks;
        marks = new int[3];
        marks[0] = 99;
        marks[1] = 97;
        marks[2] = 94;
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int marks[] = new int[size];
        for(int i = 0;i<marks.length;i++){
            System.out.println(i+" enter:- ");
            marks[i] = scan.nextInt();
        }
        int find_number;
        System.out.println("enter number you want to find");
        find_number = scan.nextInt();
        for(int i = 0;i<marks.length;i++){
            if(marks[i]==find_number){
                System.out.print("number is:- "+marks[i] + " index is:- "+i);
            }else if(marks[i]!=find_number){
                System.out.print("  not in index :- "+i+"  ");
            }else{
                System.out.println("entered number is not present in the list");
            }

        }
        System.out.println("all the numbers:- ");
        for(int i = 0;i<marks.length;i++){
            System.out.print(" "+marks[i]+" ");
        }
*/
        checkArrayInAssendingOrderOrNot();
    }
}