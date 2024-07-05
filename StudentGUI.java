import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

 class StudentGUI extends JFrame implements ActionListener {
     private JTextField rollNoField, nameField;
     private JButton insertButton, clearButton;
     private Connection connection;

     StudentGUI() {
         super();
         setTitle("Student Database Application");
         setSize(400, 150);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setResizable(false);

         JPanel panel = new JPanel();
         panel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
         panel.setBackground(new Color(192, 137, 137));

         rollNoField = new JTextField(10);
         nameField = new JTextField(10);
         insertButton = new JButton("Insert");
         insertButton.addActionListener(this);
         clearButton = new JButton("Clear");
         clearButton.addActionListener(this);
         panel.add(new JLabel("Roll No.: "));
         panel.add(rollNoField);
         panel.add(new JLabel("Name: "));
         panel.add(nameField);
         panel.add(insertButton);
         panel.add(clearButton);
         this.add(panel);
         panel.setVisible(true);

         try {
             String connectionString = "jdbc:mysql://localhost:3306/cse28";
             String username = "root";
             String password = "omaa#1547";
             connection = DriverManager.getConnection(connectionString, username, password);
             System.out.println("Connected to database successfully");
         } catch (SQLException e) {
             System.err.println("Error connecting to database: " + e.getMessage());
         }
     }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentGUI gui = new StudentGUI();
            gui.setVisible(true);
        });
    }

     public void actionPerformed(java.awt.event.ActionEvent e) {
         if (e.getSource() == insertButton) {
             String rollNo = rollNoField.getText();
             String name = nameField.getText();
             try {
                 PreparedStatement statement = connection.prepareStatement("INSERT INTO stud (rollno, name) VALUES (?, ?)");
                 statement.setString(1, rollNo);
                 statement.setString(2, name);
                 statement.executeUpdate();
                 System.out.println("Inserted: Roll No. " + rollNo + ", Name: " + name);
             } catch (SQLException ex) {
                 System.err.println("Error inserting data: " + ex.getMessage());
             }
         } else if (e.getSource() == clearButton) {
             rollNoField.setText("");
             nameField.setText("");
         }
     }
 }