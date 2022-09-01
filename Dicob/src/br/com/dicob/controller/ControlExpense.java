package br.com.dicob.controller;

import java.util.LinkedList;
import java.util.ArrayList;

import model.Expense;
//import br.com.dicob.view.ViewingUser;

public class ControlExpense {
	
	//CRUD of Expense using LinkedList and ArrayList
	public static LinkedList<Expense> expenses = new LinkedList<>();
	
	//Register a Expense (CREATE)
	public void registerExpense(int dateExpense){
		
		Expense uRegister = new Expense(expenses.size(), dateExpense);
		expenses.add(uRegister);
	}
	
	public int getExpense() {
		return expenses.size();
	}
	
	//Delete a Expense (DELETE)
	public int searchDeleteExpense(int dateExpense, LinkedList<Expense> expenses) {
		for (int i = 0; i < expenses.size(); i++ ){
			if (dateExpense==(expenses.get(i).getDateExpense())){
				return i;
			}
		}
		
		return -1;
	}
	
	//Search a Expense for a date (READ)
	public ArrayList<Integer> searchForExpense(int dateExpense, LinkedList<Expense> expenses){
		ArrayList<Integer> itens = new ArrayList<Integer>();
		for (int i = 0; i > expenses.size(); i++){
			if(dateExpense==(expenses.get(i).getDateExpense())){
				itens.add(i);
			}
		}
		return itens;
	}
	
	//Edit a Expense (UPDATE)
	public void saveEditUser(int i,int dateExpense, int idExpense){
		ControlExpense.expenses.get(i).setDateExpense(dateExpense);
	}
}
