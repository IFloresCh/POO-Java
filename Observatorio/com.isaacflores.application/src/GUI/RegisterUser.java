package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/*swing and mysql registration form*/
public class RegisterUser extends JFrame implements ActionListener {

    private JLabel lblUsername;
    private JLabel lblPassword;
    private JLabel lblConfirmPassword;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JPasswordField txtConfirmPassword;

    private JButton btnRegister;
    private JButton btnClear;

    private JPanel panel;

    public RegisterUser() {
        super("Register User");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(null);

        lblUsername = new JLabel("Username");
        lblUsername.setBounds(10, 10, 80, 25);
        panel.add(lblUsername);

        lblPassword = new JLabel("Password");
        lblPassword.setBounds(10, 40, 80, 25);
        panel.add(lblPassword);

        lblConfirmPassword = new JLabel("Confirm Password");
        lblConfirmPassword.setBounds(10, 70, 120, 25);
        panel.add(lblConfirmPassword);

        txtUsername = new JTextField(20);
        txtUsername.setBounds(120, 10, 160, 25);
        panel.add(txtUsername);

        txtPassword = new JPasswordField(20);
        txtPassword.setBounds(120, 40, 160, 25);
        panel.add(txtPassword);

        txtConfirmPassword = new JPasswordField(20);
        txtConfirmPassword.setBounds(120, 70, 160, 25);
        panel.add(txtConfirmPassword);

        btnRegister = new JButton("Register");
        btnRegister.setBounds(10, 100, 80, 25);
        panel.add(btnRegister);

        btnClear = new JButton("Clear");
        btnClear.setBounds(120, 100, 80, 25);
        panel.add(btnClear);
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUsername.setText("");
                txtPassword.setText("");
                txtConfirmPassword.setText("");

            }
}   );

        add(panel);



    }




    public static void main(String[] args) {
        RegisterUser registerUserGUI = new RegisterUser();
        registerUserGUI.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}


