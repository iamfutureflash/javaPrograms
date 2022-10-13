package JavaByApnaCollage;

import java.util.Scanner;

/*
* 1-Enter 3 numbers from the user & make a function to print their average.
2 Write a function to print the sum of all odd numbers from 1 to n.
3 Write a function which takes in 2 numbers and returns the greater of those two.
4 Write a function that takes in the radius as input and returns the circumference of a circle.
5 Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
6 Write an infinite loop using do while condition.
7 Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
8 Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
9 Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
10 Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 .....
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
(BONUS)

* */
public class CJPC_L08_Functions_Practice_Questions_Lecture_8 {
    public static Scanner scan = new Scanner(System.in);
    public static void q1(){
//        1-Enter 3 numbers from the user & make a function to print their average.
        System.out.println("enter a:-");
        int a = scan.nextInt();
        System.out.println("enter b:-");
        int b = scan.nextInt();
        System.out.println("enter c:-");
        int c = scan.nextInt();

        int d = (a+b+c)/3;
        System.out.println("average is:- " + d);
    }
    public static void q2(){
//        2 Write a function to print the sum of all odd numbers from 1 to n.
        int n,sum=0;
        System.out.println("enter range ");
        n = scan.nextInt();
        for(int i=0;i<=n;i++){
            if(i%2==0){}
            else if(i%2!=0){
                sum = sum + i;
            }
        }
        System.out.println("sum of odd numbers:- " + sum);
    }
    public static void q3(){
//        3 Write a function which takes in 2 numbers and returns the greater of those two.
        int a,b;
        System.out.println("enter a:-");
        a = scan.nextInt();
        System.out.println("enter b:-");
        b = scan.nextInt();
        if(a>b){
            System.out.println("a is greater " + a);
        }
        else if(b>a){
            System.out.println("b is greater " + b);
        }
    }
    public static void q4(){
//        4 Write a function that takes in the radius as input and returns the circumference of a circle.
        int radius = 1,circumference;
        System.out.println("enter radius:- ");
        radius = scan.nextInt();
        circumference = (int)(2*Math.PI*radius);
        System.out.println("circumference is " + circumference);
    }
    public static void q5(){
//        5 Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
        int age;
        System.out.println("enter age:- ");
        age = scan.nextInt();
        if(age>18)
            System.out.println("eligible for voting");
        else
            System.out.println("not eligible for voting");
    }
    public static void q6(){
//        6 Write an infinite loop using do while condition.
        do{
            System.out.println("hi");
        }while(true);
    }
    public static void q7(){
//        7 Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
        int positive = 0, negative=0, zero=0, max_number, check_number;
        System.out.print("how many times you want to enter number:- ");
        max_number = scan.nextInt();
        for (int i = 0; i <max_number;i++){
            System.out.println("enter number");
            check_number = scan.nextInt();
            if(check_number>0){
                positive++;
            }else if(check_number<0){
                negative++;
            }else if(check_number==0){
                zero++;
            }
        }
        System.out.println("positive = "+ positive + "\n" + "negitive = " + negative + "\n" + "zero = " + zero);
    }
    public static void q8(){
//        8 Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
        int x,y;
        String a = "power is ";
        System.out.println("enter number:- ");
        x= scan.nextInt();
        System.out.println("enter power:- ");
        y=scan.nextInt();
        System.out.println("x and y is " + x +" and "+ y);
        System.out.println(a + Math.pow(x,y));
    }
    public static void q9(){
//        9 Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
        int GCD=0, quotient = 0, a=0,b=0, temp_a=0, temp_b=0,reminder=0, temporary_switching;
        System.out.println("enter a:- ");
        a = scan.nextInt();
        System.out.println("enter b:- ");
        b = scan.nextInt();
        temp_a =a;temp_b =b;
        if(a>b) {
            //do nothing a is always be greater than b
        }else if(b>a){
            temporary_switching = b;
            b=a;
            a=temporary_switching;
            temporary_switching = 0;
            System.out.println("a = "+a);
            System.out.println("b = "+b);
        }
        while(b!=0){
            quotient = a/b;
            reminder = a%b;
            System.out.println("quotient = " + quotient);
            System.out.println("a = "+ a);
            System.out.println("b = "+ b);
            System.out.println("reminder = "+ reminder);
            GCD = b;
            a=b; b=reminder;
        }
        System.out.println("GCD of ("+temp_a+","+ temp_b+") is:- " + GCD);
    }
    public static void q10(){
//        10 Write a program to print Fibonacci series of n terms where n is input by user :
//        0 1 1 2 3 5 8 13 21 .....
//        In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
//        (BONUS)
        long a=0,b=1,sum=0,n;
        System.out.println("how long you want print the numbers");
        System.out.print("enter number:- ");
        n= scan.nextInt();
        System.out.print(a+"  "+b+" ");
        for (int i=0;i<=n-3;i++){
            sum=a+b;
            System.out.print(" "+sum+" ");
            a=b;
            b=sum;
        }
    }
    public static void main(String[] args) {
        //
    }
}