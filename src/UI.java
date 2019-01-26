import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame {
    private double firstNum;
    private double secondNum;
    private double result;
    private JLabel firstNumberLabel = new JLabel("First Number");
    private JLabel secondNumberLabel = new JLabel("Second Number");
    private JLabel resultLabel = new JLabel("Result");
    private JTextField firstNumberText = new JTextField();
    private JTextField secondNumberText = new JTextField();
    private JTextField resultText = new JTextField();
    private JButton plus = new JButton("+");
    private JButton minus = new JButton("-");
    private JButton multiply = new JButton("*");
    private JButton divide = new JButton("/");
    private JButton modulus = new JButton("%");
    private JButton clear = new JButton("CLEAR");

    public UI(){
        super("Calculator");
        //super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setBounds(600, 250, 450, 338);

        super.add(Panel());
        super.setVisible(true);
    }


    private JPanel Panel(){
        firstNumberText.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        secondNumberText.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        resultText.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        resultText.setEditable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6,2,10,5));
        panel.add(firstNumberLabel);

        panel.add(firstNumberText);
        panel.add(secondNumberLabel);
        panel.add(secondNumberText);
        panel.add(resultLabel);
        panel.add(resultText);
        panel.add(plus);
        panel.add(minus);
        panel.add(multiply);
        panel.add(divide);
        panel.add(modulus);
        panel.add(clear);

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumberText.setText("");
                secondNumberText.setText("");
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    firstNum = Double.parseDouble(firstNumberText.getText());
                    secondNum = Double.parseDouble(secondNumberText.getText());
                    result = firstNum + secondNum;

                    resultText.setText((long) result == result ? "" + (long) result : "" + result);
                }
                catch (NumberFormatException ex){
                    resultText.setText("NaN");
                }
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    firstNum = Double.parseDouble(firstNumberText.getText());
                    secondNum = Double.parseDouble(secondNumberText.getText());
                    result = firstNum - secondNum;

                    resultText.setText((long) result == result ? "" + (long) result : "" + result);
                }
                catch (NumberFormatException ex){
                    resultText.setText("NaN");
                }
            }
        });

        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    firstNum = Double.parseDouble(firstNumberText.getText());
                    secondNum = Double.parseDouble(secondNumberText.getText());
                    result = firstNum * secondNum;

                    resultText.setText((long) result == result ? "" + (long) result : "" + result);
                }
                catch (NumberFormatException ex){
                    resultText.setText("NaN");
                }
            }
        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    firstNum = Double.parseDouble(firstNumberText.getText());
                    secondNum = Double.parseDouble(secondNumberText.getText());
                    result = firstNum / secondNum;

                    resultText.setText((long) result == result ? "" + (long) result : "" + result);
                }
                catch (Exception ex){
                    resultText.setText("NaN");
                }
            }
        });

        modulus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    firstNum = Double.parseDouble(firstNumberText.getText());
                    secondNum = Double.parseDouble(secondNumberText.getText());
                    result = firstNum % secondNum;

                    resultText.setText((long) result == result ? "" + (long) result : "" + result);
                }
                catch (Exception ex){
                    resultText.setText("NaN");
                }
            }
        });

        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        return panel;
    }
}
