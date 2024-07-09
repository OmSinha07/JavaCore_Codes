import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements MouseListener,MouseMotionListener
{
    Label l1,l2;
    public MyFrame()
    {
        super("Mouse");
        l1=new Label("");
        l2=new Label("");
        setLayout(null);
        l1.setBounds(10,50,100,20);
        l2.setBounds(10,80,100,20);
        add (l1);
        add (l2);
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        l1.setText("mouseDragged");
    }
    @Override
    public void mouseMoved(MouseEvent e) {
      l1.setText("mosueMoved");
      l2.setText(e.getX()+","+e.getY());
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        l1.setText("mouseClicked");
    }
    @Override
    public void mousePressed(MouseEvent e) {
        l1.setText("mousePressed");
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        l1.setText("mouseReleased");
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        l1.setText("mouseEntered");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        l1.setText("mouseExited");
    }
}
public class awt_prg14 {
 public static void main(String[] args) {
    MyFrame f=new MyFrame();
    f.setSize(500,500);
    f.setVisible(true);
 }   
}
