package CodeWithHarry;
import java.util.Scanner;
public class java_05_cbsc_percentage{
    public static void main(String[] args){
        //take 5 input of 5 subjects marks hindi, english, maths, science, socialStudies
    Scanner input=new Scanner(System.in);
        System.out.println("ENTER MARKS OF HINDI");
        int hindi=input.nextInt();
        System.out.println("ENTER MARKS OF ENGLISH");
        int english=input.nextInt();
        System.out.println("ENTER MARKS OF MATHS");
        int maths=input.nextInt();
        System.out.println("ENTER MARKS OF SCIENCE");
        int science=input.nextInt();
        System.out.println("ENTER MARKS OF SOCIAL STUDIES");
        int social_studies=input.nextInt();

        int sum = hindi+english+maths+science+social_studies;
        int percentage=sum/5;
        System.out.println("percentage is ");
        System.out.println(percentage);
        System.out.print("%");
    }
}