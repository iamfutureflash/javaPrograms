package practiceQuestion.level.easy;

import java.util.Arrays;

public class o5_facinating_number {
    public static boolean fascinating(long n) {
        boolean k =false;
        long m2 = n* 2L;
        long m3 = n* 3L;
        String b =n+""+m2+""+m3+"";
        long ar[] = new long[9];
        for(int i=0;i<ar.length;i++){
            ar[i] = Long.parseLong(b.substring(i,i+1));
        }
        Arrays.sort(ar);
        for(int i=0;i<ar.length;i++){
            if(ar[i] == i+1){
                k = true;
            }else{
                k=false;
            }
        }
        return k;
    }
    public static void main(String[] args) {
    boolean k = fascinating(879);
        System.out.println(k);
    }
}
