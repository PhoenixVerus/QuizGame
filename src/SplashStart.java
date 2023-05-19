import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class SplashStart implements ActionListener {

    JFrame frame = new JFrame();
    JTextField greeting = new JTextField();
    JButton buttonPlay = new JButton();
    JButton buttonQuit = new JButton();

    public SplashStart(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650,650);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(null);
        frame.setResizable(false);

        greeting.setBounds(0,100,650,100);
        greeting.setBackground(new Color(50,50,50));
        greeting.setForeground(new Color(180,200,255));
        greeting.setFont(new Font("Luminari",Font.PLAIN,35));
        greeting.setHorizontalAlignment(JTextField.CENTER);
        greeting.setEditable(false);
        greeting.setText("International Monster Slayers Quiz");

        buttonPlay.setBounds(220,250,100,50);
        buttonPlay.setFont(new Font("Luminari",Font.BOLD, 25));
        buttonPlay.setFocusable(false);
        buttonPlay.addActionListener(this);
        buttonPlay.setText("Play");

        buttonQuit.setBounds(320,250,100,50);
        buttonQuit.setFont(new Font("Luminari",Font.BOLD, 25));
        buttonQuit.setFocusable(false);
        buttonQuit.addActionListener(this);
        buttonQuit.setText("Quit");

        frame.add(buttonQuit);
        frame.add(buttonPlay);
        frame.add(greeting);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonPlay){
            Quiz quiz = new Quiz();

        }

        if(e.getSource() == buttonQuit){
            System.exit(0);
        }
    }
}
