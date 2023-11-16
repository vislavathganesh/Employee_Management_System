package EmployeeManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class AddEmployee extends JFrame implements ActionListener {

    private JTextField firstNameTextField;
    private JTextField lastNameTextField;
    private JTextField emailTextField;
    private JTextField phoneNumberTextField;
    private JTextField textField;
    private Button submitButton;
    private Button cancelButton;

    public AddEmployee() {
        super("Add Employee");

        // Create labels and text fields for employee information
        Label firstNameLabel = new Label("First Name:");
        firstNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        firstNameLabel.setBounds(369, 117, 234, 43);
        firstNameTextField = new JTextField();
        firstNameTextField.setBounds(659, 120, 299, 43);

        Label lastNameLabel = new Label("Last Name:");
        lastNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        lastNameLabel.setBounds(369, 184, 234, 43);
        lastNameTextField = new JTextField();
        lastNameTextField.setBounds(659, 180, 299, 43);

        Label emailLabel = new Label("Email:");
        emailLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        emailLabel.setBounds(369, 249, 234, 43);
        emailTextField = new JTextField();
        emailTextField.setBounds(659, 249, 299, 43);

        Label phoneNumberLabel = new Label("Contact:");
        phoneNumberLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        phoneNumberLabel.setBounds(369, 308, 234, 43);
        phoneNumberTextField = new JTextField();
        phoneNumberTextField.setBounds(659, 308, 299, 43);

        // Create submit and cancel buttons
        submitButton = new Button("Save");
        submitButton.setForeground(new Color(0, 255, 0));
        submitButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        submitButton.setBounds(406, 565, 176, 55);
        submitButton.addActionListener(this);

        cancelButton = new Button("Cancel");
        cancelButton.setForeground(new Color(255, 0, 0));
        cancelButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        cancelButton.setBounds(835, 559, 187, 61);
        cancelButton.addActionListener(this);

        // Add labels, text fields, and buttons to the panel
        Panel panel = new Panel();
        panel.setLayout(null);
        panel.add(firstNameLabel);
        panel.add(firstNameTextField);
        panel.add(lastNameLabel);
        panel.add(lastNameTextField);
        panel.add(emailLabel);
        panel.add(emailTextField);
        panel.add(phoneNumberLabel);
        panel.add(phoneNumberTextField);
        panel.add(submitButton);
        panel.add(cancelButton);

        // Add the panel to the frame
        getContentPane().add(panel);

        Label phoneNumberLabel_1 = new Label("Employee ID:");
        phoneNumberLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        phoneNumberLabel_1.setBounds(369, 368, 250, 55);
        panel.add(phoneNumberLabel_1);

        textField = new JTextField();
        textField.setBounds(659, 368, 299, 55);
        panel.add(textField);

        JLabel lblNewLabel = new JLabel("New Employee Addition Form");
        lblNewLabel.setForeground(new Color(0, 255, 0));
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
        lblNewLabel.setBounds(369, 26, 589, 43);
        panel.add(lblNewLabel);

        JButton btnNewButton = new JButton("<-- Back");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AdminModule();
            }
        });
        btnNewButton.setBackground(new Color(241, 255, 227));
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnNewButton.setForeground(new Color(128, 0, 0));
        btnNewButton.setBounds(26, 26, 125, 43);
        panel.add(btnNewButton);

        // Set the size and location of the frame
        setSize(1300, 700);
        setLocationRelativeTo(null);

        // Make the frame visible
        setVisible(true);
    }
    private void clearForm() {
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        emailTextField.setText("");
        phoneNumberTextField.setText("");
        textField.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
        	String firstName = firstNameTextField.getText();
            String lastName = lastNameTextField.getText();
            String email = emailTextField.getText();
            String phoneNumber = phoneNumberTextField.getText();
            String employeeID = textField.getText();

            // Call the method from EmployeeDatabase to add the employee
            EmployeeDatabase.addEmployee(firstName, lastName, email, phoneNumber, employeeID);

            // Optionally, show a success message or reset the form
            JOptionPane.showMessageDialog(this, "Employee added successfully!");
            clearForm();
        }
    }

    // Driver Code
    public static void main(String[] args) {
        new AddEmployee();
    }
}
