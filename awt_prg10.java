import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{//FlowLayout
    Button b1,b2,b3,b4,b5,b6;
    public MyFrame()
    {
        super("Flowlayout");
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        FlowLayout f1=new FlowLayout();
        setLayout(new FlowLayout());
        f1.setAlignment(FlowLayout.LEFT);
        f1.setHgap(100);
        setLayout(f1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
}
public class awt_prg10 {
    public static void main(String[] args) {
       MyFrame f=new MyFrame();
       f.setSize(400,400);
       f.setVisible(true);
    }
}
