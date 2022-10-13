package JavaByApnaCollage;

import java.util.Scanner;

public class CJPC_L04_Loops_in_Java_Lecture_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number:- ");
        int number = scanner.nextInt();
        /*
        //problem 01
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum +=+i;
            System.out.println(sum);
        }
        System.out.println("sum:- " + sum);
        */
        for (int i = 0; i < 11; i++) {
            System.out.println(i+" x "+ number + " = " + i*number);
        }
    }
}