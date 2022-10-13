package CodeWithHarry;
import java.util.Scanner;
public class java_class_26__introduction_to_array {
                public static void main(String[] args){
                    Scanner scan = new Scanner(System.in);
//                    System.out.print("enter how many value you want to enter:- ");
//                    int n = scan.nextInt();
//
                    int [][] value = new int[2][3];
                    for(int i=0;i<2;i++){
                        for(int j=0;j<3;j++) {
                            System.out.printf("enter[%d][%d] value:- ",i,j);
                            value[i][j] =scan.nextInt();
                        }
                        System.out.println();
                    }
                    for(int i=0;i<2;i++){
                        for(int j=0;j<3;j++) {
                            System.out.printf(" [%d] ",value[i][j]);
                        }
                        System.out.println();

                        if(i<2){
                            System.out.printf("length of value array is [ %d ]\n",value.length);
                            System.out.printf("length of value array is [ %d ]\n",value[i].length);
                        }
                    }


//                    int [] value = new int[n];
//                    int [] value;
//                    value = new int[5];
//                    int [] value = {1,2,3,4};
//                    for(int i=1;i<=n;i++){
//                        System.out.printf("enter %d value:- ",i);
//                        value[i-1] = scan.nextInt();
//                    }
//                    System.out.printf("length of value array is [ %d ]\n",value.length);
//                    for(int i=1;i<=n;i++){
//                        System.out.printf("%d  ",value[i-1]);
//                    }
//                    System.out.println();
//                    for(int i: value){
//                        System.out.println(i);
//                    }
                }
}
