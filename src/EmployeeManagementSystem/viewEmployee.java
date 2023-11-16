package EmployeeManagementSystem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class viewEmployee {

    private JFrame frame;
    private JTable table;
    private JButton back;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    viewEmployee window = new viewEmployee();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public viewEmployee() {
        initialize();
        displayEmployeeData();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setSize(1300, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main Panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());
        frame.getContentPane().add(mainPanel);

        // Employee Data Text
        JLabel employeeDataLabel = new JLabel("Employee Data");
        employeeDataLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        employeeDataLabel.setForeground(Color.RED);
        employeeDataLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(employeeDataLabel, BorderLayout.PAGE_START);

        // Back Button
        back = new JButton("<--Back");
        back.setFont(new Font("Times New Roman", Font.BOLD, 14));
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Replace adminModule() with the actual method or functionality to go back to the admin module
                new AdminModule();
            }
        });
        back.setBackground(new Color(241, 255, 227));
        back.setFont(new Font("Times New Roman", Font.BOLD, 20));
        back.setForeground(new Color(128, 0, 0));
        back.setBounds(0, 0, 120, 40);
        mainPanel.add(back);

        // Table
        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
    }

    private void displayEmployeeData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagementSystem", "root", "Software#123");

            String sql = "SELECT * FROM employees";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Create a table model to hold the data
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("S_No");
            model.addColumn("Employee ID");
            model.addColumn("First Name");
            model.addColumn("Last Name");
            model.addColumn("Email");
            model.addColumn("Phone Number");

            // Populate the table model with data
            while (resultSet.next()) {
            	int sno = resultSet.getRow();
                String employeeID = resultSet.getString("employee_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");
                String phoneNumber = resultSet.getString("phone_number");

                model.addRow(new Object[]{sno, employeeID, firstName, lastName, email, phoneNumber});
            }

            // Set the table model to the JTable
            table.setModel(model);

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
