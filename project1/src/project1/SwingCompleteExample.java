package project1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SwingCompleteExample{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Complete Swing Example");

        // JLabel
        JLabel label = new JLabel("Label: Hello, World!");
        label.setBounds(50, 20, 200, 30);

        // JCheckBox
        JCheckBox checkBox = new JCheckBox("Check me!");
        checkBox.setBounds(50, 60, 150, 30);
        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Checkbox selected");
                } else {
                    System.out.println("Checkbox deselected");
                }
            }
        });

        // JButton
        JButton button = new JButton("Click Me");
        button.setBounds(50, 100, 100, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");
            }
        });

        // JTextField
        JTextField textField = new JTextField();
        textField.setBounds(50, 140, 200, 30);

        // JTextArea
        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 180, 200, 100);

        // JRadioButton
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        radioButton1.setBounds(50, 290, 100, 30);
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        radioButton2.setBounds(160, 290, 100, 30);
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);

        // JComboBox
        String[] items = {"Item 1", "Item 2", "Item 3"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.setBounds(50, 330, 150, 30);

        // JList
        String[] listItems = {"Item A", "Item B", "Item C"};
        JList<String> list = new JList<>(listItems);
        list.setBounds(50, 370, 150, 60);

        // JMenuBar and JMenu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem menuItem = new JMenuItem("Open");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu item clicked");
            }
        });
        menu.add(menuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        // JSlider
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setBounds(50, 450, 200, 50);
        slider.addChangeListener(e -> System.out.println("Slider value: " + slider.getValue()));

        // Adding components to frame
        frame.add(label);
        frame.add(checkBox);
        frame.add(button);
        frame.add(textField);
        frame.add(textArea);
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(comboBox);
        frame.add(list);
        frame.add(slider);

        // Frame properties
        frame.setSize(400, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
}
