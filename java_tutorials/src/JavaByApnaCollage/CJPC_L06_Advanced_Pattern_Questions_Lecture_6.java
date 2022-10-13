package JavaByApnaCollage;
public class CJPC_L06_Advanced_Pattern_Questions_Lecture_6 {
    public static void q12() {
        int n = 4, z = 1, x = 8;
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (j <= z || j >= x) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            if (i < 4) {
                z++;
                x--;
            } else if (i > 4) {
                z--;
                x++;
            }
        }
    }
    public static void q13() {
        int x=4,y=4;
        //outer loop
        for (int i = 1; i <= 8; i++) {
            //inner loop
            for (int j = 1; j <= 7; j++) {
                if (j>=x&&j<=y) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            if(i<4){
                x--;
                y++;
            } else if (i > 4) {
                x++;
                y--;
            }
        }
    }
    public static void q14() {
        int x=4,y=8;
        //outer loop
        for (int i = 1; i <= 5; i++) {
            //inner loop
            for (int j = 1; j <= 8; j++) {
                if (j==x || j==y || (i==1&&j>=4) || (i==5&&j<=5)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            x--;
            y--;
        }
    }
    public static void q15() {
        int x=5,y=5,n=1,m=2,a=3,b=5;
        boolean k =true;
        //outer loop
        for (int i = 1; i <= 5; i++) {
            //inner loop
            n=1;
            for (int j = 1; j <= 9; j++) {
                if (j>=x&&j<=y&&k) {
                    System.out.print(" " + n + " ");
                } else {
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
    }//pending
    public static void q16() {
        int n=1;
        //outer loop
        for (int i = 1; i <= 5; i++) {
            //inner loop
            n=1;
            for (int j = 1; j <= 5; j++) {
                if (j<=i) {
                    System.out.print(" "+n+" ");
                    n++;
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void q17() {
        int n=5;
        //outer loop
        for (int i = 1; i <= 5; i++) {
            //inner loop
            for (int j = 1; j <= 5; j++) {
                if (j<=n) {
                    System.out.print(" "+i+" ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            n--;
        }
    }
    public static void main(String[] args) {
        q15();
    }

}