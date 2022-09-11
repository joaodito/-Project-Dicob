package br.com.dicob.model;

public class Ride extends Expense{

	private double kmDay;
	private double carPerformance;
	private double fuellCostDay;
	private double amountRide;
	
	public Ride(int idExpense, String nameExpense,int dateExpense,double kmDay, double carPerformance, double fuellCostDay, double amountRide){
		super(idExpense, nameExpense, dateExpense);
		this.kmDay = kmDay;
		this.carPerformance = carPerformance;
		this.fuellCostDay = fuellCostDay;
		this.amountRide = amountRide;
	}	
	
	public double getCarPerformance() {
		return carPerformance;
	}
	
	public double getFuellCostDay() {
		return fuellCostDay;
	}
	
	public double getKmDay() {
		return kmDay;
	}
	
	public int getDateExpense() {
		return super.getDateExpense();
	}
	
	public int getIdExpense() {
		return super.getIdExpense();
	}
	
	public String getNameExpense() {
		return super.getNameExpense();
	}
	
	public void setNameExpense(String nameExpense) {
		super.setNameExpense(nameExpense);
	}
	
	public void setDateExpense(int dateExpense) {
		super.setDateExpense(dateExpense);
	}
	
	public void setCarPerformance(double carPerformance) {
		this.carPerformance = carPerformance;
	}
	
	public void setIdExpense(int idExpense) {
		super.setIdExpense(idExpense);
	}
	
	public void setFuellCostDay(double fuellCostDay) {
		this.fuellCostDay = fuellCostDay;
	}
	
	public void setKmDay(double kmDay) {
		this.kmDay = kmDay;
	}
	
	public void amountRide(){
		this.amountRide = (kmDay/carPerformance)*fuellCostDay;
	}
	
	public double getAmountRide() {
		return amountRide;
	}
	
	public String toString() {
		return getIdExpense()+" "+getNameExpense()+""+getDateExpense()+carPerformance+""+kmDay+" "+fuellCostDay;
	}

	
}
