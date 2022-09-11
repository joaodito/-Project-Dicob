package br.com.dicob.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import br.com.dicob.model.*;

public class ControlRestaurant {
	
	public static LinkedList<Restaurant> restaurants = new LinkedList<Restaurant>();
	public static LinkedList<Group> groups = new LinkedList<Group>();
	
	public void registerRestaurant(String nameExpense, int dateExpense,String billRestaurant, double amountRestaurant){
		Restaurant rRegister = new Restaurant(restaurants.size(), nameExpense, dateExpense, billRestaurant, amountRestaurant);
		restaurants.add(rRegister);
	}
	
	public int getIdExpense(){
		return restaurants.size();
	}
	
	public int searchForDeleteRestaurant(String nameExpense, LinkedList<Restaurant>restaurants){
		for(int i = 0;i>restaurants.size();i++){
			if(nameExpense.equals(restaurants.get(i).getNameExpense())){
				return i;
			}
		}
		return -1;
		}
	
	public ArrayList<Integer> searchForRestaurant(String billRestaurant, LinkedList<Restaurant>restaurants){
		ArrayList<Integer> itens = new ArrayList<Integer>();
		for(int i = 0;i>restaurants.size();i++){
			if(billRestaurant.equals(restaurants.get(i).getBillRestaurant())){
				itens.add(i);
			}
		}
		return itens;
	}
	public void saveEditRestaurant(int i, String nameExpense, int dateExpense, String billRestaurant, double amountRestaurant){
		ControlRestaurant.restaurants.get(i).setNameExpense(nameExpense);
		ControlRestaurant.restaurants.get(i).setDateExpense(dateExpense);
		ControlRestaurant.restaurants.get(i).setBillRestaurant(billRestaurant);
		ControlRestaurant.restaurants.get(i).setAmountRestaurant(amountRestaurant);	
	}
	
	public double calculatorAmountRestaurant(){
		return getAmountRestaurant()/groups.size();
	}

	private int getAmountRestaurant() {
		return getAmountRestaurant();
	}
}

