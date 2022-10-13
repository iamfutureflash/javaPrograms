package CodeWithHarry;
import java.util.Scanner;

// import java.util.random.*;
class guess_the_number {
    public Scanner scan = new Scanner(System.in);
    public int count = 0, generated_number = 43, guess = 0, diff=0,x=0;

    public guess_the_number(){
        guess();
    }

    public void guess() {
        while (true) {
            System.out.println("enter the number ");
            guess = scan.nextInt();
            if (generated_number > guess) {
                count++;
                diff = generated_number - guess;
                System.out.println("difference is +" + diff);
                System.out.println("your guess is smaller then generated number please make your guess little high");
            } else if (generated_number < guess) {
                count++;
                diff = guess - generated_number;
                System.out.println("difference is -" + diff);
                System.out.println("your guess is greater please lower your guess");
            } else if (generated_number == guess) {
                System.out.println("your count is " + count);
                System.out.println("your guess is correct");
                break;
            }

        }
    }
}

public class java_class_43_excercise_guess_the_number {

    public static void main(String[] args) {
        guess_the_number tarun = new guess_the_number();
    }
}