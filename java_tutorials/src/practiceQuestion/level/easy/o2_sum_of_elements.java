package practiceQuestion.level.easy;

import java.util.Arrays;

public class o2_sum_of_elements {
    public static int sumOfArrayElement(int a[], int n, int k){
        int count = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            if(a.length/2!=0) {
                if (sum <= k) {
                    if (sum == k) {
                        return count;
                    }
                    sum += a[i];
                    count++;
                }
            }
            if(a.length/2==0) {
                if (sum <= k) {
                    if (sum == k) {
                        return count-1;
                    }
                    sum += a[i];
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int a[] = {2,3,4,1};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int n = a.length;
        int k = 3;
        int result = sumOfArrayElement(a,n,k);
        System.out.println("\n" + result);
    }
}
