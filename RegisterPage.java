import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class RegisterPage implements ActionListener {
    JFrame frame;
    JButton submit;
    RegisterPage(){
        submit=new JButton();
        submit.addActionListener(this);
        frame=new JFrame();
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.red);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submit){
            WelcomePage welcomePage= new WelcomePage();

        }    
    }
}
