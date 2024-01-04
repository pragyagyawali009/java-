import java.awt.event.*;
import javax.swing.*;

class Calculator_Using_Swing extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField tf1, tf2, tf3;
    JButton mul, add, div, sub;

    Calculator_Using_Swing() {
        // creating JLabel for the calculator
        l1 = new JLabel("First Number:");
        l2 = new JLabel("Second Number:");
        l3 = new JLabel("Result:");

        // creating JTextField for user input
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();

        // creating JButton for mathematical operations
        mul = new JButton("*");
        add = new JButton("+");
        div = new JButton("/");
        sub = new JButton("-");

        // setting the layout and other properties
        setLayout(null);
        tf3.setEditable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);

        // adding the components to the JFrame
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        add(mul);
        add(add);
        add(div);
        add(sub);

        // setting the bounds of the components
        l1.setBounds(10, 15, 100, 10);
        l2.setBounds(10, 50, 200, 10);
        l3.setBounds(10, 85, 100, 10);
        tf1.setBounds(110, 12, 100, 20);
        tf2.setBounds(132, 46, 100, 20);
        tf3.setBounds(72, 83, 100, 20);
        mul.setBounds(10, 125, 40, 30);
        add.setBounds(60, 125, 45, 30);
        div.setBounds(115, 125, 40, 30);
        sub.setBounds(165, 125, 40, 30);

        // adding ActionListener to the buttons
        mul.addActionListener(this);
        add.addActionListener(this);
        div.addActionListener(this);
        sub.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // converting the textfield input to double
        double num1 = Double.parseDouble(tf1.getText());
        double num2 = Double.parseDouble(tf2.getText());
        double result = 0;

        if (e.getSource() == mul) {
            result = num1 * num2;
        } else if (e.getSource() == add) {
            result = num1 + num2;
        } else if (e.getSource() == div) {
            result = num1 / num2;
        } else if (e.getSource() == sub) {
            result = num1 - num2;
        }

        tf3.setText(Double.toString(result));
    }

    public static void main(String[] args) {
        new Calculator_Using_Swing();
    }
}