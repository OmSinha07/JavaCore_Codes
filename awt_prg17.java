
import java.awt.*;
import java.awt.event.*;

//Outer class for handling Window Event

 
class MyWindowAdapter extends WindowAdapter    
{//Clsoing WIndow
        public void windowClosing(WindowEvent we)
        {
            System.exit(0);
        }
}

class MyFrame extends Frame
{
    MyFrame()
    {
        super("Adapter Demo");
        addWindowListener(new MyWindowAdapter());
    }}
           
        
      // use this for handling event using inner class
     //   addWindowLister(new MyWindowAdapter());
    
    // Inner class used for handling event
   /* class MyWindowAdapter extends WindowAdapter    
    {
        public void windowClosing(WindowEvent we)
        {
            System.exit(0);
        }
    }*/


public class awt_prg17
{  
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }    
}