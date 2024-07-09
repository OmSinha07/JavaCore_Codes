import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame{
    Button b1,b2,b3,b4,b5;
    public MyFrame()
    {
        //GridBaglayout
        super("Grid Layout and GridBagLayout");
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
       
        GridBagLayout gbc=new GridBagLayout();
       GridBagConstraints gbs=new GridBagConstraints();
        setLayout(gbc);
       
        gbs.gridx=1;
        gbs.gridy=1;
        add(b1,gbs);
        gbs.gridx=2;
        gbs.gridy=2;
        add(b2,gbs);
        gbs.gridx=2;
        gbs.gridy=2;
        add(b3,gbs);
        gbs.gridx=3;
        gbs.gridy=3;
        add(b4,gbs);
        gbs.gridx=4;
        gbs.gridy=4;
        add(b5,gbs);

    }
}
public class awt_prg12 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
