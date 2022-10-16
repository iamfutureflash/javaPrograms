package leetcode.Array;

import java.util.ArrayList;
import java.util.List;

public class _412_Fizz_Buzz {
    public static void main(String[] args) {
        List<String> List = new ArrayList<String>();
        int n=5;
        List = fizzBuzz(n);
        for (int i = 0; i <n ; i++) {
            if(i==n){
                break;
            }
            System.out.println(List.get(i));
        }
    }
    public static List<String> fizzBuzz(int n) {
        List<String> List = new ArrayList<String>();
        for (int i = 1; i <=n ; i++) {
            if(i%3==0&&i%5==0){
                List.add("FizzBuzz");
            }else if(i%3==0){
                List.add("Fizz");
            }else if(i%5==0){
                List.add("Buzz");
            }else{
                List.add(String.valueOf(i));
            }
            if(i==n){
                return List;
            }
    }
        return List;
    }
}
