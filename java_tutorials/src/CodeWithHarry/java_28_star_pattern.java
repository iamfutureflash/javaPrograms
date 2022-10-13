package CodeWithHarry;

import java.util.Scanner;
public class java_28_star_pattern {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        pattern25();
    }
    /*

    static void pattern1(int n ){
//        *****
//        *****
//        *****
//        *****
//        *****
        for (int row=1;row<=n;row++){
            for (int col=1;col<=n;col++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n ){
//        *
//        **
//        ***
//        ****
//        *****
        for (int row=1;row<=n;row++){
            for (int col=1;col<=row;col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(){
        System.out.print("enter number: ");
        int n = scan.nextInt();
//        *****
//        ****
//        ***
//        **
//        *
        for (int row=1;row<=n;row++){
            System.out.printf(" %d   ",row);
            for (int col=1;col<=n;col++){
                if(col<=(n+1)-row){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void pattern4(int n ){
//        1
//        12
//        123
//        1234
//        12345
        for (int row=1;row<=5;row++){
            for (int col=1;col<=row;col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }


    static void pattern5(int n ){
//        12345
//        1234
//        123
//        12
//        1
        for (int row=1;row<=5;row++){
            for (int col=1;col<=n;col++) {
                System.out.print(col);
            }
            System.out.println();
            n--;
        }
    }


    static void pattern6(int n ) {
//    *
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *
        int y = (n / 2);
        int row;
        for (row = 1; row <= n; row++) {
            if (row <= (n / 2) + 1)//n=9 (n/2)+1=5 {
                for (int col = 1; col <= row; col++) {
                    System.out.print(col);
                }
//            System.out.println();
            if (row > (n / 2) + 1) {
                for (int col = 1; col <= y; col++) {
                    System.out.print(col);
                }
                y--;
//                System.out.println();
            }
            System.out.println();
        }

    }

    static void pattern7(int n ) {
//        *
//       **
//      ***
//     ****
//    *****
        int x=n-1;
        for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= n; col++) {
                    if(col<=x)
                    System.out.print(" ");
                    else{
                        System.out.print("*");
                    }
                }
                x--;
            System.out.println();
        }

    }

    static void pattern7_part2(int n ) {
//    *****
//     ****
//      ***
//       **
//        *
        int x=n-1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if(col<=row-1)
                    System.out.print(" ");
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }


    static void pattern8(int n) {
//        *
//       ***
//      *****
//     *******
//    *********
        int x=4,y=6,z;
        for (int row = 1; row <= n/2+1; row++) {
            for (int col = 1; col <= n; col++) {
             if(col>=((n/2)+2)-row && col<=n/2+row){
                 System.out.print("* ");
             }
             else{
                 System.out.print("  ");
             }
            }
            System.out.println();
        }
    }



    static void pattern9(int n) {
//        *********
//         *******
//          *****
//           ***
//            *
        int x=4,y=6,z;
        for (int row = 1; row <= n/2+1; row++) {
            for (int col = 1; col <= n; col++) {
                if(col>=row && col<=n+1-row){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    

    static void pattern10() {
        System.out.print("enter number: ");
        int n = scan.nextInt();
//        *********
//         *******
//          *****
//           ***
//            *
        for (int row = 1; row <=n; row++) {
            System.out.printf("%d  ",2*n-row);
            for (int col = 1; col <= 2*n-1; col++) {
                if(col>=row && col<=2*n-row){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    

    static void pattern11() {
        System.out.print("enter number: ");
        int n = scan.nextInt();
        boolean k = true;
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *
        for (int row = 1; row <=n; row++) {
            System.out.printf("%d  ",2*n-row);
            for (int col = 1; col <= 2*n-1; col++) {
                if(col>=row && col<=2*n-row&&k){
                    System.out.print("* ");
                    k=false;
                }
                else{
                    k=true;
                    System.out.print("  ");
                }
            }
            k=true;
            System.out.println();
        }
    }

    static void pattern12() {
        System.out.print("enter number: ");
        int n = scan.nextInt();
        boolean k = true;
        int z,y;
        y=z=n;
//                    *
//                   * *
//                  * * *
//                 * * * *
//                * * * * *

        for (int row = 1; row <=n; row++) {
            System.out.printf("%d         ",row);
            for (int col = 1; col <= 2*n-1; col++) {
                if(col>=y && col<=z&&k){
                    System.out.print("* ");
                    k=false;
                }
                else{
                    k=true;
                    System.out.print("  ");
                }
            }
            z++;
            y--;
            k=true;
            System.out.println();
        }
    }



    static void pattern13() {
        System.out.print("enter number: ");
        int n = scan.nextInt();
        boolean k = true;
        int z,y;
        y=z=n;
//                *********
//                **** ****
//                ***   ***
//                **     **
//                *       *
//

        for (int row = 1; row <=n; row++) {
            System.out.printf("%d         ",row);
            for (int col = 1; col <= 2*n-1; col++) {
                if(col<=y || col>=z){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            z++;
            y--;
            System.out.println();
        }
    }


    static void pattern14() {
        System.out.print("enter number: ");
        int n = scan.nextInt();
        int z,y,k=0;

        y=z=n;
//                  1
//                 121
//                12321
//               1234321
//              123454321

        for (int row = 1; row <=n; row++) {
//            System.out.printf("%d         ",row);
            k=1;
            for (int col = 1; col <= 2*n-1; col++) {
                if(col>=y && col<=z){
                    System.out.printf("%d ",k);
                    if(col<((2*n-1)/2)+1){
                        k++;
                    }
                    if(col>=((2*n-1)/2)+1){
                        k--;
                    }
                }
                else{
                    System.out.print("  ");
                }
            }
            z++;
            y--;
            System.out.println();
        }
    }



    static void pattern15() {
        System.out.print("enter number: ");
        int n = scan.nextInt();
        int z,y;
        Character k;

        y=z=n;
//                  A
//                 ABA
//                ABCBA
//               ABCDCBA   A
//              ABCDEDCBA

        for (int row = 1; row <=n; row++) {
//            System.out.printf("%d         ",row);
            k='A';
            for (int col = 1; col <= 2*n-1; col++) {
                if(col>=y && col<=z){
                    System.out.printf("%c ",k);
                    if(col<((2*n-1)/2)+1){
                        k++;
                    }
                    if(col>=((2*n-1)/2)+1){
                        k--;
                    }
                }
                else{
                    System.out.print("  ");
                }
            }
            z++;
            y--;
            System.out.println();
        }
    }



    static void pattern16() {
        System.out.print("enter number: ");
        int n = scan.nextInt();
        int z, y;
        Character k;

        y = z = n;
//                  ABCDEDCBA
//                  ABCD DCBA
//                  ABC   CBA
//                  AB     BA
//                  A       A
        for (int row = 1; row <= n; row++) {
            k = 'A';
            for (int col = 1; col <= 2 * n - 1; col++) {
                if (col <= y || col >= z) {
                    System.out.printf("%c ", k);
                    if (col < ((2 * n - 1) / 2) + 1) {
                        k++;
                    }
                    if (col >= ((2 * n - 1) / 2)+1) {
                        k--;
                    }
                }
                    else {
                        System.out.print("  ");
                    if (col < ((2 * n - 1) / 2) + 1) {
                        k++;
                    }
                    if (col >= ((2 * n - 1) / 2)+1) {
                        k--;
                    }
                    }
                }
                z++;
                y--;
                System.out.println();
            }
        }



    static void pattern17() {
        System.out.print("enter number: ");
        int n = scan.nextInt();
        int x, y;

        y = x = n/2+1;

//         *
//        ***
//       *****
//      *******
//       *****
//        ***
//         *
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n; col++) {
                if (col>=x&&col<=y) {
                    System.out.printf("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            if(row<n/2+1){
                x--;
                y++;
            }
            if(row>=n/2+1){
                x++;
                y--;
            }
            System.out.println();
        }
    }




    static void pattern18() {
        System.out.print("enter number: ");
        int n = scan.nextInt();
        int a,x, y,z;

        y = x = a = (n*2)/2;

//        1
//       232
//      34543
//     4567654
//    567898765

        for (int row = 1; row <= n; row++) {
            z=row;
            for (int col = 1; col <=n*2-1; col++) {
                if (col>=x&&col<=y) {
                    System.out.printf("%d ",z);
                    if(col<a){
                        z++;
                    }
                    if(col>=a){
                        z--;
                    }
                }
                else {
                    System.out.print("  ");
                }
            }

            x--;
            y++;
            System.out.println();
        }
    }



    static void pattern19() {
        System.out.print("enter odd number: ");
        int n = scan.nextInt();
        int x,y=n-1;
           x=n;
//        6543210
//        543210
//        43210
//        3210
//        210
//        10
//        0
        for (int row = 1; row <= n; row++) {
            y=n-row;
            for (int col = 1; col <=n; col++) {
                if (col<=x) {
                    System.out.printf("%d ",y);
                    y--;
                }
                else {
                    System.out.print("  ");
                }
            }
            x--;
            System.out.println();
        }
    }



    static void pattern20() {
        System.out.print("enter odd number: ");
        int n = scan.nextInt();
        int x,y;
        x = n;
//        1
//       12
//      123
//     1234
//    12345
//     1234
//      123
//       12
//        1
        for (int row = 1; row <= n*2-1; row++) {
            y=1;
            for (int col = 1; col <=n; col++) {
                if (col>=x) {
                    System.out.printf("%d ",y);
                    y++;
                }
                else {
                    System.out.print("  ");
                }
            }
            if(row<(n*2)/2){
                x--;
            }
            if(row>=(n*2)/2){
                x++;
            }
            System.out.println();
        }
    }







    static void pattern21() {
        int n=7;
        int x=1,y=1,z=7;
        for (int row = 1; row <= n; row++) {
            int col;
            for (col = 1; col <= n; col++) {
                if (col == x && row == y || row == x && col == z  ) {
                    if(col==8-row){
                        System.out.printf("/ ");
                    }
                    else {
                        System.out.printf("\\ ");
                    }
                }
                else {
                    System.out.print("* ");
                }
            }
            x++;
            y++;
            z--;
            System.out.println();
        }
    }




    static void pattern22() {
        int x=1,y=9;
        boolean k=true;

//        * * * * *
//         * * * *
//          * * *
//           * *
//            *
//            *
//           * *
//          * * *
//         * * * *
//        * * * * *
        for (int row = 1; row <= 10; row++) {
            k=true;
            for (int col = 1; col <= 9; col++) {
                if (col >= x && col <= y&&k) {
                    System.out.print("* ");
                    k=false;
                }
                else {
                    System.out.print("  ");
                    k=true;
                }
            }
            if(row<5){
                x++;
                y--;
            }
            if(row>5){
                x--;
                y++;
            }
            System.out.println();
        }
    }


    static void pattern23() {
        int x=1,y=5,z=5;
        boolean k =true;

//            *
//           * *
//          *   *
//         *     *
//        *********
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 9; col++) {
                    if (col == y || col == z) {
                        System.out.print("* ");
                    }

                if(row==5&&col<=8){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            if(row<4){
                y--;
                z++;
            }
            System.out.println();
        }
    }

    static void pattern24() {
        int x=1,y=9;

//        *********
//         *     *
//          *   *
//           * *
//            *

        for (int row = 1; row <= 5; row++) {
            System.out.printf("%d            ",row);
            for (int col = 1; col <= 9; col++) {
                if(row==1&&(col>=1&&col<=9)){
                    System.out.print("* ");
                }
                if (row>1&&(col==x || col==y)) {
                    System.out.print("* ");
                }
                else {
                    if(row>1)
                    System.out.print("  ");
                }
            }
            x++;
            y--;
            System.out.println();
        }
    }


    */


    static void pattern25() {
      int x,y;
        System.out.print("enter number:- ");
      int n=scan.nextInt();
        x=y=((2*n-1)/2)+1;

//            *
//          *   *
//         *     *
//        *       *
//       *         *
//        *       *
//         *     *
//          *   *
//            *
//
        for (int row = 1; row <= 2*n-1; row++) {
            System.out.printf("%d  ",row);
            for (int col = 1; col <= 2*n+1; col++) {
                if ( col == x || col == y ) {
                    System.out.print("* ");
                }
                else {
                        System.out.print("  ");
                }
            }
            if(row<5){
            x--;
            y++;
            }
            if(row>=5){
                x++;y--;
            }

            System.out.println();
        }
    }


    }