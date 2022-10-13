package CodeWithHarry;

public class java_27_print_50_odd_natural_numbers {
    public static void main(String[] args){
        int j=1;
        for(int i=1;i<=100;i++) {
            if(i%2!=0){
                System.out.printf("%d\t->\t%d \n",j,i);
//                System.out.println();
                j++;
            }

        }
    }
}
