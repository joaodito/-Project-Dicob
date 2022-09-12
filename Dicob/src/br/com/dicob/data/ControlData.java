package data;

import model.*;
import java.util.LinkedList;

/** 
 * Class ControlData mediates between the control and the
 * view with CRUD operations
 * 
 * @author João Victor and Raquel Ferreira
 * version 1.0
 */
public class ControlData {
	private Data d = new Data();
	
	public ControlData(){
		d.fillWithSomeData();
	}
	
	public Data getData(){
		return d;
	}
	
	public void setD(Data d) {
		this.d = d;
	}
	
	public LinkedList<Group> getGroups(){
		return this.d.getGroups();
	}
	
	public LinkedList<User> getUsers(){
		return this.d.getUsers();
	}
	
	public LinkedList<Restaurant> getRestaurants() {
		return this.d.getRestaurants();
	}
	
	/**
	 * Method checks if the objects in the list are null, String or int
	 * 
	 * @param atr
	 * @return true if an object is null, "" or 0, and false otherwise
	 */
	public boolean controlObject(Object[] atr){
		for(Object o: atr){
			if(atr == null){
				return true;
				}if(o.equals("")){
					return true;
					}if(o.equals(0)){
						return true;
					}else{
						return false;
						}
					}
		return false;
	}	
	
	/**
	 * Method to create a user and add in users list
	 * 		
	 * @param nameUser
	 * @param emailUser
	 * @param cpf
	 * @return true if succeed in create and add the user
	 */
	public boolean registerUser(String nameUser, String emailUser, String cpf){
		
		User uRegister = new User(nameUser, emailUser, cpf);
		getUsers().add(uRegister);
		return true;
	}
	
	/**
	 * Method to edit a user in all aspects
	 * 
	 * @param idUser
	 * @param nameUser
	 * @param emailUser
	 * @param cpfUser
	 * @return true if succeed in edit the information of the user
	 */
	public boolean updateUser(int idUser, String nameUser, String emailUser, String cpfUser){
		if(idUser < 0) return false;
		User user = d.getUser(idUser);
		if (user == null) return false;
		user.setNameUser(nameUser);
		user.setEmailUser(emailUser);
		user.setCpfUser(cpfUser);
		return true;
	}
	
	/**
	 * Method to delete a user from users list
	 * 
	 * @param idUser
	 * @return 
	 */
	public boolean takeOutUser(int idUser){
		if(idUser < 0){
			return false;
		}	
		return d.deleteUser(idUser);
	}
	
	/**
	 * Method to delete a group from group list
	 * 
	 * @param idGroup
	 * @return
	 */
	public boolean takeOutGroup(int idGroup){
		if(idGroup < 0){
			return false;
		}	
		return d.deleteGroup(idGroup);
	}
	
	/**
	 * Method to create a group and add in group list
	 * 
	 * @param nameGroup
	 * @param categoryGroup
	 * @return true if succeed create and add the group
	 */
	public boolean registerGroup(String nameGroup, String categoryGroup){
		Object[] atr = {nameGroup, categoryGroup};
		if (controlObject(atr)) return false;
		Group g = new Group();
		d.gRegister(g);
		return true;
	}
	/**
	 * Method to edit a group in all aspects
	 * 
	 * @param idGroup
	 * @param nameGroup
	 * @param categoryGroup
	 * @return true if succeed edit the information of the group
	 */
	public boolean updateGroup(int idGroup, String nameGroup, String categoryGroup){
		Object[] atr= {idGroup, nameGroup, categoryGroup};
		if(controlObject(atr) || idGroup < 0) return false;
		Group group = d.getGroup(idGroup);
		if (group == null) return false;
		group.setNameGroup(nameGroup);
		group.setCategoriaGroup(categoryGroup);
		return true;
	}
	/**
	 * Method to create a restaurant expense in a group
	 * 
	 * @param nameExpense
	 * @param dateExpense
	 * @param billRestaurant
	 * @param amountRestaurant
	 * @return true if succeed in create the restaurant expense, and false otherwise
	 */
	public boolean registerRestaurant(String nameExpense, int dateExpense, String billRestaurant, double amountRestaurant){
		Object[] atr = {nameExpense, dateExpense, billRestaurant,amountRestaurant};
		if (controlObject(atr)) return false;
		Group g = new Group();
		d.gRegister(g);
		return true;
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
	 * Method to create a ride expense
	 * 
	 * @param nameExpense
	 * @param dateExpense
	 * @param kmDay
	 * @param carPerformance
	 * @param fuellCostDay
	 * @param amountRide
	 * @return true if succeed in create the ride expense
	 */
	public boolean registerRide(String nameExpense, int dateExpense, double kmDay, double carPerformance, double fuellCostDay, double amountRide){
		Object[] atr = {nameExpense, dateExpense, kmDay, carPerformance, fuellCostDay, amountRide};
		if (controlObject(atr)) return false;
		Group g = new Group();
		d.gRegister(g);
		return true;
	}
	
	/**
	 * Method to delete a ride expense
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
}
