import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener
{
    JLabel l;
    JButton b;
    JButton b1;
    int count=0;
    public MyFrame()
    {
        super("Swing Demo");
        setLayout(new FlowLayout());
        l=new JLabel("Clicked "+count+"Times");
        b=new JButton("Click");
        b1=new JButton("Click");

        add(l);
        add(b);
        add(b1);
        b.addActionListener(this);
        b1.addActionListener(this);
        //b.setIcon(new ImageIcon("link dalna bhai"));
        getRootPane().setDefaultButton(b);
        l.setToolTipText("Counter");//naming the label
        b.setToolTipText("buttons");//naming the label
        b1.setToolTipText("buttons");//naming the label
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b)
        {
        count++;
        l.setText("Clicked"+count+"Times");
        }
        else
        {
            count--;
            l.setText("Clicked"+count+"Times");
        }

    }
    
    

} 
public class swing1_prg1 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
