package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.text.ParseException;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import br.com.dicob.controller.*;
import br.com.dicob.data.*;
import br.com.dicob.model.*;

public class Register extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private static ControlData datas;
	
	private static JPanel opWindow = new JPanel();
	private static JPanel windowMenu = new JPanel();
	private static JPanel spaceWindow = new JPanel();
	
	private static JButton opCreate = new JButton("Adicionar:");
	private static JButton opRemove = new JButton("Remove");
	private static JButton opSave = new JButton("Salvar");
	private static JButton opCancel = new JButton("Cancelar");
	private static JButton opEdit = new JButton("Editar");
	private static JButton opCalculator = new JButton("Dividir:");
	private static JButton opPagar = new JButton("Pagar");
	
	private static JLabel nameUser = new JLabel("Usu�rio:");
	private static JLabel emailUser = new JLabel("Email:");
	private static JLabel cpfUser = new JLabel("CPF:");
	
	private static JTextField spaceNameUser = new JTextField(20);
	private static JTextField spaceEmailUser = new JTextField(30);
	private static JTextField spaceCpfUser = new JTextField(10);
	private static JTextField spaceNameGroup = new JTextField(20);
	private static JTextField spaceCategoryGroup = new JTextField(20);
	private static JTextField spaceNameExpense = new JTextField(20);
	private static JTextField spaceDateExpense = new JTextField(8);
	private static JTextField spaceBillRestaurant = new JTextField(20);
	private static JTextField spaceAmountRestaurant = new JTextField(10);
	private static JTextField spaceKmDay = new JTextField(10);
	private static JTextField spaceFuellCostDay = new JTextField(10);
	private static JTextField spaceCarPerformance = new JTextField(10);
	
	private static int windowH = 600;
	private static int windowW = 600;
	
	private LinkedList <User> users = new LinkedList <User>();
	private LinkedList <Group> groups = new LinkedList <Group>();
	private LinkedList <Restaurant> restaurants = new LinkedList <Restaurant>();
	private LinkedList <Ride> rides = new LinkedList <Ride>();

	public insertUser(ControlData data) {
		setModal(true);
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		data = data;

		setTitle("Criar usu�rio:");
		setLayout(new BorderLayout());

		windowMenu.setLayout(new GridLayout(4, 2));
		windowMenu.setBorder(new EmptyBorder(18, 10, 20, 10));

		windowMenu.add(nameUser);
		windowMenu.add(spaceNameUser);
		windowMenu.add(emailUser);
		windowMenu.add(spaceEmailUser);
		windowMenu.add(cpfUser);
		windowMenu.add(spaceCpfUser);

		add(windowMenu, BorderLayout.CENTER);

		opWindow.setLayout(new FlowLayout());
		opWindow.add(opCancel);
		opWindow.add(opSave);

		add(opWindow, BorderLayout.SOUTH);

		opCancel.addActionListener(this);
		opSave.addActionListener(this);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();

		setBounds(200, 130, 300, 250);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == opSave) {
			if (data.insertUser(spaceNameUser.getText(), spaceEmailUser.getText(), spaceCpfUser.getText())) {
				JOptionPane.showMessageDialog(null, "Novo usu�rio!", null, JOptionPane.INFORMATION_MESSAGE);
				opCancel.doClick();
			} else {
				JOptionPane.showMessageDialog(null, "Erro em adicionar novo usuario!", null,JOptionPane.INFORMATION_MESSAGE);
				revalidate();
				repaint();
			}
		}

		if (src == opCancel) {
			windowMenu.removeAll();
			
			spaceNameUser.setText("");
			spaceEmailUser.setText("");

			opSave.removeActionListener(this);
			opCancel.removeActionListener(this);

			setVisible(false);
			dispose();
		}

	}
	
	

}

