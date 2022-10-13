package KunalKushwaha;

import java.util.Scanner;

public class findMinOrMax {
    public static void main(String[] args) {
//        int max = 0;
        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//
//        max = Math.max(c,Math.max(a,b));
//        System.out.println(max);
        char c = scan.next().charAt(0);
        if(Character.isUpperCase(c)) {
            System.out.println("upper case " + c);
        }else{
            System.out.println("lower case " + c);
        }

    }
}
