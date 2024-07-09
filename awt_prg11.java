import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame 
{
   //GridLayout
   Button b1,b2,b3,b4,b5;
   public MyFrame()
   {
      b1=new Button("1");
      b2=new Button("2");
      // b3=new Button("3");
      b4=new Button("4");
      b5=new Button("5");

      add(b1,BorderLayout.NORTH);
      add(b2,BorderLayout.SOUTH);
      //add(b3,BorderLayout.EAST);
      add(b4,BorderLayout.WEST);
      add(b5,BorderLayout.CENTER);

      Panel p=new Panel();
      {
      p.setLayout(new GridLayout(3,1));
      p.add(new Button("Mon"));
      p.add(new Button("Tue"));
      p.add(new Button("Wed"));
      add(p,BorderLayout.EAST);
      }
   }
}
public class awt_prg11 {
   public static void main(String[] args) {
    MyFrame f=new MyFrame();
    f.setSize(500,500);
    f.setVisible(true);
   } 
}
