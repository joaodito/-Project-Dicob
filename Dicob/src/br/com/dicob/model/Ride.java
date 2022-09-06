package model;

public class Ride extends Expense{
	
	//Attributes
	private double quilometrosTrajeto;
	private double precoCombustivel;
	private int desempenhoPorQuilometro;
		
	//Reference to this attributes
	public Ride(double quilometrosTrajeto, double precoCombustivel, int desempenhoPorQuilometro) {
		super(idExpense, nameExpense, dateExpense);
		this.quilometrosTrajeto = quilometrosTrajeto;
		this.precoCombustivel = precoCombustivel;
		this.desempenhoPorQuilometro = desempenhoPorQuilometro;
	}
	
	public Ride(){}
	
	//Sets and gets of ride
	public int getIdExpense() {
		return super.getIdExpense();
	}
	
	public String getNameExpense() {
		return super.getNameExpense();
	}
	
	public int getDateExpense() {
		return super.getDateExpense();
	}

	public double getQuilometrosTrajeto() {
		return quilometrosTrajeto;
	}	
	
	public double getPrecoCombustivel() {
		return precoCombustivel;
	}
	
	public int getDesempenhoPorQuilometro() {
		return desempenhoPorQuilometro;
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
	
	public void setQuilometroTrajeto(double quilometroTrajeto) {
		this.quilometrosTrajeto = quilometroTrajeto;
	}
	
	public void setPrecoCombustivel(double precoCombustivel) {
		this.precoCombustivel = precoCombustivel;
	}
	
	public void setDesempenhoPorQuilometro(int desempenhoPorQuilometro) {
		this.desempenhoPorQuilometro = desempenhoPorQuilometro;
	}
	
	public String toString() {
		return getIdExpense()+ ""+getNameExpense()+""+getDateExpense()+
				quilometrosTrajeto+""+precoCombustivel+""+desempenhoPorQuilometro;
		
	}
}
