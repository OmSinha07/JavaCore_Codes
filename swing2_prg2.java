import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.NumberFormatter;

import java.text.*;
import java.util.*;
import javax.swing.*;


class MyFrame extends JFrame
{
    JFrame f1;
    JTextField tf;
    JFormattedTextField tf2;
    JFormattedTextField tf3;
    MyFrame()
    {
        f1=new JFrame();
        tf=new JTextField(15);
        //Date Format
        DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        tf2=new JFormattedTextField(df);
        tf2.setValue(0);
        tf2.setColumns(15);
        
        //Number Format
        NumberFormat nf=NumberFormat.getCurrencyInstance();
        NumberFormatter nf2=new NumberFormatter(nf);
        nf2.setAllowsInvalid(false);
        nf2.setMaximum(100000);
        tf3=new JFormattedTextField(nf2);
        tf3.setColumns(15);
        tf3.setValue(0);
        
        add(tf);
        add(tf2);
        add(tf3);
        
        setLayout(new FlowLayout());
    }
}
public class swing2_prg2 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
