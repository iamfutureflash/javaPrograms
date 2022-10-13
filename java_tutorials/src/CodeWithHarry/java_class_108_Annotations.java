package CodeWithHarry;

public class java_class_108_Annotations {
    @SuppressWarnings("deprecated")
    public static void main(String[] args) {
        int b = add(5,5);
        System.out.println(b);
    }
    @Deprecated
    public static int add(int i, int j){
        return i+j;
    }
}
