package model;

public class Ride extends Expense {

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
	
	public Ride() {}
	
	//Sets and gets of ride
	public double getQuilometrosTrajeto() {
		return quilometrosTrajeto;
	}
	
	public void setQuilometroTrajeto(double quilometroTrajeto) {
		this.quilometrosTrajeto = quilometroTrajeto;
	}
	
	public double getPrecoCombustivel() {
		return precoCombustivel;
	}
	
	public void setPrecoCombustivel(double precoCombustivel) {
		this.precoCombustivel = precoCombustivel;
	}
	
	public int getDesempenhoPorQuilometro() {
		return desempenhoPorQuilometro;
	}
	
	public void setDesempenhoPorQuilometro(int desempenhoPorQuilometro) {
		this.desempenhoPorQuilometro = desempenhoPorQuilometro;
	}
	
	public String toString() {
		return getIdExpense()+ ""+getNameExpense()+""+getDateExpense()+
				quilometrosTrajeto+""+precoCombustivel+""+desempenhoPorQuilometro;
	}
}
