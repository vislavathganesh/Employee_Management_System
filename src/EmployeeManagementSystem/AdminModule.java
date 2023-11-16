package EmployeeManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminModule extends JFrame implements ActionListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton addEmployeeButton;
    private JButton viewEmployeesButton;
    private JButton updateEmployeeButton;
    private JButton deleteEmployeeButton;
    private JButton employeeLeaveButton;
    private JButton LogoutButton;
    private JLabel ibf;

    public AdminModule() {
        super("Admin Module");

        addEmployeeButton = new JButton("Add Employee");
        addEmployeeButton.setForeground(new Color(0, 0, 255));
        addEmployeeButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        addEmployeeButton.setBounds(0, 97, 346, 65);
        addEmployeeButton.addActionListener(this);

        viewEmployeesButton = new JButton("View Employees");
        viewEmployeesButton.setForeground(new Color(0, 0, 255));
        viewEmployeesButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        viewEmployeesButton.setBounds(397, 97, 386, 65);
        viewEmployeesButton.addActionListener(this);

        updateEmployeeButton = new JButton("Update Employee");
        updateEmployeeButton.setForeground(new Color(0, 0, 255));
        updateEmployeeButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        updateEmployeeButton.setBounds(860, 97, 386, 65);
        updateEmployeeButton.addActionListener(this);
        
        employeeLeaveButton = new JButton("Employee Leaves");
        employeeLeaveButton.setForeground(new Color(0, 255, 0));
        employeeLeaveButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        employeeLeaveButton.setBounds(0, 216, 346, 65);
        employeeLeaveButton.addActionListener(this);

        deleteEmployeeButton = new JButton("Delete Employee");
        deleteEmployeeButton.setForeground(new Color(0, 0, 255));
        deleteEmployeeButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        deleteEmployeeButton.setBounds(397, 216, 386, 65);
        deleteEmployeeButton.addActionListener(this);
        
        LogoutButton = new JButton("Logout");
        LogoutButton.setForeground(new Color(255, 0, 0));
        LogoutButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        LogoutButton.setBounds(860, 216, 386, 65);
        LogoutButton.addActionListener(this);
        
        ibf = new JLabel("Contact us:-    LinkedIn   Gmail   Facebook");
        ibf.setForeground(new Color(0, 0, 255));
        ibf.setFont(new Font("Times New Roman", Font.BOLD, 20));
        ibf.setBounds(25, 540, 381, 24);
        

        JPanel panel = new JPanel();
        panel.setBackground(new Color(210, 210, 210));
        panel.setLayout(null);
        panel.add(addEmployeeButton);
        panel.add(viewEmployeesButton);
        panel.add(updateEmployeeButton);
        panel.add(employeeLeaveButton);
        panel.add(deleteEmployeeButton);
        panel.add(LogoutButton);
        panel.add(ibf);

        getContentPane().add(panel);
        
        setSize(1300, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addEmployeeButton) {
            // Add employee functionality
        	new AddEmployee();
        } else if (e.getSource() == viewEmployeesButton) {
        	new viewEmployee();
        	// Close the current frame
            dispose();
            // View employees functionality
        } else if (e.getSource() == updateEmployeeButton) {
            // Update employee functionality
        } else if (e.getSource() == deleteEmployeeButton) {
            // Delete employee functionality
        }
        else if(e.getSource() == LogoutButton)
        {
        	new Main();
        }
    }
}

