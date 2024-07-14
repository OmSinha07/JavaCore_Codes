import java.awt.*;
import java.awt.event.*;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
class MyInternalFrame extends JInternalFrame 
{//Documents inside Jframe
    static int count=0;
    JTextArea ta;
    JScrollPane sp;
    JDesktopPane dp;
    MyInternalFrame()
    {
        super("Document"+"count");
        ta=new JTextArea();
        sp=new JScrollPane();
        add(sp);
        dp=new JDesktopPane();
        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenuItem m1=new JMenuItem("Save");
        JMenuItem m2=new JMenuItem("Exit");
        file.add(m1);
        file.add(m2);
        mb.add(file);
        setJMenuBar(mb);

        setSize(300,300);
        setLocation(50,50);
        setVisible(true);
    }
   
  

}

class MyFrame extends JFrame implements ActionListener
{
   JDesktopPane dp;//THIS ALLOWS INTERNAL FRAME
    MyFrame()
    {
        dp=new JDesktopPane();
        setContentPane(dp);//set innernal frame
       
        JMenuBar mb=new JMenuBar();
        JMenu d=new JMenu("Document");
        JMenuItem s=new JMenuItem("new");
        JMenuItem m2=new JMenuItem("Exit");
        d.add(s);
        d.add(m2);
        mb.add(d);
        setJMenuBar(mb);
        s.addActionListener(this);
        m2.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        MyInternalFrame mi=new MyInternalFrame();
        if(e.getActionCommand()=="new")
        {
      
      dp.add(mi); 
    }
    if(e.getActionCommand()=="Exit")
    {
        System.exit(0);
    }
}
}
public class swing7_prg7 {
    public static void main(String[] args) {
       MyFrame f=new MyFrame();
       f.setSize(500,500);
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}
