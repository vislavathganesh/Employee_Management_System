package EmployeeManagementSystem;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Main extends JFrame implements ActionListener {

    private JButton adminButton;
    private JButton employeeButton;
    private JLabel lb1;
    private JLabel lbh;
    private JLabel ibf;

    public Main() {
        super("Main Module");

        adminButton = new JButton("Admin");
        adminButton.setBackground(new Color(193, 255, 255));
        adminButton.setForeground(new Color(0, 255, 0));
        adminButton.setFont(new Font("Times New Roman", Font.BOLD, 50));
        adminButton.setBounds(160, 196, 900, 90);
        adminButton.addActionListener(this);

        employeeButton = new JButton("Employee");
        employeeButton.setBackground(new Color(193, 255, 255));
        employeeButton.setForeground(new Color(0, 255, 0));
        employeeButton.setFont(new Font("Times New Roman", Font.BOLD, 50));
        employeeButton.setBounds(160, 330, 900, 90);
        employeeButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(205, 205, 205));
        panel.setLayout(null);
        panel.add(adminButton);
        panel.add(employeeButton);

        getContentPane().add(panel);
        
        lb1 = new JLabel("Please choose your role");
        lb1.setForeground(new Color(0, 0, 255));
        lb1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lb1.setBounds(511, 155, 261, 31);
        panel.add(lb1);
        
        lbh = new JLabel("Employee Management System");
        lbh.setForeground(new Color(255, 0, 0));
        lbh.setFont(new Font("Times New Roman", Font.BOLD, 40));
        lbh.setBounds(363, 22, 534, 41);
        panel.add(lbh);
        
        ibf = new JLabel("Contact us:-    LinkedIn   Gmail   Facebook");
        ibf.setForeground(new Color(0, 0, 255));
        ibf.setFont(new Font("Times New Roman", Font.BOLD, 20));
        ibf.setBounds(25, 540, 381, 24);
        panel.add(ibf);

        setSize(1300, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == adminButton) {
            // Open admin module
            new AdminModule();
        } else if (e.getSource() == employeeButton) {
            // Open employee module
            new EmployeeModule();
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new Main();
        });
    }
}

