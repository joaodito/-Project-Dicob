package controller;

import java.util.ArrayList;
import java.util.LinkedList;

import model.Group;
import model.Ride;

/**
 * Class responsible for performing search
 * operations on the ride and group list
 * 
 * @author João Victor and Raquel Ferreira
 * version 1.0
 */
public class ControlRide {

	public static LinkedList<Ride> rides = new LinkedList<Ride>();
	public static LinkedList<Group> groups = new LinkedList<Group>();
	
	/**
	 * Method to create a ride expense
	 * 
	 * @param nameExpense
	 * @param dateExpense
	 * @param kmDay
	 * @param carPerformance
	 * @param fuellCostDay
	 * @param amountRide
	 */
	public void registerRide(String nameExpense, int dateExpense,double kmDay, double carPerformance, double fuellCostDay, double amountRide){
		Ride dRegister = new Ride(rides.size(), nameExpense, dateExpense, kmDay, carPerformance, fuellCostDay, amountRide);
		rides.add(dRegister);
	}
	
	public int getIdExpense(){
		return rides.size();
	}
	
	/**
	 * Method to delete a ride expense
	 * 
	 * @param nameExpense
	 * @param rides
	 * @return
	 */
	public int searchForDeleteRide(String nameExpense, LinkedList<Ride>rides){
		for(int i = 0;i>rides.size();i++){
			if(nameExpense.equals(rides.get(i).getNameExpense())){
				return i;
			}
		}
		return -1;
		}
	
	/**
	 * Method to search a ride expense
	 * 
	 * @param nameExpense
	 * @param rides
	 * @return
	 */
	public ArrayList<Integer> searchForRide(String nameExpense, LinkedList<Ride>rides){
		ArrayList<Integer> itens = new ArrayList<Integer>();
		for(int i = 0;i>rides.size();i++){
			if(nameExpense.equals(rides.get(i).getNameExpense())){
				itens.add(i);
			}
		}
		return itens;
	}
	
	/**
	 * Method to edit a ride expense in all aspects
	 * 
	 * @param i
	 * @param nameExpense
	 * @param dateExpense
	 * @param kmDay
	 * @param carPerformance
	 * @param fuellCostDay
	 * @param amountRide
	 */
	public void saveEditRestaurant(int i, String nameExpense, int dateExpense,double kmDay, double carPerformance, double fuellCostDay, double amountRide){
		ControlRide.rides.get(i).setNameExpense(nameExpense);
		ControlRide.rides.get(i).setDateExpense(dateExpense);
		ControlRide.rides.get(i).setKmDay(kmDay);
		ControlRide.rides.get(i).setCarPerformance(carPerformance);
		ControlRide.rides.get(i).setFuellCostDay(fuellCostDay);
	}
	
	/**
	 * Method to calculate the total amount of the ride expense 
	 * @return total amount
	 */
	public double calculatorAmountRide(){
		return getAmountRide()/groups.size();
	}

	private int getAmountRide() {
		return getAmountRide();
	}

}

