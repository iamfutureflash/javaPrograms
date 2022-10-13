package practiceQuestion.level.easy;

public class o3_perfect_array {
    public static boolean IsPerfect(int a[], int n)
    {
        int x =0,left = 0 ,right = 0;
        int max = a.length;
        boolean k = false;
        if(a.length/2!=0){
            x = a.length/2;
            left = x-1;
            right = x+1;
        }else if(a.length/2==0){
            x = a.length/2;
            left = x-1;
            right = x;
        }
        try {
            while (left != -1 && right != max) {
                if (a[left] == a[right]) {
                    k = true;
                } else {
                    k = false;
                }
                left--;
                right++;
            }
            if (k == true) return true;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,2,1};
        int n = a.length;
        boolean b = IsPerfect(a,n);
        System.out.println(b);
    }
}
