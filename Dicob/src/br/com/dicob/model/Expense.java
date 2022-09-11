package br.com.dicob.model;

public abstract class Expense {

	//Attributes
	private int idExpense;
	private String nameExpense;
	private int dateExpense;

	//Reference to this attributes
	public Expense(int idExpense, String nameExpense,int dateExpense){
		this.idExpense = idExpense;
		this.nameExpense = nameExpense;
		this.dateExpense = dateExpense;
	}
	
	public Expense(){}

	//Sets and gets of users 
	public int getIdExpense() {
		return idExpense;
	}

	public String getNameExpense() {
		return nameExpense;
	}
	
	public int getDateExpense() {
		return dateExpense;
	}
	
	public void setIdExpense(int idExpense) {
		this.idExpense = idExpense;
	}
	
	public void setNameExpense(String nameExpense) {
		this.nameExpense = nameExpense;
	}
	
	public void setDateExpense(int dateExpense) {
		this.dateExpense = dateExpense;
	}
	
	public String toString() {
		return idExpense+""+nameExpense+""+dateExpense+"";
	}

}