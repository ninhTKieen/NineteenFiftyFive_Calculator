package com.kiennt.calculator1975;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalCPU {
	private JFrame frame;
	private JButton Add,Minus,Product,Divide;
	private JLabel result,labelNum1,labelNum2,labelResult;
	private JTextField text1,text2;
	
	CalCPU()
	{
		// set Frame
		frame = new JFrame("Basic Calculator");
		frame.setSize(352,267);
		
		//set TextField
		setTextField();
		
		//set JLabel
		setJLabel();
		
		//set Button
		setButton();
		
		//actionPerform	
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args)
	{
		new CalCPU();
	}
	private void setTextField()
	{
		text1 = new JTextField("0");
		text1.setColumns(10);
		text1.setBounds(181, 0, 148, 59);
		
		text2 = new JTextField("0");
		text2.setColumns(10);
		text2.setBounds(181, 73, 148, 59);
		frame.getContentPane().add(text1);
		frame.getContentPane().add(text2);
	}
	private void setJLabel()
	{
		labelNum1 = new JLabel("Number 1");
		labelNum1.setBackground(Color.GRAY);
		labelNum1.setOpaque(true);
		labelNum1.setBounds(1, 0, 176, 59);
		
		labelNum2 = new JLabel("Number 2");
		labelNum2.setBackground(Color.GRAY);
		labelNum2.setOpaque(true); // chuyển màu nền
		labelNum2.setBounds(1, 73, 176, 59);
		
		labelResult = new JLabel("Result");
		labelResult.setBackground(Color.GRAY);
		labelResult.setOpaque(true);
		labelResult.setBounds(1, 143, 176, 59);
		
		result = new JLabel();
		result.setBackground(Color.WHITE);
		result.setOpaque(true);
		result.setBounds(181, 143, 148, 51);
		
		frame.getContentPane().add(labelNum1);
		frame.getContentPane().add(labelNum2);
		frame.getContentPane().add(labelResult);
		frame.getContentPane().add(result);
	}
	private void setButton()
	{
		Add = new JButton("+");
		Add.setBounds(46, 205, 56, 23);
		
		Minus = new JButton("-");
		Minus.setBounds(107, 205, 56, 23);
		
		Product = new JButton("x");
		Product.setBounds(168, 205, 56, 23);
		
		Divide = new JButton("÷");
		Divide.setBounds(229, 205, 56, 23);
		CalactionPerformed();
		frame.getContentPane().add(Add);
		frame.getContentPane().add(Minus);
		frame.getContentPane().add(Product);
		frame.getContentPane().add(Divide);
	}
	
	private void CalactionPerformed()
	{
		Add.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				double num1= Double.parseDouble(text1.getText());
				double num2= Double.parseDouble(text2.getText());
				double Output = num1 + num2;
				result.setText(Output+"");
			}
		});
		
		Minus.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				double num1= Double.parseDouble(text1.getText());
				double num2= Double.parseDouble(text2.getText());
				double Output = num1 - num2;
				result.setText(Output+"");
			}
		});
		
		Product.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				double num1= Double.parseDouble(text1.getText());
				double num2= Double.parseDouble(text2.getText());
				double Output = num1*num2;
				result.setText(Output+"");
			}
		});
		
		Divide.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				double num1= Double.parseDouble(text1.getText());
				double num2= Double.parseDouble(text2.getText());
				if(num2 == 0)
				{
					result.setText("Cannot divide zero");
				}
				else
				{
					double Output = num1/num2;
					result.setText(Output+"");
				}
			}
		});
	}
}
