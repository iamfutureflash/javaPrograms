package CodeWithHarry;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//problem 02 and 03
class add{
    @Deprecated @SuppressWarnings("Deprecated")
    public int add(int x,int y){
        return x+y;
    }
}
interface hello{
 void hello();
}
public class java_class_112_Advanced_Java_2_Practice_Set {
    public static void main(String[] args) {
        /*
        add a = new add();
        a.add(5,5);
        hello hl = new hello() {
            @Override
            public void hello(){
                System.out.println("hello");
            }
        };

        hello hl = ()->{System.out.println("hello");};
        hl.hello();
        */
        try {
            FileWriter fileWriter = new FileWriter("table.txt");
            for(int j=1;j<=10;j++) {
                for (int i = 1; i <= 10; i++) {
                    fileWriter.write(i + "x" + j + "=" + i * j + "\n");
                }
                fileWriter.write("\n\n");
            }
            System.out.println("table is created");
            fileWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        try{
            File myfile = new File("table.txt");
            Scanner scan = new Scanner(myfile);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
