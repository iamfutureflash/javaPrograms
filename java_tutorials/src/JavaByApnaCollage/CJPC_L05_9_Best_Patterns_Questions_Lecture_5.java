package JavaByApnaCollage;

import java.util.Scanner;

public class CJPC_L05_9_Best_Patterns_Questions_Lecture_5 {
    public static void q1(){
        for (int i = 0; i <4;i++){
            for (int j = 0; j <5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void q2(){
        int n =1;
        for (int i = 1; i <=4;i++){
            for (int j = 1; j <=5;j++){
                if(i==1 || i==4 || j==1 || j==5){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
    }
    public static void q3() {
        for (int i = 1; i <=4;i++){
            for (int j = 1; j <=i;j++){
                    System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void q4() {
        int n= 4;
        for (int i = 1; i <=4;i++){
            for (int j = 1; j <=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
            n--;
        }
    }
    public static void q5() {
        int n= 4;
        for (int i = 1; i <=4;i++){
            for (int j = 1; j <=4;j++){
                if(j>=n) {
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
            n--;
        }
    }
    public static void q6() {
        int n;
        for (int i = 1; i <=5;i++){
            n=1;
            for (int j = 1; j <=5;j++){
                if(j<=i){System.out.print(" "+n+" ");}
                else{System.out.print("   ");}
                n++;
            }
            System.out.println();
            n--;
        }
    }
    public static void q7() {
        int n,m=5;
        for (int i = 1; i <=5;i++){
            n=1;
            for (int j = 1; j <=5;j++){
                if(j<=m){System.out.print(" "+n+" ");}
                else{System.out.print("   ");}
                n++;
            }
            System.out.println();
            m--;
        }
    }
    public static void q8() {
        int n=1;
        for (int i = 1; i <=5;i++){
            for (int j = 1; j <=5;j++){
                if(j<=i){
                    System.out.print(" "+n+" ");
                    n++;
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void q9() {
        int n=1;
        for (int i = 1; i <=5;i++){
            for (int j = 1; j <=5;j++){
                if(j<=i){
                    System.out.print(" "+n+" ");
                }else{
                    System.out.print("   ");
                }
                if(n==1){
                    n=0;
                }
                else if(n==0){
                    n=1;
                }
            }
            System.out.println();
        }
    }
    public static void q10() {
        int five=5, nine=9,x=5,y=9;
        for (int i = 1; i <=five;i++){
            for (int j = 1; j <=nine;j++){
                if(j<=y&&j>=x){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
            y--;x--;
        }
    }
    public static void q11() {
        int five=5,nine=9,x=5,y=5;
        boolean k =true;
        for (int i = 1; i <=five;i++){
            for (int j = 1; j<=nine;j++){
                if(j>=x&&j<=y&&k){
                    System.out.print(" "+i+" ");
                }else{
                    System.out.print("   ");
                }
                if(k==true){
                    k=false;
                }
                else if(k==false){
                    k=true;
                }
            }
            System.out.println();
            x--;
            y++;
        }
    }
    public static void q12() {
        int five=5,nine=9,x=5,y=5,z=1,n=1;
        //outer loop
        for (int i = 1; i <=five;i++){
            //inner loop
            for (int j = 1; j<=nine;j++){
                if(j>=x&&j<=y){
                    if(j<=4){
                        System.out.print(" "+z+" ");
                        z--;
                    }
                    else if(j>4){
                        System.out.print(" "+z+" ");
                        z++;
                    }
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
            x--;
            y++;
            n++;
            z=n;
        }
    }
    public static void main(String[] args) {
        q12();
    }
}