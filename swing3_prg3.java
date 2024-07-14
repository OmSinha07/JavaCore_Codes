import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;
import java.util.*;
class MyFrame extends JFrame implements ActionListener
{
   JCheckBox c1,c2;
   JRadioButton r1,r2;

   JTextField tf;
   MyFrame()
   {//checkbox,radio,
      super("TextModifier");
      tf=new JTextField("",20);
      tf.setBounds(10,20,1000,80);
    
    c1=new JCheckBox("BOLD");
    c2=new JCheckBox("ITALIC");
    c1.setMnemonic(KeyEvent.VK_B);
    c2.setMnemonic(KeyEvent.VK_F);
   
    r1=new JRadioButton("UPPER");
    r2=new JRadioButton("LOWER");
    ButtonGroup bgb=new ButtonGroup();
    bgb.add(r1);
    bgb.add(r2);
    

    c1.addActionListener(this);
    c2.addActionListener(this);
    
    r1.addActionListener(this);
    r2.addActionListener(this);
    
  

    setLayout(new FlowLayout());
    
    add(tf);
    add(c1);
    add(c2);
    add(r1);
    add(r2);

   }
 
   @Override
   public void actionPerformed(ActionEvent e) {
      switch(e.getActionCommand())
      {
         case "LOWER":tf.setText(tf.getText().toLowerCase());
            break;
         case "UPPER":tf.setText(tf.getText().toUpperCase());
            break;
      }
      int b=0,i=0;
      if(c1.isSelected())
         b=Font.BOLD;
         if(c2.isSelected()) 
         i=Font.ITALIC;
      Font f=new Font("Times New Roman",b|i,15);
      tf.setFont(f);
   }

}
public class swing3_prg3 {
   public static void main(String[] args) {
     MyFrame f=new MyFrame();
     f.setSize(500,500);
     f.setVisible(true);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   } 
}
