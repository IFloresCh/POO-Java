package GUI;

/*
 * CardLayoutDemo.java
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutDemo extends JFrame implements ItemListener {

    JLabel name;
    JTextField nameField;
    JLabel sciName;
    JTextField sciNameField;
    JLabel age;
    JTextField ageField;
    JLabel weight;
    JTextField weightField;
    JLabel size;
    JTextField sizeField;
    JLabel diet;
    String[] dietChoices = {"Carnivoro", "Herbivoro", "Omnivoro"};
    JComboBox dietBox;
    JLabel dietLabel;


    JLabel location;
    JTextField locationField;
    JLabel color;
    JTextField ColorField;
    JLabel altitude;
    JTextField altitudeField;
    JLabel speed;
    JTextField speedField;
    JLabel direction;
    JTextField directionField;
    JLabel wingSpan;
    JTextField wingSpanField;

    JPanel cards; //a panel that uses CardLayout
    final static String AEREO = "Aereo";
    final static String TERRESTRE = "Terrestre";
    final static String MARINO = "Marino";
    public void addComponentToPane(Container pane) {


        //Put the JComboBox in a JPanel to get a nicer look.

        JPanel comboBoxPane = new JPanel(); //use FlowLayout
        comboBoxPane.add(new JLabel("Seleccione el tipo de animal:"));


        String comboBoxItems[] = { AEREO, TERRESTRE, MARINO };
        JComboBox cb = new JComboBox(comboBoxItems);
        cb.setEditable(false);
        cb.addItemListener(this);
        comboBoxPane.add(cb);

        //Create the "cards".
        JPanel card1 = new JPanel();
        card1.setLayout(null);
        card1.setPreferredSize(new Dimension(200, 600));

        name = new JLabel("Aereo");
        name.setBounds(10, 10, 80, 25);
        card1.add(name);

        nameField = new JTextField(20);
        nameField.setBounds(130, 10, 160, 25);
        card1.add(nameField);

        sciName = new JLabel("Nombre Científico");
        sciName.setBounds(10, 40, 160, 25);
        card1.add(sciName);

        sciNameField = new JTextField(20);
        sciNameField.setBounds(130, 40, 160, 25);
        card1.add(sciNameField);

        age = new JLabel("Edad");
        age.setBounds(10, 70, 80, 25);
        card1.add(age);

        ageField = new JTextField(20);
        ageField.setBounds(130, 70, 160, 25);
        card1.add(ageField);

        weight = new JLabel("Peso");
        weight.setBounds(10, 100, 80, 25);
        card1.add(weight);

        weightField = new JTextField(20);
        weightField.setBounds(130, 100, 160, 25);
        card1.add(weightField);

        size = new JLabel("Tamaño");
        size.setBounds(10, 130, 80, 25);
        card1.add(size);

        sizeField = new JTextField(20);
        sizeField.setBounds(130, 130, 160, 25);
        card1.add(sizeField);

        diet = new JLabel("Dieta");
        diet.setBounds(10, 160, 80, 25);
        card1.add(diet);

        dietBox = new JComboBox(dietChoices);
        dietBox.setBounds(130, 160, 160, 25);
        card1.add(dietBox);

        location = new JLabel("Ubicación");
        location.setBounds(10, 190, 80, 25);
        card1.add(location);

        locationField = new JTextField(20);
        locationField.setBounds(130, 190, 160, 25);
        card1.add(locationField);

        color = new JLabel("Color");
        color.setBounds(10, 220, 80, 25);
        card1.add(color);

        ColorField = new JTextField(20);
        ColorField.setBounds(130, 220, 160, 25);
        card1.add(ColorField);

        altitude = new JLabel("Altitud");
        altitude.setBounds(10, 250, 80, 25);
        card1.add(altitude);

        altitudeField = new JTextField(20);
        altitudeField.setBounds(130, 250, 160, 25);
        card1.add(altitudeField);

        direction = new JLabel("Dirección");
        direction.setBounds(10, 280, 80, 25);
        card1.add(direction);

        directionField = new JTextField(20);
        directionField.setBounds(130, 280, 160, 25);
        card1.add(directionField);

        speed = new JLabel("Velocidad");
        speed.setBounds(10, 310, 80, 25);
        card1.add(speed);

        speedField = new JTextField(20);
        speedField.setBounds(130, 310, 160, 25);
        card1.add(speedField);

        wingSpan = new JLabel("Alcance de alas");
        wingSpan.setBounds(10, 340, 80, 25);
        card1.add(wingSpan);

        wingSpanField = new JTextField(20);
        wingSpanField.setBounds(130, 340, 160, 25);
        card1.add(wingSpanField);

        JPanel card2 = new JPanel();  // Create second panel
        card2.add(new JTextField("TextField", 20));

        JPanel card3 = new JPanel(); // Create third panel
        card3.add(new JTextField("TextField", 20));
        card3.add(new JButton("Button 1"));
        card3.add(new JButton("Button 2"));
        card3.add(new JButton("Button 3"));

        //Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        cards.add(card1, AEREO);
        cards.add(card2, TERRESTRE);
        cards.add(card3, MARINO);

        pane.add(comboBoxPane, BorderLayout.PAGE_START);
        pane.add(cards, BorderLayout.CENTER);
    }

    public void itemStateChanged(ItemEvent evt) {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)evt.getItem());
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("CardLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        CardLayoutDemo demo = new CardLayoutDemo();
        demo.addComponentToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);

        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}