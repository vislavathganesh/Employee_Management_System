package EmployeeManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class EmployeeModule extends JFrame implements ActionListener {

    private JButton viewPersonalInfoButton;
    private JButton changePasswordButton;
    private JButton leaveButton;
    private JButton tasksButton;
    private JButton logoutButton;

    public EmployeeModule() {
        super("Employee Module");

        viewPersonalInfoButton = new JButton("View Personal Info");
        viewPersonalInfoButton.setForeground(new Color(0, 0, 255));
        viewPersonalInfoButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        viewPersonalInfoButton.setBounds(10, 83, 386, 131);
        viewPersonalInfoButton.addActionListener(this);

        changePasswordButton = new JButton("Change Password");
        changePasswordButton.setForeground(new Color(0, 0, 255));
        changePasswordButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        changePasswordButton.setBounds(458, 83, 386, 131);
        changePasswordButton.addActionListener(this);
        
        leaveButton = new JButton("Apply Leave");
        leaveButton.setForeground(Color.blue);
        leaveButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        leaveButton.setBounds(871, 83, 386, 131);
        leaveButton.addActionListener(this);
        
        tasksButton = new JButton("Tasks");
        tasksButton.setForeground(Color.BLUE);
        tasksButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        tasksButton.setBounds(10,288,386,131);
        tasksButton.addActionListener(this);
        
        logoutButton = new JButton("Logout here");
        logoutButton.setForeground(Color.RED);
        logoutButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        logoutButton.setBounds(458, 288, 386, 131);
        logoutButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(viewPersonalInfoButton);
        panel.add(changePasswordButton);
        panel.add(leaveButton);
        panel.add(tasksButton);
        panel.add(logoutButton);

        getContentPane().add(panel);
        
        

        setSize(1300, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewPersonalInfoButton) {
            // View personal info functionality
        } else if (e.getSource() == changePasswordButton) {
            // Change password functionality
        }
        else if(e.getSource() == logoutButton)
        {
        	new Main();
        }
    }
}

