package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JFrame implements ActionListener {


    /*jcombobox with 3 elements*/

    private JComboBox comboBox;
    private JLabel label;
    private JButton button;
    private JTextField textField;
    private String[] items = {"Ave", "Terrestre", "Marino"};

    public ComboBox() {
        super("ComboBox");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        comboBox = new JComboBox(items);
        comboBox.setBounds(10, 10, 100, 20);
        add(comboBox);
        comboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox.getSelectedItem().equals("Ave")) {
                    label = new JLabel("");
                    label.setBounds(120, 10, 100, 20);
                    add(label);

                    button = new JButton("boton 1");
                    button.setBounds(10, 40, 100, 20);
                    button.addActionListener(this);
                    add(button);

                    textField = new JTextField();
                    textField.setBounds(120, 40, 100, 20);
                    add(textField);
                    System.out.println(comboBox.getSelectedItem());

                }
                else if (comboBox.getSelectedItem().equals("Terrestre")) {

                    label = new JLabel("");
                    label.setBounds(120, 10, 100, 20);
                    add(label);

                    button = new JButton("boton 2");
                    button.setBounds(10, 40, 100, 20);
                    button.addActionListener(this);
                    add(button);

                    textField = new JTextField();
                    textField.setBounds(120, 40, 100, 20);
                    add(textField);
                    System.out.println(comboBox.getSelectedItem());
                }
                else if (comboBox.getSelectedItem().equals("Marino")) {

                    label = new JLabel("");
                    label.setBounds(120, 10, 100, 20);
                    add(label);

                    button = new JButton("boton 3");
                    button.setBounds(10, 40, 100, 20);
                    button.addActionListener(this);
                    add(button);

                    textField = new JTextField();
                    textField.setBounds(120, 40, 100, 20);
                    add(textField);
                    System.out.println(comboBox.getSelectedItem());
                }
            }
        });

/*
        label = new JLabel("");
        label.setBounds(120, 10, 100, 20);
        add(label);

        button = new JButton("Click");
        button.setBounds(10, 40, 100, 20);
        button.addActionListener(this);
        add(button);

        textField = new JTextField();
        textField.setBounds(120, 40, 100, 20);
        add(textField);*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText(comboBox.getSelectedItem().toString());
        textField.setText(comboBox.getSelectedItem().toString());
    }

    public static void main(String[] args) {
        ComboBox comboBox = new ComboBox();
        comboBox.setVisible(true);
    }
}



