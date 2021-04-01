package timer;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;

public class timerTest
{
    public static void main(String[] args) {
        var lisntener = new TimePrinter();
        var timer = new Timer(1000, lisntener);
        timer.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
    
    
}
class TimePrinter implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("At tone , the time is" + Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}