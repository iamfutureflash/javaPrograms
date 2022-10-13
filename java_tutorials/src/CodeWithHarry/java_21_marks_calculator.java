package CodeWithHarry;

import java.util.Scanner;
public class java_21_marks_calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int percentage;
//        5 students mark input->overall40%->in subject33%
        System.out.println("Enter marks of the subjects");
        System.out.println("enter hindi marks");
        int hindi = scan.nextInt();
        System.out.println("enter english marks");
        int english = scan.nextInt();
        System.out.println("enter maths marks");
        int maths = scan.nextInt();
        System.out.println("enter Science marks");
        int science = scan.nextInt();
        System.out.println("enter sst marks");
        int sst = scan.nextInt();
        percentage = ((hindi + english + maths + science + sst) * 100) / 500;
        if (percentage >= 41) {
            System.out.printf(" percentage is %d", percentage);
            System.out.print("%");
            System.out.println();
        }
        if (hindi >= 33 && english >= 33 && maths >= 33 && science >= 33 && sst >= 33) {
            System.out.println("you are pass in all subjects");
        }
        if (hindi < 33 || english < 33 || maths < 33 || science < 33 || sst < 33) {
            System.out.print("you have back in");
        }
        switch (1){
            case 1:
                if (hindi < 33)
                    System.out.print(" hindi");
                switch (1){
                    case 1:
                        if (english < 33)
                            System.out.print(" english");
                        switch (1){
                            case 1:
                                if (maths < 33)
                                    System.out.print(" maths");
                                switch (1){
                                    case 1:
                                        if (science < 33)
                                            System.out.print(" science");
                                        switch (1){
                                            case 1:
                                                if (sst < 33)
                                                    System.out.print(" sst");
                                                    break;
                                        }
                                }
                        }
                }
            case 2:break;
            default :
                System.out.println("you have no back in any subject");
                break;
        }
    }
}