import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator extends JFrame
{   
   private JPanel panel;
   private JLabel messageLabel;
   private JTextField inputTextField;
   private JButton calcButton;
   private final int WINDOW_WIDTH=400;
   private final int WINDOW_HEIGHT=300;
   
   //Constructor 
   public Calculator()
   { 
      super("Calculator");
      
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      messageLabel=new JLabel("Enter an arithmetic expression");
      
      inputTextField= new JTextField(10);
      
      calcButton=new JButton("Calculate");
      
      //Action Listener for Calculate Button
      calcButton.addActionListener(new CalcButtonListener());
      
      setLayout(new BorderLayout());
      
      JPanel panel0=new JPanel();
      panel0.add(new JLabel("Calculator"));
      add(panel0, BorderLayout.NORTH);
      
      JPanel panel1=new JPanel();
      panel1.setLayout(new GridLayout(2,2));
      panel1.add(messageLabel);
      add(panel1, BorderLayout.CENTER);
      
      JPanel panel2=new JPanel();
      panel2.add(calcButton);
      add(panel2, BorderLayout.SOUTH);
      
      panel=new JPanel();
      
      panel.setLayout(new FlowLayout());
      panel.setLayout(new FlowLayout(FlowLayout.CENTER));
      
      panel.add(messageLabel);
      panel.add(inputTextField);
      panel.add(calcButton);
      
      add(panel);
      
      setVisible(true);
   }
   
   // Class CalcButtonListener
   private class CalcButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         double firstDigit;
         double secondDigit;
         double answer;
         
         //Calculations Code!!!
      }
   }
         
   
   //Main Method
   public static void main(String[] args)
   {
      new Calculator();
   }
}
      
      
   
   