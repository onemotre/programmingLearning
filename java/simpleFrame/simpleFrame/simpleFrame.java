package simpleFrame.simpleFrame;

import java.awt.*;
import javax.swing.*;

public class simpleFrame{
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
        {
            var frame = new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setTitle("My First Frame program");
            Image img = new ImageIcon("caada36faa6d85451a3e29cf4541658d.png").getImage();
            frame.setIconImage(img);
        });
    }
}
class SimpleFrame extends JFrame
{
    private static final long serialVersionUID = 1L;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public SimpleFrame()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}