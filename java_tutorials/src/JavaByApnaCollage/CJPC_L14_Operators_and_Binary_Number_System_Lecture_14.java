package JavaByApnaCollage;

import java.util.Scanner;

public class CJPC_L14_Operators_and_Binary_Number_System_Lecture_14 {
    public static Scanner scan = new Scanner(System.in);
public static void tableOFIntrest(){
    System.out.println("enter you consistent every month saving income:- ");
    int income = 20000;
    int compound_income =0,intrest =20 , total_compound_icomes =0, total_icomes_with_intrest =0,total_icomes_without_intrest=0, total_intrest =0;
    for (int i = 1; i <=12;i++){
        total_icomes_with_intrest +=income + (income*20)/100;
        total_icomes_without_intrest+=income;
    }
    System.out.println("12 months data");
    System.out.println("total income:- " + total_icomes_with_intrest);
    System.out.println("total income without intrest :- " + total_icomes_without_intrest);
    System.out.println("total intrest :- " + (total_icomes_with_intrest-total_icomes_without_intrest));
}
    public static void main(String[] args) {
            //this was the theory class
        tableOFIntrest();
    }
}