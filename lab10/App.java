package lab10;

/**
 * Created by kiril on 20.11.2017.
 */
import javax.swing.*;
import java.awt.*;



public class App extends JFrame
{
    JTextArea display= new JTextArea("Result");
    JPanel buttonPanel = new JPanel(new GridLayout(5,3));
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonAddition = new JButton("+");
    JButton buttonDivision = new JButton("/");
    JButton buttonSub = new JButton("-");
    JButton buttonMultiplication = new JButton("*");
    JButton buttonEquality = new JButton("=");



    public App(){
        setVisible(true);
        setTitle("Calculator");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        display.setEditable(false);
        add(buttonPanel, BorderLayout.CENTER);

        buttonPanel.add(button9);
        buttonPanel.add(button8);
        buttonPanel.add(button7);
        buttonPanel.add(button6);
        buttonPanel.add(button5);
        buttonPanel.add(button4);
        buttonPanel.add(button3);
        buttonPanel.add(button2);
        buttonPanel.add(button1);
        buttonPanel.add(button0);
        buttonPanel.add(buttonAddition);
        buttonPanel.add(buttonSub);
        buttonPanel.add(buttonMultiplication);
        buttonPanel.add(buttonDivision);
        buttonPanel.add(buttonEquality);
    }

    public static void main( String[] args )
    {
        new App();
    }

}