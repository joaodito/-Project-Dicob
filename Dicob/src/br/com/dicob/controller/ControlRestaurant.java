package controller;

import java.util.ArrayList;
import java.util.LinkedList;
import model.*;

/**
 * Class responsible for performing search
 * operations on the restaurant and group list
 * 
 * @author João Victor and Raquel Ferreira
 * version 1.0
 */
public class ControlRestaurant {
	
	public static LinkedList<Restaurant> restaurants = new LinkedList<Restaurant>();
	public static LinkedList<Group> groups = new LinkedList<Group>();
	
	/**
	 * Method to create a restaurant expense
	 * 
	 * @param nameExpense
	 * @param dateExpense
	 * @param billRestaurant
	 * @param amountRestaurant
	 */
	public void registerRestaurant(String nameExpense, int dateExpense, String billRestaurant, double amountRestaurant){
		Restaurant rRegister = new Restaurant(restaurants.size(), nameExpense, dateExpense, billRestaurant, amountRestaurant);
		restaurants.add(rRegister);
	}
	
	public int getIdExpense(){
		return restaurants.size();
	}
	
	/**
	 * Method to delete a restaurant expense
	 * 
	 * @param nameExpense
	 * @param restaurants
	 * @return
	 */
	public int searchForDeleteRestaurant(String nameExpense, LinkedList<Restaurant>restaurants){
		for(int i = 0;i>restaurants.size();i++){
			if(nameExpense.equals(restaurants.get(i).getNameExpense())){
				return i;
			}
		}
		return -1;
		}
	
	/**
	 * Method to search a restaurant expense 
	 * 
	 * @param billRestaurant
	 * @param restaurants
	 * @return
	 */
	public ArrayList<Integer> searchForRestaurant(String billRestaurant, LinkedList<Restaurant>restaurants){
		ArrayList<Integer> itens = new ArrayList<Integer>();
		for(int i = 0;i>restaurants.size();i++){
			if(billRestaurant.equals(restaurants.get(i).getBillRestaurant())){
				itens.add(i);
			}
		}
		return itens;
	}
	
	/**
	 * Method to edit a restaurant expense in all aspects
	 * 
	 * @param i
	 * @param nameExpense
	 * @param dateExpense
	 * @param billRestaurant
	 * @param amountRestaurant
	 */
	public void saveEditRestaurant(int i, String nameExpense, int dateExpense, String billRestaurant, double amountRestaurant){
		ControlRestaurant.restaurants.get(i).setNameExpense(nameExpense);
		ControlRestaurant.restaurants.get(i).setDateExpense(dateExpense);
		ControlRestaurant.restaurants.get(i).setBillRestaurant(billRestaurant);
		ControlRestaurant.restaurants.get(i).setAmountRestaurant(amountRestaurant);	
	}
	
	/**
	 * Method to calculate the total amount of the restaurant expense 
	 * @return total amount
	 */
	public double calculatorAmountRestaurant(){
		return getAmountRestaurant()/groups.size();
	}

	private int getAmountRestaurant() {
		return getAmountRestaurant();
	}
}
