import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener
{
    // A code using awt when button is pressed then count value is increased
    int count=0;
    Label l;
    Button b;
    public MyFrame()
    {
        super("Button Demo");
        l=new Label("  "+count);
        b=new Button("Click");
        b.addActionListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(b);
       
    }
    public void actionPerformed(ActionEvent e)
    {
        count++;
        l.setText(" "+count);
    }
}
    public class awt_prg4
    {
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}