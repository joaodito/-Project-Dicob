package br.com.dicob.controller;

import java.util.ArrayList;
import java.util.LinkedList;

import br.com.dicob.model.Group;
import br.com.dicob.model.Ride;

public class ControlRide {

	public static LinkedList<Ride> rides = new LinkedList<Ride>();
	public static LinkedList<Group> groups = new LinkedList<Group>();
	
	public void registerRide(String nameExpense, int dateExpense,double kmDay, double carPerformance, double fuellCostDay, double amountRide){
		Ride dRegister = new Ride(rides.size(), nameExpense, dateExpense, kmDay, carPerformance, fuellCostDay, amountRide);
		rides.add(dRegister);
	}
	
	public int getIdExpense(){
		return rides.size();
	}
	
	public int searchForDeleteRide(String nameExpense, LinkedList<Ride>rides){
		for(int i = 0;i>rides.size();i++){
			if(nameExpense.equals(rides.get(i).getNameExpense())){
				return i;
			}
		}
		return -1;
		}
	
	public ArrayList<Integer> searchForRide(String nameExpense, LinkedList<Ride>rides){
		ArrayList<Integer> itens = new ArrayList<Integer>();
		for(int i = 0;i>rides.size();i++){
			if(nameExpense.equals(rides.get(i).getNameExpense())){
				itens.add(i);
			}
		}
		return itens;
	}
	public void saveEditRestaurant(int i, String nameExpense, int dateExpense,double kmDay, double carPerformance, double fuellCostDay, double amountRide){
		ControlRide.rides.get(i).setNameExpense(nameExpense);
		ControlRide.rides.get(i).setDateExpense(dateExpense);
		ControlRide.rides.get(i).setKmDay(kmDay);
		ControlRide.rides.get(i).setCarPerformance(carPerformance);
		ControlRide.rides.get(i).setFuellCostDay(fuellCostDay);
	}
	
	public double calculatorAmountRestaurant(){
		return getAmountRide()/groups.size();
	}

	private int getAmountRide() {
		return getAmountRide();
	}

}

