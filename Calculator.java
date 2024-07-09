import java.awt.*;
import java.awt.event.*;
class MyWindowAdapter extends WindowAdapter    
{
        public void windowClosing(WindowEvent we)
        {
            System.exit(0);
        }
}

class MyFrame extends Frame implements ActionListener
{
    Label l;
    Label l1;
    Label l2;
    TextField tf;
    TextField tf1;
    TextField tf2;

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    
    public MyFrame()
    {
     super("Calculator");
     l=new Label("First Number");   
     l1=new Label("Second Number");   
     l2=new Label("Result"); 

     tf=new TextField();
     tf1=new TextField();
     tf2=new TextField();


     b1=new Button("ADD");
     b2=new Button("Sub");
     b3=new Button("Mul");
     b4=new Button("Div");
     b5=new Button("Cancel");

        setLayout(null);
        l.setBounds(50,100,100,20);
        l1.setBounds(50,140,100,20);
        l2.setBounds(50,180,100,20);
       
        tf.setBounds(200,100,100,20);
        tf1.setBounds(200,140,100,20);
        tf2.setBounds(200,180,100,20);


        b1.setBounds(50,250,50,20);
        b2.setBounds(110,250,50,20);
        b3.setBounds(170,250,50,20);
        b4.setBounds(230,250,50,20);
        b5.setBounds(290,250,50,20);
        add(l);
        add(l1);
        add(l2);

        add(tf);
        add(tf1);
        add(tf2);
       
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

        addWindowListener(new MyWindowAdapter());
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
      

    }
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        int n1=Integer.parseInt(tf.getText());
        int n2=Integer.parseInt(tf1.getText());

        if(ae.getSource()==b1)
        {
            tf2.setText(String.valueOf(n1+n2));
        }
        if(ae.getSource()==b2)
        {
            tf2.setText(String.valueOf(n1-n2));
        }
        if(ae.getSource()==b3)
        {
            tf2.setText(String.valueOf(n1*n2));
        }
        if(ae.getSource()==b4)
        {
            tf2.setText(String.valueOf(n1/n2));
        }
        if(ae.getSource()==b5)
        {
            tf2.setText("");
            tf1.setText("");
            tf.setText("");

        }

    
    
    }
}
    





public class Calculator {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
