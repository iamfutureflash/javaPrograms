package CodeWithHarry;

public class java_34_star_pattern_using_while_loop {
    public static void main(String[] args) {
        int i=1,j=1,n=4;
        while(i<=4){
            while (j<=4){
                System.out.print("#");
                n--;
                j++;
            }
            i++;
        }
    }
}