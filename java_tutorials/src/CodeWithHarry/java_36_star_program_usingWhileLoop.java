package CodeWithHarry;

public class java_36_star_program_usingWhileLoop {
    public static void main(String[] args) {
int i=1,j=1,n=4;
        while(i<=4){
            j=1;
            while(j<=n){
                System.out.print("*");
                j++;
            }
            n--;
            System.out.println();
            i++;
        }
    }
}
