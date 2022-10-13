package JavaByApnaCollage;

import java.util.Scanner;

public class CJPC_L11_2D_Arrays_Lecture_11 {
    public static Scanner scan = new Scanner(System.in);
    public static void twoDArraySearch(){
        int a[][] = new int[3][5];
//      for taking input
        for (int i = 0; i <3;i++){
            for (int j = 0; j<5;j++) {
                System.out.print("for index [" + i + "][" + j + "]:- ");
                a[i][j] = scan.nextInt();
            }
            System.out.println();
        }
//      for display
        for (int i = 0; i <3;i++){
            for (int j = 0; j<5;j++){
                System.out.print(" "+a[i][j]+" ");
            }
            System.out.println();
        }
//      checking input number is present in th 2d array or not
        int checkNumberIndex;
        System.out.println();
        System.out.print("enter number:- ");
        checkNumberIndex = scan.nextInt();
        for (int i = 0; i <3;i++){
            for (int j = 0; j<5;j++){
                if(a[i][j]==checkNumberIndex){
                    System.out.println("Value :- "+a[i][j]+" index :- ["+i+"]["+j+"]");
                }
            }
            System.out.println();
        }
    }
//    public static void spiralOrderPrint() {
//        int ar[][] = {{1, 2, 3, 4,  5},
//                      {6, 7, 8, 9, 10},
//                      {11,12,13,14,15},
//                      {16,17,18,19,20},
//                      {21,22,23,24,25}};
//        //inputing each element by user
//        /*
//        for (int i = 0; i <4;i++){
//            for (int j = 0; j<5;j++) {
//                System.out.print("for index [" + i + "][" + j + "]:- ");
//                ar[i][j] = scan.nextInt();
//            }
//            System.out.println();
//        }
//        */
//        //printing elements in normal way
//        for (int i = 0; i < ar.length; i++) {
//            for (int j = 0; j < ar[0].length ;j++) {
//                System.out.print(" " + ar[i][j] + " ");
//            }
//            System.out.println();
//        }
//        //spiral order
//        //method 1
//        /*
//    {
//        System.out.println();
//        int n = 4, m = 5, incriment = 0, decriment = 0, temp = 0;
//        int topLeft1 = 0, topLeft2 = 0;
//        int topRight1 = 0, topRight2 = m - 1;
//        int downLeft1 = n - 1, downLeft2 = m - 1;
//        int downRight1 = n - 1, downRight2 = 0;
//        //step 1 clear
//        while (incriment <= m - 2) {
//            System.out.print(" " + ar[topLeft2][incriment] + " ");
//            incriment++;
//        }
//        topLeft1 = 0 + 1;
//        topLeft2 = 0;
//        incriment = 0;
//        while (incriment <= n - 1) {
//            System.out.print(" " + ar[incriment][m - 1] + " ");
//            incriment++;
//        }
//        topRight1 = 0 + 1;
//        topRight2 = m - 2;
//        incriment = 0;
//        decriment = m - 2;
//        while (decriment >= 0) {
//            System.out.print(" " + ar[n - 1][decriment] + " ");
//            decriment--;
//        }
//        downRight1 = n - 2;
//        downRight2 = m - 2;
//        decriment = n - 2;
//        while (decriment >= topLeft1) {
//            System.out.print(" " + ar[decriment][temp] + " ");
//            decriment--;
//        }
//        downLeft1 = n - 2;
//        downLeft2 = 1;
//        incriment = n - 3;
//        while (incriment <= n - 1) {
//            System.out.print(" " + ar[topLeft1][incriment] + " ");
//            incriment++;
//        }
//        incriment = n - 2;
//        while (incriment <= n - 2) {
//            System.out.print(" " + ar[incriment][topRight2] + " ");
//            incriment++;
//        }
//        decriment = m - 3;
//        while (decriment >= m - 4) {
//            System.out.print(" " + ar[downRight1][decriment] + " ");
//            decriment--;
//        }
//    }
//        */
//        //method 2
//        {
//            int n=ar.length,m=ar[0].length;
//            int row_start =0;
//            int row_end =n-1;
//            int col_start =0;
//            int col_end =m-1;
//            System.out.println("spiral order:- ");
//            if(n==m){
////                step 1
////                row_start =0;
////                row_end =4;
////                col_start =0;
////                col_end =4;
//                for (int i = row_start; i <col_end; i++) {
//                    System.out.print(" " + ar[row_start][i] + " ");
//                }row_start++;
////                step 2
////                row_start =1;
////                row_end =4;
////                col_start =0;
////                col_end =4;
//                for (int i = col_start; i <col_end; i++) {
//                    System.out.print(" " + ar[i][row_end] + " ");
//                }
////                step 3
////                row_start =1;
////                row_end =4;
////                col_start =0;
////                col_end =4;
//                for (int i = row_end; i >col_start; i--) {
//                    System.out.print(" " + ar[row_end][i] + " ");
//                }col_end--;
////                step 4
////                row_start =1;
////                row_end =4;
////                col_start =0;
////                col_end =3;
//                for (int i = row_end; i >col_start; i--) {
//                    System.out.print(" " + ar[i][col_start] + " ");
//                }col_start++;
////                step 5
////                row_start =1;
////                row_end =4;
////                col_start =1;
////                col_end =3;
//                for (int i = row_start; i <row_end; i++) {
//                    System.out.print(" " + ar[col_start][i] + " ");
//                }row_end--;row_start++;
////                step 6
////                row_start =1;
////                row_end =3;
////                col_start =1;
////                col_end =3;
//                for (int i = row_start; i <=row_end; i++) {
//                    System.out.print(" " + ar[i][col_end] + " ");
//                }row_end--;
////                step 7
////                row_start =1;
////                row_end =2;
////                col_start =1;
////                col_end =3;
//                for (int i = row_end; i >=row_start; i--) {
//                    System.out.print(" " + ar[col_end][i] + " ");
//                }
////                row_start++;//row_start = 1
////                //step2
////                for (int i = 0; i < row_end; i++) {
////                    System.out.print(" " + ar[i][col_end] + " ");
////                }
////                //step3
//////            col_end=4;
////                for (int i = col_end; i >= row_start; i--) {
////                    System.out.print(" " + ar[row_end][i] + " ");
////                }
////                col_end--;//col_end = 3;
////                //step4
////                for (int i = col_end; i > row_start; i--) {
////                    System.out.print(" " + ar[i][col_start] + " ");
////                }
////                row_end--;//row_end=2
////                //step5
////                for (int i = col_start; i < col_end; i++) {
////                    System.out.print(" " + ar[row_start][i] + " ");
////                }
////                //step6
////                //row_start=1;
////                //col_end = 3;
////                //row_end =2;
////                for (int i = row_start; i < row_end; i++) {
////                    System.out.print(" " + ar[i][col_end] + " ");
////                }
////                row_start++;//row_start=2
////                col_start++;//col_start=1;
////                //step7
////                //row_start=2;
////                //col_end = 3;
////                //row_end =2;
////                //col_start=1;
////                for (int i = col_end; i >= col_start; i--) {
////                    System.out.print(" " + ar[row_end][i] + " ");
////                }
//            }
////            else if(n>m){ {
////                //step1
////                for (int i = 0; i < col_end; i++) {
////                    System.out.print(" " + ar[row_start][i] + " ");
////                }
////                row_start++;//row_start = 1
////                //step2
////                for (int i = 0; i < row_end; i++) {
////                    System.out.print(" " + ar[i][col_end] + " ");
////                }
////                //step3
//////            col_end=4;
////                for (int i = col_end; i >= row_start; i--) {
////                    System.out.print(" " + ar[row_end][i] + " ");
////                }
////                col_end--;//col_end = 3;
////                //step4
////                for (int i = col_end; i > row_start; i--) {
////                    System.out.print(" " + ar[i][col_start] + " ");
////                }
////                row_end--;//row_end=2
////                //step5
////                for (int i = col_start; i < col_end; i++) {
////                    System.out.print(" " + ar[row_start][i] + " ");
////                }
////                //step6
////                //row_start=1;
////                //col_end = 3;
////                //row_end =2;
////                for (int i = row_start; i < row_end; i++) {
////                    System.out.print(" " + ar[i][col_end] + " ");
////                }
////                row_start++;//row_start=2
////                col_start++;//col_start=1;
////                //step7
////                //row_start=2;
////                //col_end = 3;
////                //row_end =2;
////                //col_start=1;
////                for (int i = col_end; i >= col_start; i--) {
////                    System.out.print(" " + ar[row_end][i] + " ");
////                }
////            }}
////            else if(n<m){ {
////                //step1
////                for (int i = 0; i < col_end; i++) {
////                    System.out.print(" " + ar[row_start][i] + " ");
////                }
////                row_start++;//row_start = 1
////                //step2
////                for (int i = 0; i < row_end; i++) {
////                    System.out.print(" " + ar[i][col_end] + " ");
////                }
////                //step3
//////            col_end=4;
////                for (int i = col_end; i >= row_start; i--) {
////                    System.out.print(" " + ar[row_end][i] + " ");
////                }
////                col_end--;//col_end = 3;
////                //step4
////                for (int i = col_end; i > row_start; i--) {
////                    System.out.print(" " + ar[i][col_start] + " ");
////                }
////                row_end--;//row_end=2
////                //step5
////                for (int i = col_start; i < col_end; i++) {
////                    System.out.print(" " + ar[row_start][i] + " ");
////                }
////                //step6
////                //row_start=1;
////                //col_end = 3;
////                //row_end =2;
////                for (int i = row_start; i < row_end; i++) {
////                    System.out.print(" " + ar[i][col_end] + " ");
////                }
////                row_start++;//row_start=2
////                col_start++;//col_start=1;
////                //step7
////                //row_start=2;
////                //col_end = 3;
////                //row_end =2;
////                //col_start=1;
////                for (int i = col_end; i >= col_start; i--) {
////                    System.out.print(" " + ar[row_end][i] + " ");
////                }
////            }}
//        }
//    }
    public static void spiralOrder(){
        int ar[][] = {{1, 2, 3, 4,  5},
                      {6, 7, 8, 9, 10},
                      {11,12,13,14,15},
                      {16,17,18,19,20}};
        //inputing each element by user
        /*
        for (int i = 0; i <4;i++){
            for (int j = 0; j<5;j++) {
                System.out.print("for index [" + i + "][" + j + "]:- ");
                ar[i][j] = scan.nextInt();
            }
            System.out.println();
        }
        */
        //printing elements in normal way
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length ;j++) {
                System.out.print(" " + ar[i][j] + " ");
            }
            System.out.println();
        }
        //variable initilize
        int k=0,l=0,last_row=ar.length-1,last_col=ar[0].length-1;
        System.out.print("spiral order:- ");
        while (k<=last_row&&l<=last_col){
//            k=0,l=0,last_row=3,last_col=4
            for (int i=l;i<=last_col;i++){
                System.out.print(" "+ar[l][i]+" ");
            }k++;
            //            k=1,l=0,last_row=3,last_col=4
            for (int i=k;i<=last_row;i++) {
                System.out.print(" " + ar[i][last_col] + " ");
            }last_col--;
            if(k<=last_row){
                //            k=1,l=0,last_row=3,last_col=3
                for (int i=last_col;i>=l;i--) {
                    System.out.print(" " + ar[last_col][i] + " ");
                }last_row--;
            }
            if(l<=last_col){
                //            k=1,l=0,last_row=2,last_col=3
                for (int i=last_row;i>=k;i--) {
                    System.out.print(" " + ar[i][l] + " ");
                }l++;
            }
        }
    }
    public static void transPoseMatrix(){
        int matrix[][] = {
                {1, 2, 3, 4,  5},
                {6, 7, 8, 9, 10},
                {11,12,13,14,15}};
        int transpose[][] = new int[matrix[0].length][matrix.length];
        int rows = matrix.length;
        int cols = matrix[0].length;
        System.out.println("rows:-"+rows);
        System.out.println("cols:-"+cols);
        //inputing each element by user
        /*
        for (int i = 0; i <4;i++){
            for (int j = 0; j<5;j++) {
                System.out.print("for index [" + i + "][" + j + "]:- ");
                ar[i][j] = scan.nextInt();
            }
            System.out.println();
        }
        */
        //printing elements in normal way
        System.out.println("Matrix:- ");
        for (int i = 0; i < rows; i++) {
            System.out.print("[");
            for (int j = 0; j < cols;j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }System.out.print("]");System.out.println();
        }
//        inserting elements in transpose matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j< cols ;j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        //printing elements in transpose way
        System.out.println("Transpose Matrix:- ");
        for (int j = 0; j <cols; j++) {
            System.out.print("[");
            for (int i = 0; i < rows ;i++) {
                System.out.print(" " + transpose[j][i] + " ");
            }System.out.print("]");System.out.println();
        }

    }
    public static void main(String[] args) {
    transPoseMatrix();
    }
}