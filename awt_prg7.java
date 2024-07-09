

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{//text area and texxt field
    TextArea ta;
    TextField tf;
    Label l;
    Button b;
    
    MyFrame()
    {
        super("TextArea Demo");
        
        l=new Label("No Text Entered ");
        ta=new TextArea(10,30);
        tf=new TextField(20);
        b=new Button("Click");
        
        setLayout(new FlowLayout());
        
        add(ta);
        add(l);
        add(tf);
        add(b);
        b.addActionListener(this);
        
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        l.setText(ta.getSelectedText());
        ta.insert(tf.getText(),ta.getCaretPosition());
        
    }
    

}

public class awt_prg7 
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        
              
    }
}
