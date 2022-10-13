package CodeWithHarry;
import java.util.Scanner;
import java.util.Random;

public class java_25_rock_paper_scissor {
    public static void main(String[] args) {
//        int[] user_input=new int[8];
        int computer,counter1=0,counter2=0;
//       counter1 for player1
//       counter2 for computer
        Scanner scan=new Scanner(System.in);
        Random random=new Random();
//        int computer=random.nextInt(3)+1;
        System.out.println("how many times you want to play rock paper cizer");
        System.out.println("enter the value");
        int n=scan.nextInt();

        for(int i=1;i<=n;i++) {
            System.out.println("1. stone  2. paper  3. cizer");
            System.out.println("enter your choice");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 -> {

                    //for stone
                    computer = random.nextInt(3) + 1;
                    System.out.println("player choice is stone");
                    if (computer == 1) {
                        System.out.println("match is draw");
                        System.out.println("computer choose stone");
                    }
                    if (computer == 2) {
                        System.out.println("computer win");
                        counter2++;
                        System.out.println("computer choose paper");
                    }
                    if (computer == 3) {
                        System.out.println("player1 win");
                        counter1++;
                        System.out.println("computer choose cizer");
                    }
                }
                case 2 -> {
                    //for paper
                    computer = random.nextInt(3) + 1;
                    System.out.println("your choice is paper");
                    if (computer == 1) {
                        System.out.println("player1 win");
                        counter1++;
                        System.out.println("computer choose stone");
                    }
                    if (computer == 2) {
                        System.out.println("match is draw");
                        System.out.println("computer choose paper");
                    }
                    if (computer == 3) {
                        System.out.println("computer win");
                        counter2++;
                        System.out.println("computer choose cizer");
                    }
                }
                case 3 -> {
//                for cizer
                    System.out.println("your choice is cizer");

                    computer = random.nextInt(3) + 1;
                    if (computer == 1) {
                        System.out.println("computer win");
                        counter2++;
                        System.out.println("computer choose stone");
                    }
                    if (computer == 2) {
                        System.out.println("player1 win");
                        counter1++;
                        System.out.println("computer choose paper");
                    }
                    if (computer == 3) {
                        System.out.println("match is draw");
                        System.out.println("computer choose cizer");
                    }
                }
            }
        }
        if(counter1>counter2){
            System.out.printf("player1 win the match  player1 = %d by computer = %d",counter1,counter2);
        }
        if(counter2>counter1){
            System.out.printf("computer win the match player1 = %d by computer = %d",counter1,counter2);
        }
        if(counter1==counter2){
            System.out.println("match is draw between both player");
        }
    }
}
