import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements WindowListener
{//WindowListener
    Label l1;
    MyFrame()
    {
        l1=new Label("Window");
        add(l1);
        addWindowListener(this);
    
    }
 

    @Override
public void windowOpened(WindowEvent e) {
    l1.setText("WindowOpened");
}

@Override
public void windowClosing(WindowEvent e) {
    l1.setText("WindowClosing");
    System.exit(0);
}

@Override
public void windowClosed(WindowEvent e) {
    l1.setText("WindowClosed");
}

@Override
public void windowIconified(WindowEvent e) {
    l1.setText("WindowIconified");
}

@Override
public void windowDeiconified(WindowEvent e) {
    l1.setText("WindowDeiconified");
}

@Override
public void windowActivated(WindowEvent e) {
    l1.setText("WindowActivated");
}

@Override
public void windowDeactivated(WindowEvent e) {
    l1.setText("WindowDEACTIVITED");
}

}
public class awt_prg15 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
