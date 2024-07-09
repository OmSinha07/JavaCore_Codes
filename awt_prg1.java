import java.awt.*;
public class awt_prg1
{
  public static void main(String[] args)throws Exception {
    //first method
    Frame f=new Frame("My first app");
    f.setLayout(new FlowLayout());
    Button b=new Button("ok");
    Label l=new Label("Name");
    TextField tf=new TextField(20);
    f.add(l);
    f.add(tf);
    f.add(b);
    f.setVisible(true);
    f.setSize(300,300);
    b.setSize(100,30);
  }  
}