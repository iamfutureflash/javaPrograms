package JavaByApnaCollage;

import java.util.HashSet;

public class CJPC_L18_Recursion_in_One_Shot_9_Best_Problems_Lecture_18 {
    public static StringBuilder a = new StringBuilder();
    public static StringBuilder b = new StringBuilder();
    public static StringBuilder c = new StringBuilder();
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return ;
        }
        towerOfHanoi(n-1, src,dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1,helper,src,dest);
    }
    public static void reverseString(String str, int idx){
        if(idx==0){
            System.out.print(" " + str.charAt(idx) + " ");
            return ;
        }
        System.out.print(" " + str.charAt(idx) + " ");
//        System.out.print(" " + str.substring(idx,idx+1) + " ");
        reverseString(str, idx-1);
    }
    public static void firstAndLastOccuranceOfString(String str, int idx, int first, int last, char element){
        if(idx == str.length()-1){
            System.out.print(" " + str.charAt(idx)  + " ");
            System.out.println("\nfirst element :- " + str.charAt(first) + " first index:- "+ first + "\nlast element :- " + str.charAt(last) + " last index:- "+ last );
            return;
        }
        char currentCharr = str.charAt(idx);
        if(currentCharr == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        System.out.print(" " + str.charAt(idx)  + " ");
        firstAndLastOccuranceOfString(str, idx+1,first,last, element);
    }
    public static boolean isSorted(int a[],int idx) {
        if (idx == a.length - 1) {
            return true;
        }
        if (a[idx] >= a[idx + 1]) {
            //array is unsorted and equal
            return false;
        }
        return isSorted(a, idx + 1);
    }
    public static void moveElementEndOfString(StringBuilder mainString, StringBuilder newString, StringBuilder moveElement, char element, int idx) {
        //base case
        if(idx == mainString.length()){
            newString.append(moveElement);
            System.out.println("original String is :- " + mainString);
            System.out.println("new String is :- " + newString);
            return;
        }
        if(mainString.charAt(idx) == element){
            moveElement.append(mainString.charAt(idx));
        }else{
            newString.append(mainString.charAt(idx));
        }
        moveElementEndOfString(mainString, newString,moveElement,element,idx+1);
    }
    public static void moveAllx(String mainString, String newString, int idx, char x, int count) {
//        base case
        if(idx==mainString.length()){
            for(int i=0;i<count;i++){
                newString+=x;
            }
            System.out.println("original String:- " + mainString);
            System.out.println("new String:- " + newString);
            return;
        }
        char element = mainString.charAt(idx);
        if(element == x){
            count++;
            moveAllx(mainString,newString,idx+1,x,count);
        }else{
            newString+= element;
            moveAllx(mainString,newString,idx+1,x,count);
        }
    }
    public static boolean map[] = new boolean[26];
    public static void removeAllDuplicates(String mainString, String newString, int idx) {
    //base case
     if(idx == mainString.length()){
         System.out.println("original String:- " + mainString);
         System.out.println("new String:- " + newString);
         return;
     }
     char currentCharr = mainString.charAt(idx);
     if(map[currentCharr-'a'] == true){
         removeAllDuplicates(mainString, newString, idx+1);
     }else{
         newString+=currentCharr;
         map[currentCharr-'a'] = true;
         removeAllDuplicates(mainString, newString, idx+1);
     }
    }
    public static void subsequence(String mainString, String newString, int idx) {
    //base case
        if(idx == mainString.length()){
            System.out.println(newString);
            return;
        }
        char currentCharr = mainString.charAt(idx);
     // to be
        subsequence(mainString, newString +currentCharr, idx+1);
     //or not to be
        subsequence(mainString, newString, idx+1);
        }
    public static void subsequenceWithUniqueSequence(String mainString, String newString, int idx, HashSet<String> set) {
    //base case
        if(idx == mainString.length()){
            if(set.contains(newString)){
                return;
            }else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currentCharr = mainString.charAt(idx);
     // to be
        subsequenceWithUniqueSequence(mainString, newString +currentCharr, idx+1,set);
     //or not to be
        subsequenceWithUniqueSequence(mainString, newString, idx+1,set);
        }
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printCombinations(String mainString, String combination, int index) {
    //base case
        if(index == mainString.length()){
            System.out.println(combination);
            return;
        }
        char currentCharr = mainString.charAt(index);
        String mapping = keypad[currentCharr-'0'];
        for(int i = 0; i <mapping.length();i++) {
            printCombinations(mainString, combination + mapping.charAt(i), index+1);
        }
        }

    public static void main(String[] args) {
//        String name = "puneet vaishnav";
//        char findWord = 'n';
//        int first;
//        int last;
//        first = last = -1;
//        firstAndLastOccuranceOfString(name,0,first,last ,findWord);
//        towerOfHanoi(2,"S","H","D");
//        System.out.println(isSorted(a,0));

//        a.append("axbcxxd");
//        removeAllDuplicates("abcc","",0);
        HashSet<String> set = new HashSet<String>();
    printCombinations("012","",0);
    }
}