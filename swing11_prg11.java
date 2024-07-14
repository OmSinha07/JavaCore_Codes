import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;



class MyFrame extends JFrame implements ActionListener,ListSelectionListener,ChangeListener
{
    JSpinner s1,s2;
    JTextField tf,tf1,tf2,tf3;
    JComboBox cb;
    JList l;
    MyFrame()
    {//Calendar
        
        super("Calendar");
        String[] cities = { "2024", "2025", "2026", "2027" };
        String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        String days[]={"Monday","Tuesday","Wednesday","Thursday","Firday","Saturday","Sunday"}; 
        
        
        s1=new JSpinner(new SpinnerNumberModel(1,1,31,1));
        s2=new JSpinner(new SpinnerListModel(days));

        tf=new JTextField(15);
        tf1=new JTextField(15);
        tf2=new JTextField(15);
        tf3=new JTextField(15);

        cb=new JComboBox<>(cities);
        l=new JList<>(months);
        l.setVisibleRowCount(5);
        setLayout(new FlowLayout());
        add(cb);
        add(s1);
        add(s2);
        add(l);
        add(tf);
        add(tf1);
        add(tf2);
        add(tf3);
        cb.addActionListener(this);
        l.addListSelectionListener(this);
        s1.addChangeListener(this);
        s2.addChangeListener(this);
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource()==s1)
        
            tf1.setText(s1.getValue()+"");
                else
            tf2.setText((String)s2.getValue());
        
    }
    @Override
    public void valueChanged(ListSelectionEvent e) {
       tf3.setText((String)l.getSelectedValue());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText((String)cb.getSelectedItem());
    }

}

public class swing11_prg11 {
    
        public static void main(String[] args) {
            MyFrame f=new MyFrame();
           f.setSize(400,400);
           f.setVisible(true);
           
           f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
