package resturant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_gui extends JFrame
{

    JButton[] b = new JButton[2];
    JTextField[] t = new JTextField[2];
    JPasswordField p = new JPasswordField();
    JLabel[] L = new JLabel[2];
    JPanel g = new JPanel();
    Login_gui()
    {
        this.setTitle("         Resturant");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocation(700, 300);
        add(g);
        g.setLayout(null);
        this.g.setBackground(Color.LIGHT_GRAY);
        Design();
    }

    public void Design()
    {

        Run r = new Run();
        b[0] = new JButton("Login");
        b[1] = new JButton("Reset");
        t[0] = new JTextField();
        t[1] = new JTextField();
        L[0] = new JLabel("User name");
        L[1] = new JLabel("Password");
        L[0].setBounds(40, 80, 150, 30);
        L[1].setBounds(40, 150, 150, 30);
        t[0].setBounds(180, 80, 250, 30);
        p.setBounds(180, 150, 250, 30);
        b[0].setBounds(120, 220, 100, 30);
        b[1].setBounds(310, 220, 100, 30);
        b[0].setBackground(Color.BLACK);
        b[0].setForeground(Color.yellow);
        b[1].setBackground(Color.BLACK);
        b[1].setForeground(Color.yellow);
        L[0].setForeground(Color.yellow);
        L[1].setForeground(Color.yellow);
        t[0].setFont(new Font("", NORMAL, 15));
        p.setFont(new Font("", NORMAL, 15));
        this.g.add(L[0]);
        g.add(L[1]);
        this.g.add(t[0]);
        this.g.add(p);
        g.add(b[0]);
        g.add(b[1]);
        b[0].addActionListener(r);
        b[1].addActionListener(r);
    }

    private class Run implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == b[0])
            {

                if (t[0].getText().equals("a") || p.getText() == "0112057331")
                {
                    new Manager();
                    dispose();
                }
                else if (t[0].getText().equals("m") || p.getText() == "0112057331")
                {
                    new Employee();
                    dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(g, "User name or password isn't correct");
                }
            }
            if (e.getSource() == b[1])
            {
                t[0].setText("");
                p.setText("");
            }
        }

    }

}
