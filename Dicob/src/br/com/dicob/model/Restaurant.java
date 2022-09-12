package model;

/**
 * Class Restaurant stores the information of a 
 * restaurant expense and extend the class Expense
 * 
 * @author João Victor and Raquel Ferreira
 * version 1.0
 */
public class Restaurant extends Expense{
	
	private String billRestaurant;
	private double amountRestaurant;
	
	/**
	 * Restaurant Constructor
	 * 
	 * @param idExpense
	 * @param nameExpense
	 * @param dateExpense
	 * @param billRestaurant2
	 * @param amountRestaurant
	 */
	public Restaurant(int idExpense,String nameExpense, int dateExpense, String billRestaurant, double amountRestaurant){
		super(idExpense, nameExpense, dateExpense);
		this.billRestaurant = billRestaurant;
		this.amountRestaurant = amountRestaurant;
	}
	
	public Restaurant(){}
	
	public int getIdExpense() {
		return super.getIdExpense();
	}
	
	public String getNameExpense() {
		return super.getNameExpense();
	}
	
	public int getDateExpense() {
		return super.getDateExpense();
	}

	public String getBillRestaurant() {
		return billRestaurant;
	}	
	
	public void setDateExpense(int dateExpense) {
		super.setDateExpense(dateExpense);
	}
	
	public void setNameExpense(String nameExpense) {
		super.setNameExpense(nameExpense);
	}
	
	public void setIdExpense(int idExpense) {
		super.setIdExpense(idExpense);
	}
	
	public void setBillRestaurant(String billRestaurant) {
		this.billRestaurant = billRestaurant;
	}
	
	public double getAmountRestaurant() {
		return amountRestaurant;
	}
	
	public void setAmountRestaurant(double amountRestaurant) {
		this.amountRestaurant = amountRestaurant;
	}
	
	/**
	 * Method toString
	 * @return String
	 */
	public String toString() {
		return getIdExpense()+" "+getNameExpense()+""+getDateExpense()+billRestaurant+" "+amountRestaurant;
	}
}
