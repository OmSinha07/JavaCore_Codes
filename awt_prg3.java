import java.awt.*;
public class awt_prg3 extends Frame
{
    //Method 3
Label l;
TextField tf;
Button b;
public awt_prg3()
{
    super("My App");
    setLayout(new FlowLayout());
    l=new Label("Name");
    tf=new TextField(20);
    b=new Button("OK");
    add(l);
    add(tf);
    add(b);
    
}
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);

    }
}


