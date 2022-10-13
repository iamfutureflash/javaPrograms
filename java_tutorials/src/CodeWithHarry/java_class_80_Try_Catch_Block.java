package CodeWithHarry;

public class java_class_80_Try_Catch_Block {
    public static void main(String[] args) {
        int a =50;
        int b = 0;

        //Without try and catch
//        System.out.println(c);
//        With try and catch
        try {
            int c = a / b;
            System.out.println("The result is " + c);
        }
        catch(Exception e) {
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
