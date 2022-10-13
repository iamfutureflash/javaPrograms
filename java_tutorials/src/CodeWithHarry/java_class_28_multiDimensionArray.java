package CodeWithHarry;

public class java_class_28_multiDimensionArray {
    public static void main(String[] args) {
        String flore[][] = new String[2][2];

        flore[0][0] = "room 1";flore[0][1] = "room 2";
        flore[1][0] = "room 3";flore[1][1] = "room 3";

        System.out.println("length of array is :- " + flore.length);
        for (int i = 0; i <flore.length; i++) {
            if(i==0)
                System.out.println("papa ke pass h ");
            else if(i==1)
                System.out.println("mummy ke pass h ");
            for (int j = 0; j <flore.length ; j++) {
                System.out.print(flore[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
