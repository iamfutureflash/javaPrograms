package CodeWithHarry;
import java.util.Arrays;
import java.util.Scanner;
public class java_class_29_array_practice_set_6 {
    private static Scanner scan = new Scanner(System.in);
    private static void o1_sum_of_float(){
        float [] values = new float[5];
        System.out.println("length of array is :- " + values.length);
        float sum = 0;
        for (int i = 0; i < values.length; i++) {
            System.out.printf("enter value %d :- ",i);
            values[i] = scan.nextFloat();
            System.out.println(values[i]);
            sum = sum + values[i];
        }
        System.out.println("sum is :- " +  sum);
    }
    private static void o2_find_given_integer_is_present_or_not(){
          int [] find = {1,2,3,4,5,56};
          boolean isInArray = false;
          int check, num =0;
        System.out.print("enter which number you want to find:- ");
        check = scan.nextInt();
        for (int i = 0; i <find.length; i++) {
         if(check==find[i]){
             isInArray = true;
             num = find[i];
         }
            System.out.print(find[i]+ " ");
        }
        if(isInArray){
            System.out.printf("number %d is preset in the array",num);
        }
        else{
            System.out.printf("number is not preset in the array");
        }
    }
    private static void o3_avg_marks(){
        float sum = 0;
        float [] marks = {86.80f,86.00f,86.70f,86.30f,86.60f,86.70f,86.90f};
        for(float i : marks){
            sum = sum + i;
        }
        System.out.println("Average:- " + sum/marks.length);
    }
    private static void o4_addition_of_matrix(){
        int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{1,1,1},
                         {1,1,1}};
        int [][] mat3 = {{0,0,0},
                         {0,0,0}};

        System.out.println("length " + mat3.length);
        System.out.println("length " + mat3[0].length);

        for (int i = 0; i < mat3.length; i++) {
            for (int j = 0; j < mat3[i].length; j++) {
                 mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < mat3.length; i++) {
            for (int j = 0; j < mat3[i].length; j++) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println("");
        }
    }
    private static void o5_find_maximum_in_array(){
        int [] max = {84,1004,6,8000,400,2,96};
        int maxx = max[0], y=1;
        for (int i = 0; i < max.length-1 ; i++) {
            if(maxx>max[y]){
                //if it is true go for next for loop
                y++;
            }
            else{
                maxx=max[y];
                y++;
            }
        }
        System.out.println("max is :- " + maxx);
    }
    private static void o6_reverse_of_array(){
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        System.out.println(arr.length);
        System.out.print("in normal order:- ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        int temp=0, div= arr.length/2, x, y;
        x = y = div;

        System.out.println();
        if(arr.length%2==0) {
            x = x-1;
        }
        if(arr.length%2!=0) {
            x=x-1;
            y=y+1;
        }
        System.out.print("in reverse order:- ");
        for (int j = 0; j <=div-1; j++) {
                temp = arr[x];arr[x] = arr[y];arr[y] = temp;
                x--;y++;
        }
                for (int i = 0; i < arr.length ; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
    private static void o7_find_array_is_sorted_or_not(){
        int [] a = new int[5];
        for (int i = 0; i < a.length ; i++) {
            System.out.printf("enter %d element:- ",i);
            a[i] = scan.nextInt();
        }
        if(a[0]<a[1]){
            System.out.println("array is sorted");
        }
        else {
            System.out.println("array is not sorted");
        }
    }
    public static void main(String[] args) {
        //o1_sum_of_float();//done
        //o2_find_given_integer_is_present_or_not(); //done
        //o3_avg_marks();//done
        //o4_addition_of_matrix();//done
        //o5_find_maximum_in_array();//done
        // o6_reverse_of_array();//done
        //o7_find_array_is_sorted_or_not();//done
    }
}
