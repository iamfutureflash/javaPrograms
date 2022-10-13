package swing;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;

public class java_gui {
   private static void my_frame(){

       JFrame frame = new JFrame();//it creates a frame
       frame.setTitle("iamdosgod");
       frame.setResizable(true);
       frame.setVisible(true); //make frame visible
       frame.setSize(400,400);//sets the x-dimension,
       // and y-dimension of frame
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ImageIcon touch_id = new ImageIcon("swiftui.png");
       frame.setIconImage(touch_id.getImage());
       frame.getContentPane().setBackground(new Color(0, 255, 224, 98));

   }
   private static void JLabel_01(){
       
    }
    public static void main(String[] args) {
       my_frame();
    }
}
