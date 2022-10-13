package JavaByApnaCollage;

public class CJPC_L16_Sorting_Bubble_Sort_Selection_Sort_and_Insertion_Sort_Lecture_16 {
    public static void bubleSort(int a[]){
        int t = 0;
        for (int i = 0; i < a.length-2; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j]>a[j+1]){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]+" ");
        }
    }
    public static void SelectionSort(int a[]){
        for (int i = 0;i < a.length-3; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]+" ");
        }
    }
    public static void InsertionSort(int a[]){
        for (int i = 1;i < a.length; i++) {
            int current = a[i];
            int j = i-1;
            while(j>=0 && current < a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = current;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]+" ");
        }
    }
    public static void main(String[] args) {
    int a[] = {5,4,3,1,2};
    InsertionSort(a);
    }
}