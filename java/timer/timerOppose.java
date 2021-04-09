package timer;

import java.awt.*;
import java.awt.event.*;
import java.time.Instant;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class timerOppose 
{
    public static void main(String[] args) {
        var listener = new clickListener();

        JOptionPane.showMessageDialog(null, "try to click this bottom");
        
    }    
}

class clickListener implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
