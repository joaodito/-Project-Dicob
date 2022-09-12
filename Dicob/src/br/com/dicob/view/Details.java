package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controller.*;
import data.ControlData;
import model.*;

public class Details {
	private JFrame window;
	private JLabel labelNameUser = new JLabel("Nome: ");
	private JTextField ViewNameUser;
	private JLabel labelCpfUser  = new JLabel("CPF: ");
	private JTextField ViewCpfUser; 
	private JLabel labelEmailUser = new JLabel("E-mail: ");
	private JTextField ViewEmailUser; 
	private JLabel labelNameGroup = new JLabel("Nome do Grupo: ");
	private JTextField ViewNameGroup;
	private JLabel labelCategoryGroup = new JLabel("Categoria: ");
	private JTextField ViewCategoryGroup;
	private JLabel labelNameExpense = new JLabel("Nome da despesa: ");
	private JTextField ViewNameExpense;
	private JButton optionDelete = new JButton ("Excluir");
	private JButton optionSave = new JButton ("Salvar");
	private String [] newUser = new String [3];
	private static ControlData data;
	private int position;
	private int option;
	private String text;
	
	public void insert(int op, ControlData d, ViewingRegister r, int pos){
		data = d;
		
		if (option == 1){
			text = "Cadastro de Usu�rio";
		}
		if (option == 2){
			text = "Cadastro de Grupo";
		}
		if (option == 3){
			text = "Cadastro de Despesa";
		}
		if (option == 4){
			text = "Informa��es do Usu�rio";
		}
		if (option == 5){
			text = "Informa��es do Grupo";
		}
		if (option == 6){
			text = "Informa��es da Despesa";
		}
		
		window = new JFrame(text);
		
		if (option ==4){
			ViewNameUser = new JTextField(String.getNameUser()[position].getNameUser(),200);
			ViewCpfUser = new JTextField(String.getCpfUser()[position].getCpfUser(),100);
			ViewEmailUser = new JTextField(String.getEmailUser()[position].getEmailUser(),100);
	
		}else if (option == 5){
			ViewNameGroup = new JTextField(data.getNameUser()[position].getNameUser(),100);
			ViewCategoryGroup = new JTextField(data.getCpfUser()[position].getCpfUser(),100);
	
		}else if (option == 6){
			ViewNameExpense = new JTextField(data.getNameExpense()[position].getNameExpense(),100);
			ViewAmountExpense = new JTextField(data.getAmoutExpense()[position].getAmountExpense(),200);
			ViewAmoutDivExpense = new JTextField (data.getAmountDivExpense()[position].getAmounDivExpense(),200);
			
		}else {
			ViewNameUser = new JTextField(200);
			ViewCpfUser = new JTextField(100);
			ViewEmailUser = new JTextField (200);
			optionSave.setBounds(200, 100, 100, 50);
		}
		
		labelNameUser.setBounds(200, 100, 100, 50);
		labelCpfUser.setBounds(200, 100, 100, 50);
		labelEmailUser.setBounds(200, 100, 100, 50);
		labelNameGroup.setBounds(200, 100, 100, 50);
		labelCategoryGroup.setBounds(200, 100, 100, 50);
		labelNameExpense.setBounds(200, 100, 100, 50);
		ViewNameUser.setBounds(200, 100, 100, 50);
		ViewCpfUser.setBounds(200, 100, 100, 50);
		ViewEmailUser.setBounds(200, 100, 100, 50);
		ViewNameGroup.setBounds(200, 100, 100, 50);
		ViewCategoryGroup.setBounds(200, 100, 100, 50);
		ViewNameExpense.setBounds(200, 100, 100, 50);
		
		if(option == 1 || option == 4 ){
			this.window.add(labelNameUser);
			this.window.add(ViewNameUser);
		}
		
		if(option == 2 || option == 5 ){
			this.window.add(labelNameUser);
			this.window.add(ViewNameUser);	
		}

		if(option == 4 || option == 5 || option == 6 ){
			optionDelete.setBounds(200, 100, 100, 50);
			ViewNameExpense.setBounds(200, 100, 100, 50);
		}else {
		}
	}		
		}
