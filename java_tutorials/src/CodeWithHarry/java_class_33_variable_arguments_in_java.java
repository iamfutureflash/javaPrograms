package CodeWithHarry;

public class java_class_33_variable_arguments_in_java {
    public static int sum(int ...a){
        int result = 0;
        for(int element:a){
            result += element;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(sum(2,3));
        System.out.println(sum(50,50,50,50));
    }
}
