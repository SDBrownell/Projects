//Program Goal: Create a Gui Calculator

//import statements
import java.awt.*;     
import javax.swing.*;
import java.awt.event.*;
import java.lang.Math;

public class Calc extends JFrame
{
   //reference variables 
   private JButton calcButton;  
   private JTextField textField; 
   private final int windowWidth = 700;   
   private final int windowHeight = 900;
   String input;
   public String output;
   String operand1a;
   String operand1b;
   String operand1c;
   String operand1d;
   String operand1e;
   String operand1f;
   String operand1g;
   String operand1h;
   String operand2;
   double answer;
   String ans;
   String number;
   double value2;
   
   //constructor
   public Calc()
   {
      //title
      super("Calculator");
      
      //size of window
      setSize(windowWidth, windowHeight);
      
      //close button
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      
      //text field(size in # of characters)
      textField= new JTextField(10);
      
      
      //panel
      JPanel panel1= new JPanel();
      add(panel1, BorderLayout.NORTH);
      panel1.add(textField);
      textField.setForeground(Color.ORANGE);
      panel1.setBackground(Color.LIGHT_GRAY);
      
      JPanel panel2=new JPanel();
      panel2.setLayout(new GridLayout(5,4));
      add(panel2);

      
      //8 buttons
      JButton button1 = new JButton("7");
      JButton button2 = new JButton("8");
      JButton button3 = new JButton("9");
      JButton button4 = new JButton("+");
      JButton button5 = new JButton("4");
      JButton button6 = new JButton("5");
      JButton button7 = new JButton("6");
      JButton button8 = new JButton("-");
      JButton button9 = new JButton("1");
      JButton button10 = new JButton("2");
      JButton button11 = new JButton("3");
      JButton button12 = new JButton("*");
      JButton button13 = new JButton(".");
      JButton button14 = new JButton("0");
      JButton button15 = new JButton("=");
      JButton button16 = new JButton("/");
      JButton button17 = new JButton("sq.root");
      JButton button18 = new JButton("exp");
      JButton button19 = new JButton("x^2");
      JButton button20 = new JButton("%");
      
      
      
      //Color
      button1.setForeground(Color.PINK);
      button2.setForeground(Color.PINK);
      button3.setForeground(Color.PINK);
      button5.setForeground(Color.PINK);
      button6.setForeground(Color.PINK);
      button7.setForeground(Color.PINK);
      button9.setForeground(Color.PINK);
      button10.setForeground(Color.PINK);
      button11.setForeground(Color.PINK);
      button14.setForeground(Color.PINK);
      
      button4.setForeground(Color.ORANGE);
      button8.setForeground(Color.ORANGE);
      button12.setForeground(Color.ORANGE);
      button16.setForeground(Color.ORANGE);
      button15.setForeground(Color.DARK_GRAY);
      
      button17.setForeground(Color.GREEN);
      button18.setForeground(Color.GREEN);  
      button19.setForeground(Color.GREEN);    
      button20.setForeground(Color.GREEN);
      
      button1.setFont(new Font("Arial", Font.BOLD, 40));
      button2.setFont(new Font("Arial", Font.BOLD, 40));
      button3.setFont(new Font("Arial", Font.BOLD, 40));
      button4.setFont(new Font("Arial", Font.BOLD, 60));
      button5.setFont(new Font("Arial", Font.BOLD, 40));
      button6.setFont(new Font("Arial", Font.BOLD, 40));
      button7.setFont(new Font("Arial", Font.BOLD, 40));
      button8.setFont(new Font("Arial", Font.BOLD, 60));
      button9.setFont(new Font("Arial", Font.BOLD, 40));
      button10.setFont(new Font("Arial", Font.BOLD, 40));
      button11.setFont(new Font("Arial", Font.BOLD, 40));
      button12.setFont(new Font("Arial", Font.BOLD, 60));
      button13.setFont(new Font("Arial", Font.BOLD, 60));
      button14.setFont(new Font("Arial", Font.BOLD, 40));
      button15.setFont(new Font("Arial", Font.BOLD, 80));
      button16.setFont(new Font("Arial", Font.BOLD, 60));
      button17.setFont(new Font("Arial", Font.BOLD, 40));
      button18.setFont(new Font("Arial", Font.BOLD, 40));
      button19.setFont(new Font("Arial", Font.BOLD, 40));
      button20.setFont(new Font("Arial", Font.BOLD, 40));
      
      textField.setFont(new Font("Arial", Font.BOLD, 40));
      
      
      //add buttons
      panel2.add(button1); 
      panel2.add(button2); 
      panel2.add(button3); 
      panel2.add(button4); 
      panel2.add(button5); 
      panel2.add(button6);
      panel2.add(button7);
      panel2.add(button8);
      panel2.add(button9);
      panel2.add(button10);
      panel2.add(button11);
      panel2.add(button12);
      panel2.add(button13);
      panel2.add(button14);
      panel2.add(button15);
      panel2.add(button16);
      panel2.add(button17);
      panel2.add(button18);
      panel2.add(button19);
      panel2.add(button20);
      
      
      button1.addActionListener(new ButtonListener1());
      button2.addActionListener(new ButtonListener2());
      button3.addActionListener(new ButtonListener3());
      button4.addActionListener(new ButtonListener4());
      button5.addActionListener(new ButtonListener5());
      button6.addActionListener(new ButtonListener6());
      button7.addActionListener(new ButtonListener7());
      button8.addActionListener(new ButtonListener8());
      button9.addActionListener(new ButtonListener9());
      button10.addActionListener(new ButtonListener10());
      button11.addActionListener(new ButtonListener11());
      button12.addActionListener(new ButtonListener12());
      button13.addActionListener(new ButtonListener13());
      button14.addActionListener(new ButtonListener14());
      button15.addActionListener(new ButtonListener15());
      button16.addActionListener(new ButtonListener16());
      button17.addActionListener(new ButtonListener17());
      button18.addActionListener(new ButtonListener18());
      button19.addActionListener(new ButtonListener19());
      button20.addActionListener(new ButtonListener20());
      
      // display window.
      setVisible(true);
   }
   

   //define action listener class(button1)
   private class ButtonListener1 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         output=textField.getText();
         number="7";
         textField.setText(output+number);
      }
   }
   //define action listener class(button2)
   private class ButtonListener2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         output=textField.getText();
         number="8";
         textField.setText(output+number); 
      }
   }
   //define action listener class(button3)
   private class ButtonListener3 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         output=textField.getText();
         number="9";
         textField.setText(output+number);  
      }
   }
   
   //define action listener class(button5)
   private class ButtonListener5 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         output=textField.getText();
         number="4";
         textField.setText(output+number); 
      }
   }
   //define action listener class(button6)
   private class ButtonListener6 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         output=textField.getText();
         number="5";
         textField.setText(output+number); 
      }
   }
   //define action listener class(button7)
   private class ButtonListener7 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         output=textField.getText();
         number="6";
         textField.setText(output+number); 
      }
   }
   //define action listener class(button9)
   private class ButtonListener9 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         output=textField.getText();
         number="1";
         textField.setText(output+number); 
      }
   }
   //define action listener class(button10)
   private class ButtonListener10 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         output=textField.getText();
         number="2";
         textField.setText(output+number); 
      }
   }
   //define action listener class(button11)
   private class ButtonListener11 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         output=textField.getText();
         number="3";
         textField.setText(output+number); 
      }
   }
   //define action listener class(button13)
   private class ButtonListener13 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         output=textField.getText();
         number=".";
         textField.setText(output+number); 
      }
   }
   //define action listener class(button14)
   private class ButtonListener14 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         output=textField.getText();
         number="0";
         textField.setText(output+number); 
      }
   }
   //define action listener class(button4)
   private class ButtonListener4 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         operand1a=textField.getText();
         input="+";
         textField.setText(""); 
      }
   }
   //define action listener class(button8)
   private class ButtonListener8 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         operand1b=textField.getText();
         input="-";
         textField.setText(""); 
      }
   }
   //define action listener class(button12)
   private class ButtonListener12 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         operand1c=textField.getText();
         input="*";
         textField.setText(""); 
      }
   }
   //define action listener class(button16)
   private class ButtonListener16 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         operand1d=textField.getText();
         input="/";
         textField.setText(""); 
      }
   }
   //define action listener class(button17)
   private class ButtonListener17 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         operand1e=textField.getText();
         input="sq.root";
         textField.setText(""); 
      }
   }
   //define action listener class(button18)
   private class ButtonListener18 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         operand1f=textField.getText();
         input="exp";
         textField.setText(""); 
      }
   }
   //define action listener class(button19)
   private class ButtonListener19 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         operand1g=textField.getText();
         input="x^2";
         textField.setText(""); 
      }
   }
   //define action listener class(button20)
   private class ButtonListener20 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         operand1h=textField.getText();
         input="%";
         textField.setText(""); 
      }
   }
   //define action listener class(button15)
   private class ButtonListener15 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         
         //addition
         if (input.equals("+"))
         {
            operand2=textField.getText();
            value2 = Double.parseDouble(operand2);
            double value = Double.parseDouble(operand1a);
            answer= value+value2;
            ans=Double.toString(answer);
            textField.setText(ans); 
         }
         //subtraction
         else if (input.equals("-"))
         {
            operand2=textField.getText();
            value2 = Double.parseDouble(operand2);
            double value = Double.parseDouble(operand1b);
            answer= value-value2;
            ans=Double.toString(answer);
            textField.setText(ans);
         }
         //multiplication
         else if (input.equals("*"))
         {
            operand2=textField.getText();
            value2 = Double.parseDouble(operand2);
            double value = Double.parseDouble(operand1c);
            answer=value*value2;
            ans=Double.toString(answer);
            textField.setText(ans); 
         }
         //division
         else if (input.equals("/"))
         {
            operand2=textField.getText();
            value2 = Double.parseDouble(operand2);
            double value = Double.parseDouble(operand1d);
            answer=value/value2;
            ans=Double.toString(answer);
            textField.setText(ans); 
         }
         //sq.root
         else if (input.equals("sq.root"))
         {
            double value = Double.parseDouble(operand1e);
            answer=Math.sqrt(value);
            ans=Double.toString(answer);
            textField.setText(ans); 
         }
         //exp
         else if (input.equals("exp"))
         {
            operand2=textField.getText();
            value2 = Double.parseDouble(operand2);
            double value = Double.parseDouble(operand1f);
            answer=Math.pow(value,value2);
            ans=Double.toString(answer);
            textField.setText(ans); 
         }
         //x^2
         else if (input.equals("x^2"))
         {
            double value = Double.parseDouble(operand1g);
            answer=Math.pow(value,2);
            ans=Double.toString(answer);
            textField.setText(ans); 
         }
         //%
         else if (input.equals("%"))
         {
            double value = Double.parseDouble(operand1h);
            answer= value/100;
            ans=Double.toString(answer);
            textField.setText(ans); 
         }
      }
   }
      
   //main method
   public static void main(String[] args)
   {
     Calc c=new Calc();
   }
  
}