import java.awt.*;
class MyFrame extends Frame
{
//method 2
Label l;
TextField tf;
Button b;
public MyFrame()
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

}
public class awt_prg2
{
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);

    }
}
