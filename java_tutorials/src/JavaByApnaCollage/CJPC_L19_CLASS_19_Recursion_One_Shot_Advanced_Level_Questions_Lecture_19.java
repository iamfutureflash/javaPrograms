package JavaByApnaCollage;

import java.util.ArrayList;

public class CJPC_L19_CLASS_19_Recursion_One_Shot_Advanced_Level_Questions_Lecture_19 {
    public  static void o1printPermutation(String str, String permutation){
        if(str.length()==0){
            System.out.println(" " + permutation + " ");
            return;
        }
        for (int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            o1printPermutation(newStr,permutation+currChar);
        }
    }
    public  static int o2countPaths(int i, int j, int n, int m){
        //base case
        if(i==n || m==m){
            return 0;
        }
        if(i==n-1 && m==m-1){
            return 1;
        }
        //move down
        int downPaths = o2countPaths(i+1,j,n,m);
        //move right
        int rightPaths = o2countPaths(i,j+1,n,m);

        return downPaths + rightPaths;
    }
    public  static int o3placeTiles(int n, int m){
        if(n==m){return 2;}
        if(n<m){return 1;}
        //vertically
        int vertPlacement = o3placeTiles(n-m,m);
        // horizontally
        int horiPlacement = o3placeTiles(n-1,m);
        return vertPlacement + horiPlacement;
    }
    public  static int o4callGuests(int n){
    if(n<=1){
        return 1;
    }
        //single
        int ways1 = o4callGuests(n-1);
       //pair
        int ways2 = (n-1)*o4callGuests(n-2);
        return ways1+ways2;
    }
    public  static  void printSubset(ArrayList<Integer> subset){
        for(int i=0; i<subset.size();i++){
            System.out.print(" " + subset.get(i) + " ");
        }
        System.out.println();
    }
    public  static  void o5findSubset(int n, ArrayList subset){
        if(n==0){
            printSubset(subset);
            return;
        }
        //add hoga
        subset.add(n);
        o5findSubset(n-1,subset);
        //add nahi hoga
        subset.remove(subset.size()-1);
        o5findSubset(n-1,subset);

    }
    public static void main(String[] args) {
        int n= 3;
        ArrayList<Integer> subset= new ArrayList<Integer>();
        o5findSubset(n,subset);
    }
}