import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.*;
import java.io.*;
class MyFrame extends JFrame implements TreeSelectionListener
{
    JTree tree;
    JLabel label;
    MyFrame()
    {//File Manager
        super("File Manger");
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("C:\\Users\\KIIT\\java_P");
        File f=new File("C:\\Users\\KIIT\\java_P");
        for (File x:f.listFiles())
        {
            if(x.isDirectory())
            {
             DefaultMutableTreeNode temp=new DefaultMutableTreeNode(x.getName()); 
             for(File y:x.listFiles())
             {
                temp.add(new DefaultMutableTreeNode(x.getName()));
             }
             root.add(temp);
             }
             else
                 root.add(new DefaultMutableTreeNode(x.getName()));

    }
    tree=new JTree(root);
    label=new JLabel("No items Selcted");
    tree.addTreeSelectionListener(this);
    JScrollPane sp=new JScrollPane(tree);
    add(sp,BorderLayout.CENTER);
    add(label,BorderLayout.SOUTH);

}
    @Override
    public void valueChanged(TreeSelectionEvent e) {
        label.setText(e.getPath().toString());
    }
    

}

public class swing5_prg5 {
    public static void main(String[] args) {
      MyFrame f=new MyFrame();
      f.setSize(500,500);
      f.setVisible(true); 
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}
