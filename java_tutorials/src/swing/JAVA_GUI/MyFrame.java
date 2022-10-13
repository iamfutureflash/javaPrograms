package swing.JAVA_GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        JFrame frame = new JFrame();//creating a frame
        frame.setTitle("Hero Man");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(420,420);//this set the x-dim and y-dim
        frame.setVisible(true);
        ImageIcon image = new ImageIcon("image.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.gray);
    }
}
