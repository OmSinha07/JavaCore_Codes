
import javax.swing.event.*;
import java.awt.Color;
import javax.swing.*;



class MyFrame extends JFrame implements ListSelectionListener
{//Tabs+splitpane
    JTabbedPane sp;
    JList list;
    JLabel lbl;
    MyFrame()
    {
        super("split pane");
        String cols[]={"RED","GREEN","BLUE","YELLOW","MAGENTA","ORANGE","BLACK"};
       
        list=new JList<>(cols);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        JScrollPane p1=new JScrollPane(list);
        
        lbl=new JLabel(" ");
        lbl.setOpaque(true);
        lbl.setBackground(Color.RED);
        JScrollPane p2=new JScrollPane(lbl);
       
    
        
        sp=new JTabbedPane();

        sp.addTab("Colors",list);
        sp.addTab("Label",lbl);
        add(sp);
       
        
    } 
    @Override
    public void valueChanged(ListSelectionEvent e)
     {
        String str=(String)list.getSelectedValue();
        switch(str)
        {
            case "RED":lbl.setBackground(Color.RED);
                break;
                case "GREEN":lbl.setBackground(Color.GREEN);
                break;
                case "BLUE":lbl.setBackground(Color.BLUE);
                break;
                case "YELLOW":lbl.setBackground(Color.YELLOW);
                break;
                case "MAGENTA":lbl.setBackground(Color.MAGENTA);
                break;
                case "ORANGE":lbl.setBackground(Color.ORANGE);
                break;
                case "BLACK":lbl.setBackground(Color.BLACK);
                break;
        }
    }
  

}

public class swing8_prg8
 {
    public static void main(String[] args) {
       MyFrame f=new MyFrame();
       f.setSize(800,800);
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}
