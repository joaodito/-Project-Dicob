package br.com.dicob.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import br.com.dicob.controller.*;

public class ViewingMenu implements ActionListener{
	
	private static JFrame window = new JFrame("Dicob - Despesas de Carona");
	private static JLabel title = new JLabel("Tela Inicial"); 
	private static JButton user = new JButton("Usuário");
	private static JButton group = new JButton("Grupo");
	private static JButton expense = new JButton("Despesa");
	public static DataControl data = new DataControl();
	
	public ViewingMenu(){
		title.setFont(new Font("Arial", Font.BOLD, 20));
		title.setBounds(120,10,150,30);
		user.setBounds(140,100,100,30);
		group.setBounds(140,100,100,30);
		expense.setBounds(140,100,100,30);
		
		window.setLayout(null);
		
		window.add(title);
		window.add(user);
		window.add(group);
		window.add(expense);
		
		window.setSize(400,250);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	public static void main(String[] args){
		ViewingMenu menu = new ViewingMenu();
		
		user.addActionListener(menu);
		group.addActionListener(menu);
		expense.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e){
		Object src = e.getSource();
		
		if(src == user)
			new ViewingUser.showData(data, 1);
		
		if(src == group)
			new ViewingGroup.showData(data, 2);
		
		if(src == expense)
			new ViewingExpense.showData(data,3);
			
	}
	
}
