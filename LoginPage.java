import java.awt.Color;

import javax.swing.JFrame;

public class LoginPage {
    JFrame frame= new JFrame();
    LoginPage(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.black);


    }
}
