import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener,ItemListener
{
    // list and Checkbox
    List l;
    Choice c;
    TextArea ta;
    MyFrame()
    {
        super("List and Check");
        l=new List(4,true);
        c=new Choice();
        ta=new TextArea(20,30);
        l.add("M");
        l.add("fg");
        l.add("f");
        l.add("d");
        l.add("s");

        c.add("ds");
        c.add("d");
        c.add("dsf");
        c.add("dsdsfd");

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);
        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);

    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==l)
        ta.setText(l.getSelectedItem());
        else
        ta.setText(c.getSelectedItem());
    }
    public void actionPerformed(ActionEvent ae)
    {
        String li[]=l.getSelectedItems();
        String txt="";
         for(String x:li)
         {
            txt+=x+"\n";
         }

         ta.setText(txt);
         
    }
    public class awt_prg8
    {
        public static void main(String[] args) {
            MyFrame f=new MyFrame();
            f.setSize(500,500);
            f.setVisible(true);
        }
    }
}

