package JavaByApnaCollage;

import java.util.Scanner;

public class CJPC_L15_Arrays_Introduction_Lecture_15 {
    public static Scanner scan = new Scanner(System.in);
        public static void getBit ( int number, int position){
        int bitMask = 1 << position;
        if ((bitMask & number) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }
    }
        public static void setBit ( int number, int position){
        int bitMask = 1 << position;
        int newNumber = bitMask | number;
        System.out.println("new number:- " + newNumber);
    }
    public static void clearBit(int number,int position) {
        int bitMask = 1<<position;
        int not = ~(bitMask);
        int final_number = not & number;
        System.out.println(final_number);
    }
    public static void updateBit(int number,int position) {
        System.out.print("enter change bit 1->(0->1) , 0->(1->0):- ");
        int changeBit = scan.nextInt();
        if(changeBit == 1){
            setBit(number,position);
        }else{
            clearBit(number,position);
        }
    }
    public static void main(String[] args) {

            System.out.print("enter number:- ");
            int number = scan.nextInt();
            System.out.print("get position:- ");
            int position = scan.nextInt();
            getBit(number, position);
            setBit(number, position);
            clearBit(number, position);
            updateBit(number, position);
    }
}