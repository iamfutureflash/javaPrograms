package JavaByApnaCollage;

import java.util.Scanner;

public class CJPC_L12_Strings_Lecture_12 {
    public static Scanner scan = new Scanner(System.in);
    public static void q1_totalLengthOfStringArray(){
//        Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
        int size, totalLengthOfStringArray = 0;;
        String string[];
        System.out.print("enter size of string:- ");size = scan.nextInt();
        string = new String[size];
        System.out.println("start:-");
        for (int i = 0; i < size;i++){
            System.out.print("enter string at index "+(i+1)+" :- ");
            string[i] = scan.nextLine();
            totalLengthOfStringArray += string[i].length();
        }
        System.out.println("Total length:- "+ totalLengthOfStringArray);
    }
    public static void q2_replaceLetter_e_with_i(){
//        Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
        String str;
        System.out.print("enter string:-");str = scan.next();
        System.out.println("original string:- " + str);
        System.out.println("replaced string:- " + str.replace("e","i"));
    }
    public static void q3_createUserNameFromEmail(){
//        Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
//        Example :
//        email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
//        email = “helloWorld123@gmail.com”; username = “helloWorld123”
        System.out.print("enter email:- ");
        String email = scan.next();
        String username = "";
        for (int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            }else {
                username += email.charAt(i);
            }
        }
        System.out.println("username:- " + username);
        System.out.println("email:- " + email);
    }
    public static void main(String[] args) {
        /*
        * using sub string
        String sentence ="hi may name puneet";
        String name = sentence.substring(12);
        System.out.println(name +" "+ sentence.contains("puneet") +" " +
                sentence.endsWith("puneet"));
        */
//        q3_createUserNameFromEmail();
    }
}