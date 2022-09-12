package model;

/**
 * Abstract class that its attributes and methods 
 * can be used by the restaurant and ride classes
 * 
 * @author João Victor and Raquel Ferreira
 * version 1.0
 * 
 * @see Restaurant
 * @see Ride
 */

public abstract class Expense {

	private int idExpense;
	private String nameExpense;
	private int dateExpense;

	/**
	 * Expense Constructor
	 * 
	 * @param idExpense 
	 * @param nameExpense 
	 * @param dateExpense
	 */
	
	public Expense(int idExpense, String nameExpense,int dateExpense){
		this.idExpense = idExpense;
		this.nameExpense = nameExpense;
		this.dateExpense = dateExpense;
	}
	
	public Expense(){}

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
	
	/**
	 * Method toString
	 * @return String
	 */
	public String toString() {
		return idExpense+""+nameExpense+""+dateExpense+"";
	}

}
