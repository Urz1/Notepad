import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WelcomePage extends JFrame implements ActionListener {
    
    JFrame frame;
    JButton btn1,btn2,btn3;
    WelcomePage(){
        btn1=new JButton("Register");
        btn2=new JButton("Login page");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn1.setBounds(210,0,200,40);
        btn2.setBounds(0,0,200,40);

        this.setSize(700,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.add(btn1);
        this.add(btn2);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
            this.dispose();
            RegisterPage registerPage= new RegisterPage();

        } 
        else if(e.getSource()==btn2){
            this.dispose();
            LoginPage loginPage=new LoginPage();
        }   
    }
}
