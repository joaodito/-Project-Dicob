package br.com.dicob.model;

public class Restaurant extends Expense{
	
	private String billRestaurant;
	private String locationRestaurant;
	
	public Restaurant(int idExpense,String nameExpense,int dateExpense,String billRestaurant, String locationRestaurant){
		super(idExpense, nameExpense, dateExpense);
		this.billRestaurant = billRestaurant;
		this.locationRestaurant = locationRestaurant;
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
	
	public String getLocationRestaurant() {
		return locationRestaurant;
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
	
	public void setLocationRestaurant(String locationRestaurant) {
		this.locationRestaurant = locationRestaurant;
	}
	
	public String toString() {
		return getIdExpense()+" "+getNameExpense()+""+getDateExpense()+billRestaurant+" "+locationRestaurant;
	}
}
