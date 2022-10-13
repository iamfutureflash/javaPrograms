package unacademy_relevel;

import java.util.Scanner;

public class bricks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = 0;
        int numberOfColors=0;
        int heightOfTheWall=0;
        int output=0;
        testCase = scan.nextInt();

        numberOfColors = scan.nextInt();

        heightOfTheWall = scan.nextInt();
        int bricks[] = new int[numberOfColors];
        for (int i=0;i<numberOfColors;i++){
            bricks[i] = scan.nextInt();
        }
        for (int i=0;i<numberOfColors;i++){
            output = bricks[i] + output;
        }
        System.out.println(output);
    }
}
