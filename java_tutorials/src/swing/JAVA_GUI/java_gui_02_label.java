package swing.JAVA_GUI;

import javax.swing.*;
import java.awt.*;

public class java_gui_02_label {
    public static void main(String[] args) {
        JFrame frame = new JFrame();//creating a frame
        frame.setTitle("Hero Man");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(420,420);//this set the x-dim and y-dim
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.gray);
        JLabel l1 = new JLabel();
        l1.setText("hi hero ");
        ImageIcon image = new ImageIcon("image.png");
        l1.setIcon(image);
        frame.add(l1);
    }
}
