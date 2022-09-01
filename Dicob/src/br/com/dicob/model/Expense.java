package br.com.dicob.model;

public class Expense {

	//Attributes
	private int idExpense;
	private int dateExpense;

	//Reference to this attributes
	public Expense(int idExpense, int dateExpense){
		this.idExpense = idExpense;
		this.dateExpense = dateExpense;
	}
	
	public Expense(){}

	//Sets and gets of users 
	public int getIdExpense() {
		return idExpense;
	}

	public int getDateExpense() {
		return dateExpense;
	}

	public void setDateExpense(int dateExpense) {
		this.dateExpense = dateExpense;
	}

	//Constructor of a expense
	public String toString() {
		return idExpense + "" + dateExpense;
	}
}
