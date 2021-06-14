import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

  

public class Calculator implements ActionListener{
	
	boolean isOperatorClicked=false;
	String oldValue;
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton eqalButton;
	JButton divButton;
	JButton mulButton;
	JButton minusButton;
	JButton plusButton,clearButton;
	
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(540, 600);
		jf.setLocation(300,100);
		
		
		displayLabel=new JLabel();
		displayLabel.setFont(new Font("Arial", Font.PLAIN, 40));
		displayLabel.setBounds(30, 50, 480, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		
		
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 120, 80, 80);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
		sevenButton.setBackground(Color.gray);
		sevenButton.setForeground(Color.white);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130, 120, 80, 80);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
		eightButton.setBackground(Color.gray);
		eightButton.setForeground(Color.white);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230, 120, 80, 80);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
		nineButton.setBackground(Color.gray);
		nineButton.setForeground(Color.white);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
		fourButton.setBackground(Color.gray);
		fourButton.setForeground(Color.white);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
		fiveButton.setBackground(Color.gray);
		fiveButton.setForeground(Color.white);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
		sixButton.setBackground(Color.gray);
		sixButton.setForeground(Color.white);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 330, 80, 80);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
		oneButton.setBackground(Color.gray);
		oneButton.setForeground(Color.white);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
		twoButton.setBackground(Color.gray);
		twoButton.setForeground(Color.white);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
		threeButton.setBackground(Color.gray);
		threeButton.setForeground(Color.white);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		
		dotButton=new JButton(".");
		dotButton.setBounds(30, 430, 80, 80);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
		dotButton.setBackground(Color.gray);
		dotButton.setForeground(Color.white);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(130, 430, 80, 80);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
		zeroButton.setBackground(Color.gray);
		zeroButton.setForeground(Color.white);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		eqalButton=new JButton("=");
		eqalButton.setBounds(230, 430, 80, 80);
		eqalButton.setFont(new Font("Arial", Font.PLAIN, 40));
		eqalButton.setBackground(Color.gray);
		eqalButton.setForeground(Color.white);
		eqalButton.addActionListener(this);
		jf.add(eqalButton);
		
		divButton=new JButton("/");
		divButton.setBounds(330, 120, 80, 80);
		divButton.setFont(new Font("Arial", Font.PLAIN, 40));
		divButton.setBackground(Color.gray);
		divButton.setForeground(Color.white);
		divButton.addActionListener(this);
		jf.add(divButton);
		
		mulButton=new JButton("*");
		mulButton.setBounds(330, 230, 80, 80);
		mulButton.setFont(new Font("Arial", Font.PLAIN, 40));
		mulButton.setBackground(Color.gray);
		mulButton.setForeground(Color.white);
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(330, 330, 80, 80);
		minusButton.setFont(new Font("Arial", Font.PLAIN, 40));
		minusButton.setBackground(Color.gray);
		minusButton.setForeground(Color.white);
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		plusButton=new JButton("+");
		plusButton.setBounds(330, 430, 80, 80);
		plusButton.setFont(new Font("Arial", Font.PLAIN, 40));
		plusButton.setBackground(Color.gray);
		plusButton.setForeground(Color.white);
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		clearButton=new JButton("clear");
		clearButton.setBounds(430, 430, 80, 80);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 18));
		clearButton.setBackground(Color.gray);
		clearButton.setForeground(Color.white);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

	public void actionPerformed(ActionEvent e) {
		//jf.getContentPane().setBackground(Color.black);
		//displayLabel.setText("7");
		if(e.getSource()== sevenButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"7");
			}
			
		}else if(e.getSource()== eightButton) {
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"8");
			}
			
		}else if(e.getSource()== nineButton) {
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"9");
			}
			
		}else if(e.getSource()== fourButton) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"4");
			}
			
		}else if(e.getSource()== fiveButton) {
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"5");
			}
			
		}else if(e.getSource()== sixButton) {
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"6");
			}
			
		}else if(e.getSource()== oneButton) {
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"1");
			}
			
		}else if(e.getSource()== twoButton) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"2");
			}
			
		}else if(e.getSource()== threeButton) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"3");
			}
			
		}else if(e.getSource()== zeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"0");
			}
			
		}else if(e.getSource()== dotButton) {
			if(isOperatorClicked) {
				displayLabel.setText(".");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+".");
			}
			
		}else if(e.getSource()== eqalButton) {
			String newValue=displayLabel.getText();
			
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			
			float result=oldValueF+newValueF;
			displayLabel.setText(result+"");
			
			isOperatorClicked=true;
			
		}else if(e.getSource()== plusButton) {
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			
		}else if(e.getSource()== mulButton) {
			
		}else if(e.getSource()== divButton) {
			
		}else if(e.getSource()== minusButton) {
			
		}else if(e.getSource()== clearButton) {
			displayLabel.setText("");
			
		}
		
	}
}
