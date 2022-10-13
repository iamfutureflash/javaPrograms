package JavaByApnaCollage;

public class CJPC_L22_Merge_Sort_Lecture_22 {

    public static void conquer(int ar[], int si , int mid, int ei){
        int merger[] = new int[ei - si +1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        while(idx1 <= mid && idx2 <= ei){
            if(ar[idx1]<=ar[idx2]){
                merger[x++] = ar[idx1++];
            }else{
                merger[x++] = ar[idx2++];
            }
        }
        while(idx1<= mid){
            merger[x++] = ar[idx1++];
        }
        while(idx2<ei){
            merger[x++] = ar[idx2++];
        }
        for(int i=0,j=si; i<merger.length;i++,j++){
            ar[j] = merger[i];
        }
    }
    public static  void divide(int ar[], int si, int ei){
        if(si>=ei){
            return ;
        }
        int mid = si + (ei - si )/2;
        divide(ar, si, mid);
        divide(ar, mid+1, ei);
        conquer(ar,si,mid,ei);
    }
    public static void main(String[] args) {
    int ar[] = {6,3,9,5,2,8};
    int n = ar.length;
        divide(ar,0,n-1);
        //print
        for(int i=0;i<n;i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}