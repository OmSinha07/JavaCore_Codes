
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements AdjustmentListener{
TextArea ta;
TextField tf;
Label l;
Button b;
Scrollbar red,green,blue;
MyFrame()
{//Scrollbar
    super("Text area");
    red=new Scrollbar(Scrollbar.HORIZONTAL,0 ,20,0,255);
    blue=new Scrollbar(Scrollbar.HORIZONTAL,0 ,20,0,255);
    green=new Scrollbar(Scrollbar.HORIZONTAL,0, 20,0,255);
    tf=new TextField(20);

    tf.setBounds(50,50,300,50);
    red.setBounds(50,150,300,50);
    blue.setBounds(50,250,300,50);
    green.setBounds(50,350,300,50);

    setLayout(null);
          
    add(tf); 
    add(red);   
    add(blue);   
    add(green);  

    red.addAdjustmentListener(this);
    blue.addAdjustmentListener(this);
    green.addAdjustmentListener(this);
        
    add(tf); 
    add(red);   
    add(blue);   
    add(green);   

}
@Override
public void adjustmentValueChanged(AdjustmentEvent e) {
    tf.setBackground(new Color(red.getValue(),blue.getValue(),green.getValue()));
}
}
public class awt_prg9 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
