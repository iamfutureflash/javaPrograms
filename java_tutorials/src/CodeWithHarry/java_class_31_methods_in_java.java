package CodeWithHarry;

public class java_class_31_methods_in_java {
    public static void print_(){
        System.out.println("good morning bro!");
    }
    public static void print_(int a){
        System.out.println("good morning " + a + " bro! ");
    }
    public static void print_(String a, String b){
        System.out.printf("good morning %s and %s bro!",a,b);
    }
    public static void main(String[] args) {
        print_();
        print_(3000);
        print_("puneet vaishnav","shlok sharma" );
    }
}
