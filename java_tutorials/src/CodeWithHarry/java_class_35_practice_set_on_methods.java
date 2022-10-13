package CodeWithHarry;

import java.util.Scanner;

public class java_class_35_practice_set_on_methods {
    private static Scanner scan = new Scanner(System.in);
    private static void o1_multiplication_table(){
        System.out.print("enter number to print table:- ");
        int number = scan.nextInt();
        int end_point = 50;
        for (int i = 1; i <=end_point; i++) {
            System.out.printf(" %d x %d = %d ",number,i, number*i);
            System.out.println("");
        }
    }
    private static void o2_star_pattern(){
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                if (j<=i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    private static int o3_sum_of_natural_numbers_using_recursion(int n){
        if(n==1)
            return 1;
        int sum = n + o3_sum_of_natural_numbers_using_recursion(n-1);
        return sum;
    }
    private static void o4_star_pattern(){
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=4 ; j++) {
                if(j<=5-i)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    private static int o5_febonachi(int n){
        if(n==1||n==2)
            return 1;
        return o5_febonachi(n-1)+o5_febonachi(n-2);
    }
    private static int o6_find_avg(int ...a){
        int result = 0;
        for (int i:a) {
            result = result +i;
        }
        result = result/a.length;
        return result;
    }
    private static void o7_star_pattern_rec1(int n){
        if(n>0){
            o7_star_pattern_rec1(n-1);
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(" * ");
        }
        System.out.println();
    }
    private static void o8_star_pattern_rec1(int n){
        for (int i = 0; i <n ; i++) {
            System.out.print(" * ");
        }
        System.out.println();
        if(n>=0)
        o8_star_pattern_rec1(n-1);
    }
    public static void main(String[] args) {
//            o1_multiplication_table();//done
//            o2_star_pattern();//done
//        System.out.print("enter the number :- ");
//        int n = scan.nextInt();
//        int sum = o3_sum_of_natural_numbers_using_recursion(n);//done
//        System.out.print("sum is " + sum);
//        for (int i = 1; i <=n ; i++) {
//            System.out.print(o5_febonachi(i)+ " ");//done
//        }
//        System.out.println(o6_find_avg(90,90,90,90,90)+"%");
//o7_star_pattern_rec1(4);
        o8_star_pattern_rec1(4);

    }
}
