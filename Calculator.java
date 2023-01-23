import java.awt.Color;

import javax.security.auth.Subject;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.ColorUIResource;
import javax.swing.text.AttributeSet.ColorAttribute;

public class Calculator {

    public static void main(String[] args) {
        calculator = new Calculator();
    }

    private static Calculator calculator;

    public Calculator(){
        JFrame jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(520,600);
        jf.setLocation(150, 150);

        JLabel displayJLabel=new JLabel("Hello");   
        displayJLabel.setBounds(30, 30,450, 80);
        displayJLabel.setBackground(Color.BLACK);
        displayJLabel.setOpaque(true);
        displayJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayJLabel.setForeground(Color.WHITE);
        jf.add(displayJLabel);

        JButton seveButton=new JButton("7");
        seveButton.setBounds(30,130,80,80);
        jf.add(seveButton);

        JButton eighButton=new JButton("8");
        eighButton.setBounds(130,130,80,80);
        jf.add(eighButton);

        JButton nineButton=new JButton("9");
        nineButton.setBounds(230,130,80,80);
        jf.add(nineButton);

        JButton divButton=new JButton("/");
        divButton.setBounds(330,130,80,80);
        jf.add(divButton);

        JButton fourButton=new JButton("4");
        fourButton.setBounds(30,230,80,80);
        jf.add(fourButton);

        JButton fiveButton=new JButton("5");
        fiveButton.setBounds(130,230,80,80);
        jf.add(fiveButton);

        JButton sixButton=new JButton("6");
        sixButton.setBounds(230,230,80,80);
        jf.add(sixButton);

        JButton mulButton=new JButton("x");
        mulButton.setBounds(330,230,80,80);
        jf.add(mulButton);

        JButton oneButton=new JButton("1");
        oneButton.setBounds(30,330,80,80);
        jf.add(oneButton);

        JButton twButton=new JButton("2");
        twButton.setBounds(130,330,80,80);
        jf.add(twButton);

        JButton threeButton=new JButton("3");
        threeButton.setBounds(230,330,80,80);
        jf.add(threeButton);

        JButton subButton=new JButton("-");
        subButton.setBounds(330,330,80,80);
        jf.add(subButton);

        JButton dotButton=new JButton(".");
        dotButton.setBounds(30,430,80,80);
        jf.add(dotButton);

        JButton zerButton=new JButton("0");
        zerButton.setBounds(130,430,80,80);
        jf.add(zerButton);

        JButton equalButton=new JButton("=");
        equalButton.setBounds(230,430,80,80);
        jf.add(equalButton);

        JButton addButton=new JButton("+");
        addButton.setBounds(330,430,80,80);
        jf.add(addButton);
        

        

        



        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    } 

}