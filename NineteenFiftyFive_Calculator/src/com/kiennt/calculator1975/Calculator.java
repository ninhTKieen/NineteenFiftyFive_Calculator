package com.kiennt.calculator1975;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
public class Calculator
{
	private double result = 0.0;
	private JFrame frame;
	private JButton zero,one,two,three,four,five,six,seven,eight,nine;
	private JButton Add,Minus,Product,Divide;
	private JButton dot,qual;
	private JButton power,percent;
	private JButton openPa,closePa;
	private JButton delete,totalDelete;
	private JLabel screenLabel;
	private JRadioButton radioON,radioOFF; 
	int checkPiority(char ope)
	{
		if(ope=='^')
		{
			return 2;
		}
		if(ope=='*'||ope=='/'||ope=='%')
			return 1;
		if(ope=='+'||ope=='-')
			return 0;
		
		return -1;
	}
	Calculator()
	{
		//set Frame
		frame=new JFrame("Try Calculator");
		frame.setSize(292,471);
		frame.getContentPane().setLayout(null);
		//set Button
		
		setButton();
		//set JLabel
		screenLabel = new JLabel();
		screenLabel.setBounds(10, 11, 250, 67);
		screenLabel.setBackground(Color.GRAY);
		screenLabel.setOpaque(true);
		frame.getContentPane().add(screenLabel);
		
		//setRadioButton
		setRadioButton();
		//set ActionListener
		RadioPerformed();
		CalculatePerformed();
		frame.setVisible(true);
	}

	private void RadioPerformed() {
		radioOFF.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				zero.setEnabled(false);
				one.setEnabled(false);
				two.setEnabled(false);
				three.setEnabled(false);
				four.setEnabled(false);
				five.setEnabled(false);
				six.setEnabled(false);
				seven.setEnabled(false);
				eight.setEnabled(false);
				nine.setEnabled(false);
				Add.setEnabled(false);
				Minus.setEnabled(false);
				Product.setEnabled(false);
				Divide.setEnabled(false);
				power.setEnabled(false);
				delete.setEnabled(false);
				totalDelete.setEnabled(false);
				dot.setEnabled(false);
				qual.setEnabled(false);
				closePa.setEnabled(false);
				openPa.setEnabled(false);
				percent.setEnabled(false);
			}
		});
		radioON.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				zero.setEnabled(true);
				one.setEnabled(true);
				two.setEnabled(true);
				three.setEnabled(true);
				four.setEnabled(true);
				five.setEnabled(true);
				six.setEnabled(true);
				seven.setEnabled(true);
				eight.setEnabled(true);
				nine.setEnabled(true);
				Add.setEnabled(true);
				Minus.setEnabled(true);
				Product.setEnabled(true);
				Divide.setEnabled(true);
				power.setEnabled(true);
				delete.setEnabled(true);
				totalDelete.setEnabled(true);
				dot.setEnabled(true);
				qual.setEnabled(true);
				closePa.setEnabled(true);
				openPa.setEnabled(true);
				percent.setEnabled(true);
			}
		});
	}
	public void setButton()
	{
		totalDelete = new JButton("CE");
		totalDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		totalDelete.setBounds(80, 87, 47, 38);
		totalDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(totalDelete);
		
		delete = new JButton("C");
		delete.setFont(new Font("Tahoma", Font.BOLD, 11));
		delete.setBounds(147, 87, 47, 38);
		frame.getContentPane().add(delete);
		
		Add = new JButton("+");
		Add.setFont(new Font("Tahoma", Font.BOLD, 11));
		Add.setBounds(214, 139, 47, 38);
		frame.getContentPane().add(Add);
		
		eight = new JButton("8");
		eight.setFont(new Font("Tahoma", Font.BOLD, 11));
		eight.setBounds(80, 200, 47, 38);
		frame.getContentPane().add(eight);
		
		seven = new JButton("7");
		seven.setFont(new Font("Tahoma", Font.BOLD, 11));
		seven.setBounds(10, 200, 47, 38);
		frame.getContentPane().add(seven);
		
		nine = new JButton("9");
		nine.setFont(new Font("Tahoma", Font.BOLD, 11));
		nine.setBounds(147, 200, 47, 38);
		frame.getContentPane().add(nine);
		
		Minus = new JButton("-");
		Minus.setFont(new Font("Tahoma", Font.BOLD, 11));
		Minus.setBounds(214, 200, 47, 38);
		frame.getContentPane().add(Minus);
		
		four = new JButton("4");
		four.setFont(new Font("Tahoma", Font.BOLD, 11));
		four.setBounds(10, 261, 47, 38);
		frame.getContentPane().add(four);
		
		five = new JButton("5");
		five.setFont(new Font("Tahoma", Font.BOLD, 11));
		five.setBounds(80, 261, 47, 38);
		frame.getContentPane().add(five);
		
		six = new JButton("6");
		six.setFont(new Font("Tahoma", Font.BOLD, 11));
		six.setBounds(147, 261, 47, 38);
		frame.getContentPane().add(six);
		
		Product = new JButton("*");
		Product.setFont(new Font("Tahoma", Font.BOLD, 11));
		Product.setBounds(214, 261, 47, 38);
		frame.getContentPane().add(Product);
		
		one = new JButton("1");
		one.setFont(new Font("Tahoma", Font.BOLD, 11));
		one.setBounds(10, 322, 47, 38);
		frame.getContentPane().add(one);
		
		two = new JButton("2");
		two.setFont(new Font("Tahoma", Font.BOLD, 11));
		two.setBounds(80, 322, 47, 38);
		frame.getContentPane().add(two);
		
		three = new JButton("3");
		three.setFont(new Font("Tahoma", Font.BOLD, 11));
		three.setBounds(147, 322, 47, 38);
		frame.getContentPane().add(three);
		
		Divide = new JButton("/");
		Divide.setFont(new Font("Tahoma", Font.BOLD, 11));
		Divide.setBounds(214, 322, 47, 38);
		frame.getContentPane().add(Divide);
		
		zero = new JButton("0");
		zero.setFont(new Font("Tahoma", Font.BOLD, 11));
		zero.setBounds(10, 383, 47, 38);
		frame.getContentPane().add(zero);
		
		dot = new JButton(".");
		dot.setFont(new Font("Tahoma", Font.BOLD, 11));
		dot.setBounds(80, 383, 47, 38);
		frame.getContentPane().add(dot);
		
		power = new JButton("^");
		power.setFont(new Font("Tahoma", Font.BOLD, 11));
		power.setBounds(214, 87, 47, 38);
		frame.getContentPane().add(power);
		
		qual = new JButton("=");
		qual.setFont(new Font("Tahoma", Font.BOLD, 11));
		qual.setBounds(147, 383, 114, 38);
		frame.getContentPane().add(qual);
		
		percent = new JButton("%");
		percent.setFont(new Font("Tahoma", Font.BOLD, 11));
		percent.setBounds(147, 139, 47, 38);
		frame.getContentPane().add(percent);
		
		openPa = new JButton("(");
		openPa.setFont(new Font("Tahoma", Font.BOLD, 11));
		openPa.setBounds(10, 139, 47, 38);
		frame.getContentPane().add(openPa);
		
		closePa = new JButton(")");
		closePa.setFont(new Font("Tahoma", Font.BOLD, 11));
		closePa.setBounds(80, 139, 47, 38);
		frame.getContentPane().add(closePa);
	}
	
	private void Calculating()
	{
		Stack<Character> st = new Stack<Character>();
		Stack<Double> st2= new Stack<Double>();
		String text = screenLabel.getText();
		String numberList="0123456789.";
		List<String> postfix = new ArrayList<String>();
		String operaList="+-*/^%";
		//conver infix to postfix
		String number="";
		for(int i=0;i<text.length();i++)
		{
			if(numberList.indexOf(text.charAt(i))!=-1)
			{
				number+=text.charAt(i);	
			}
			else
			{
				postfix.add(number);
				number="";
				if(text.charAt(i)=='(')
				{
					st.push('(');
				}
				else
				{
					if(text.charAt(i)==')')
					{
						while(st.peek()!='(') {
							String ope="";
							ope+=st.peek();
							st.pop();
							postfix.add(ope);
						}
						st.pop();
					}
					else
					{
						if(st.empty())
						{
							st.push(text.charAt(i));
						}
						else
						{
							if(checkPiority(text.charAt(i))>checkPiority(st.peek()))
							{
								st.push(text.charAt(i));
							}
							else
							{
								while(!st.empty())
								{
									String ope = "";
									ope+=st.peek();
									postfix.add(ope);
									st.pop();
								}
								st.push(text.charAt(i));
							}
						}
					}
				}
			}
		}
		if(number!="")
		{
			postfix.add(number);
		}
		while(!st.empty())
		{
			String opr="";
			opr+=st.peek();
			postfix.add(opr);
			st.pop();
		}
		ListIterator<String> itr = postfix.listIterator();
		while(itr.hasNext())
		{
			String s= itr.next();
			if(s=="")
			{
				itr.remove();
			}
		}
//		String list="";
//		for(int i=0;i<postfix.size();i++)
//		{
//			list=list.concat(postfix.get(i));
//		}
//		screenLabel.setText(postfix.size()+"");
		for(int i=0;i<postfix.size();i++)
		{
			if(!operaList.contains(postfix.get(i)))
			{
				st2.push(StringtoDouble(postfix.get(i)));
			}
			else
			{
				double num1= st2.peek();
				st2.pop();
				double num2= st2.peek();
				st2.pop();
				switch(postfix.get(i))
				{
					case "+":
					{
						result=num1+num2;
						break;
					}
					case "-":
					{
						result=num2-num1;
						break;
					}
					case "*":
					{
						result=num1*num2;
						break;
					}
					case "/":
					{
						result=num2/num1;
						break;
					}
					case "%":
					{
						result=num2%num1;
						break;
					}
				}
				st2.push(result);
			}
		}
		result=st2.peek();
		st2.pop();
	}
	
	private void setRadioButton()
	{
		radioON = new JRadioButton("ON");
		radioON.setBounds(10, 82, 47, 23);
		radioON.setFont(new Font("Times New Roman", Font.BOLD, 11));
		frame.getContentPane().add(radioON);
		
		radioOFF = new JRadioButton("OFF");
		radioOFF.setBounds(10, 108, 47, 23);
		radioOFF.setFont(new Font("Times New Roman", Font.BOLD, 11));
		frame.getContentPane().add(radioOFF);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioON);
		group.add(radioOFF);
	}
	private double StringtoDouble(String str)
	{
		double Num = Double.parseDouble(str);
		return Num;
	}
	private String deleteLast(String s)
	{
		s=s.substring(0,s.length()-1);
		return s;
	}
	private void CalculatePerformed()
	{
		dot.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText(screenLabel.getText().concat(dot.getText()));
			}
		});
		zero.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText(screenLabel.getText().concat(zero.getText()));
			}
		});
		one.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText(screenLabel.getText().concat(one.getText()));
			}
		});
		two.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText(screenLabel.getText().concat(two.getText()));
			}
		});
		three.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText(screenLabel.getText().concat(three.getText()));
			}
		});
		four.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText(screenLabel.getText().concat(four.getText()));
			}
		});
		five.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText(screenLabel.getText().concat(five.getText()));
			}
		});
		six.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText(screenLabel.getText().concat(six.getText()));
			}
		});
		seven.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText(screenLabel.getText().concat(seven.getText()));
			}
		});
		eight.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText(screenLabel.getText().concat(eight.getText()));
			}
		});
		nine.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText(screenLabel.getText().concat(nine.getText()));
			}
		});
		Add.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText(screenLabel.getText().concat(Add.getText()));
			}
		});
		Minus.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText(screenLabel.getText().concat(Minus.getText()));
			}
		});
		Product.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText(screenLabel.getText().concat(Product.getText()));
			}
		});
		Divide.addActionListener(new ActionListener()  {
			
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText(screenLabel.getText().concat(Divide.getText()));
			}
		});
		delete.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText(deleteLast(screenLabel.getText()));
			}
		});
		totalDelete.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText("");
			}
		});
		power.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText(screenLabel.getText().concat(power.getText()));
			}
		});
		qual.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Calculating();
					screenLabel.setText(result+"");
				} catch (Exception e2) {
					screenLabel.setText("Math Error");
				}
			}
		});
		percent.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText(screenLabel.getText().concat(percent.getText()));
			}
		});
		openPa.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText(screenLabel.getText().concat(openPa.getText()));
			}
		});
		closePa.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				screenLabel.setText(screenLabel.getText().concat(closePa.getText()));
			}
		});
	}
	public static void main(String[] args)
	{
		new Calculator();
	}
}