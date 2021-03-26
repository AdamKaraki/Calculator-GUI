package calc;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;

public class Main extends JFrame implements ActionListener{
	

     public JFrame j;
    // store oprerator and operands 
    String s0, s1, s2; 
    
    public static JTextField jt1;
  

	public static void main(String[] args) {
		
		JFrame j= new JFrame("Calculator");
		j.setDefaultCloseOperation(EXIT_ON_CLOSE);
		j.setResizable(false);
		j.setBounds(0,0,400,400);
		j.setLocationRelativeTo(null);
		j.setVisible(true);
		
		JPanel panel= new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);
		

		
		//JLabel
		JLabel label= new JLabel("Made by R.K 2020");
		label.setBounds(20, 68, 150, 80);
		panel.add(label);
		
		
		//Add+Subtract+Divide+Multiply+Equals+Clear buttons
		JButton addButton= new JButton("+");
		JButton subtractButton=new JButton("-");
		JButton multiplyButton=new JButton("*");
		JButton divideButton=new JButton("/");
		JButton equalsButton=new JButton("=");
		JButton clearButton=new JButton("C");
		
		addButton.setBounds(300, 80, 80, 40);
		subtractButton.setBounds(300, 140, 80, 40);
		multiplyButton.setBounds(300, 200, 80, 40);
		divideButton.setBounds(300, 260, 80, 40);
		equalsButton.setBounds(200, 320, 180, 40);
		clearButton.setBounds(200, 80, 80, 40);
		
		panel.add(addButton);
		panel.add(subtractButton);
		panel.add(multiplyButton);
		panel.add(divideButton);
		panel.add(equalsButton);
		panel.add(clearButton);
		
		
		
		
		//Number buttons
		JButton nine=new JButton("9");
		JButton eight=new JButton("8");
		JButton seven=new JButton("7");
		JButton six=new JButton("6");
		JButton five=new JButton("5");
		JButton four=new JButton("4");
		JButton three=new JButton("3");
		JButton two=new JButton("2");
		JButton one=new JButton("1");
		JButton zero=new JButton("0");
		JButton point=new JButton(".");
		
		nine.setBounds(20, 140, 80, 40);
		eight.setBounds(110, 140, 80, 40);
		seven.setBounds(200, 140, 80, 40);
		six.setBounds(20, 200, 80, 40);
		five.setBounds(110, 200, 80, 40);
		four.setBounds(200, 200, 80, 40);
		three.setBounds(20, 260, 80, 40);
		two.setBounds(110, 260, 80, 40);
		one.setBounds(200, 260, 80, 40);
		zero.setBounds(20, 320, 80, 40);
		point.setBounds(110, 320, 80, 40);
		
		
		
		panel.add(nine);
		panel.add(eight);
		panel.add(seven);
		panel.add(six);
		panel.add(five);
		panel.add(four);
		panel.add(three);
		panel.add(two);
		panel.add(one);
		panel.add(zero);
		panel.add(point);
		
		
		
		
		//Text field at the top
		jt1= new JTextField();
		jt1.setBounds(5, 5, 375, 50);
		panel.add(jt1);

			

		

		
		j.add(panel);
		j.validate();
		
        // create a object of class 
        Main c = new Main();
		
        nine.addActionListener(c); 
        eight.addActionListener(c); 
        seven.addActionListener(c); 
        six.addActionListener(c); 
        five.addActionListener(c); 
        four.addActionListener(c); 
        three.addActionListener(c); 
        two.addActionListener(c); 
        one.addActionListener(c); 
        zero.addActionListener(c); 
        clearButton.addActionListener(c); 
        divideButton.addActionListener(c); 
        addButton.addActionListener(c); 
        equalsButton.addActionListener(c); 
        multiplyButton.addActionListener(c); 
        subtractButton.addActionListener(c); 
        point.addActionListener(c);
        

	}
	public Main() {
		s0 = s1 = s2 = ""; 

	}
	
	public void actionPerformed(ActionEvent e) 
    { 
        String s = e.getActionCommand(); 
  
        // if the value is a number 
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') { 
            // if operand is present then add to second no 
            if (!s1.equals("")) 
                s2 = s2 + s; 
            else
                s0 = s0 + s; 
  
            // set the value of text 
            jt1.setText(s0 + s1 + s2); 
        } 
        else if (s.charAt(0) == 'C') { 
            // clear the one letter 
            s0 = s1 = s2 = ""; 
  
            // set the value of text 
            jt1.setText(s0 + s1 + s2); 
        } 
        else if (s.charAt(0) == '=') { 
  
            double te; 
  
            // store the value in 1st 
            if (s1.equals("+")) 
                te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
            else if (s1.equals("-")) 
                te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
            else if (s1.equals("/")) 
                te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
  
            // set the value of text 
            jt1.setText(s0 + s1 + s2 + "=" + te); 
  
            // convert it to string 
            s0 = Double.toString(te); 
  
            s1 = s2 = ""; 
        } 
        else { 
            // if there was no operand 
            if (s1.equals("") || s2.equals("")) 
                s1 = s; 
            // else evaluate 
            else { 
                double te; 
  
                // store the value in 1st 
                if (s1.equals("+")) 
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
                else if (s1.equals("-")) 
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
                else if (s1.equals("/")) 
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
  
                // convert it to string 
                s0 = Double.toString(te); 
  
                // place the operator 
                s1 = s; 
  
                // make the operand blank 
                s2 = ""; 
            } 
  
            // set the value of text 
            jt1.setText(s0 + s1 + s2); 
        } 
    } 
	
}
