package GFG.ProblemOfTheDay;
//link of the problem https://practice.geeksforgeeks.org/problems/max-min/1

public class _01_Thu_Oct_13_MaxMin {
    public static void main(String[] args) {
       int A[] = {1,2,3,-3};
       int N=A.length;
        System.out.println(findSum(A,N));
    }
    public static int findSum(int A[],int N){
        //code here
        // for min and max
        int min =0;
        int max =0;
        for(int i=0;i<N;i++){
            if(A[i]<min){
                min = A[i];
            }
            if(A[i]>max){
                max = A[i];
            }
        }
        System.out.println(min + " " +  max);
        int sum = min + max;
        return sum;

    }
}
