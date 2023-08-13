//Packages for creating JDBC
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

// packages used by swing
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// Section for creating Notes 
class NotesPage implements ActionListener {

    // Java Database connectivity
    String dbURL = "jdbc:mysql://localhost:3306/notepad";
    String username = "root";
    String password = "Sad@qls1610-";
    String query = "SELECT * FROM note";

    // Declaration 
    public String Title;
    public String Content;
    public String Catagory;

    //Creating Java Swing components
    JFrame frame;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton submitButton;
    JTextField textField;
    JTextField textField2;
    JTextField textField3;

    // Section For the editing of notes 
    public void Design(){
        JFrame frame = new JFrame();

        ImageIcon imageIcon=new ImageIcon("delete.png");

        JLabel label=new JLabel();
        label.setText("All Notes");
        label.setBounds(40, 50, 50, 20);
        
        JButton button=new JButton();
        button.setBounds(40, 100, 400, 40);
        button1=new JButton(imageIcon);
        button1.setBounds(400, 20, 100, 30);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.add(button);
        frame.add(button1);

    }
    public void Create_Notes() {
        // Creating the Text Fields and setting thier Size
        textField = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField.setBounds(20, 20, 200, 40);      
        textField2.setBounds(20, 100, 200, 40);
        textField3.setBounds(20, 200, 200, 40);

        button1 = new JButton("Title");
        button1.setBounds(300, 20, 100, 40);
        button1.addActionListener(this);

        button2 = new JButton("Content");
        button2.setBounds(300, 120, 100, 40);
        button2.addActionListener(this);

        button3 = new JButton("Catagory");
        button3.setBounds(300, 220, 100, 40);
        button3.addActionListener(this);

        submitButton = new JButton("Submit");
        submitButton.setBounds(300, 270, 100, 40);
        submitButton.addActionListener(this);

       
        


        // Creating a Jframe
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setLayout(null);
        frame.add(textField);
        frame.add(textField2);
        frame.add(textField3);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(submitButton);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submitButton)
            submitButton.setEnabled(false);
            Title = textField.getText();
            Content = textField2.getText();
            Catagory = textField3.getText();
        {
            try (
                    Connection conn = DriverManager.getConnection(dbURL, username, password);
                    Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE);) {

                String queryString = "INSERT INTO note (Note_Title, Content, Note_Catagory) VALUES ('" + Title + "', '"
                        + Content + "', '" + Catagory + "')";
                int rowsAffected = stmt.executeUpdate(queryString);

            } catch (Exception exception) {
                // TODO: handle exception

            }
        }

    }
// Section for editing of 
public void Edit_Note(){

}

}



