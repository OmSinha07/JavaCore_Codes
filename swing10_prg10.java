import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class MyFrame extends JFrame implements ActionListener 
{//Files
    JToolBar tb;
    JButton b1,b2,b3,b4,b5,b6,b7;
    JTextArea ta;

    MyFrame()
    {
        super("Toolbar Demo");
        tb=new JToolBar();
        b1=new JButton("Color");
        b2=new JButton("All files");
       

        tb.add(b1);
        tb.add(b2);
    

        ta=new JTextArea();
        JScrollPane sp=new JScrollPane(ta);
        add(tb,BorderLayout.NORTH);
        add(sp,BorderLayout.CENTER);

       JMenuBar mb=new JMenuBar();
       JMenu file=new JMenu("File");
       JMenuItem m1=new JMenuItem("save");
       JMenuItem m2=new JMenuItem("open");
       m2.setMnemonic(KeyEvent.VK_O);
        
       file.add(m1);
       file.addSeparator();
       file.add(m2);
       mb.add(file);
       setJMenuBar(mb);
              
       b2.setActionCommand("open");
       
       b2.addActionListener(this);
       m2.addActionListener(this);
       b1.addActionListener(this);
       m1.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae)
    {
        
        if(ae.getActionCommand().equals("open"))
        {    
        JFileChooser fc=new JFileChooser();
        fc.showOpenDialog(this);
        File f=fc.getSelectedFile();
        
        try{
            FileInputStream fi=new FileInputStream(f);
            byte b[]=new byte[fi.available()];
            fi.read(b);
            String str=new String(b);
            ta.setText(str);
            fi.close();
            
        }
        catch(Exception e){}
        }
        else
        {
            Color col=JColorChooser.showDialog(this, "Font Color", Color.red);
            ta.setForeground(col);
        }
    }
    
}
public class swing10_prg10 {
    public static void main(String[] args)throws Exception {
        
    
    MyFrame f=new MyFrame();
    f.setSize(800,800);
    f.setVisible(true);
    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
}
}
