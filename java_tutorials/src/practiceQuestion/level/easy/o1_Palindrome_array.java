package practiceQuestion.level.easy;
public class o1_Palindrome_array {
    public static int PalinArray(int arr[], int n){
        for(int i=0; i<n; i++) {
            int answer = 0;
            int temp = arr[i];
            while(temp>0){
                int r = temp%10;
                temp = temp/10;
                answer = (answer*10)+r;
            }
            if(answer!=arr[i]){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,141,115};
        int result = PalinArray(arr, 5);
        System.out.println(result);
    }
}
