package br.com.dicob.data;

import br.com.dicob.model.*;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

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
	
	public LinkedList<Expense> getExpenses(){
		return this.d.getExpenses();
	}
	
	public boolean controlObject(Object[] object){
		for(Object o: object){
			if(this == null){
				return true;
				}if(o.equals("")){
					return true;
					}if(o.equals(0)){
						return true;
					}else{
						return false;
						}
					}
				}	
			
	
	public boolean insertUser(String[] dataUser, String nameUser, String emailUser, int cpfUser){
		Object[] atr = {nameUser, emailUser, cpfUser};
		if (controlObject(atr)) return false;
		User u = new User();
		Data.uRegister(u);
		return true;
	}
	
	public boolean updateUser(String[] dataUser, int idUser, String nameUser, String emailUser, int cpfUser){
		Object[] atr={};
		if(controlObject(atr) || idUser < 0) return false;
		User user = data.getUser(idUser);
		if (user == null) return false;
		user.setNameUser(nameUser);
		user.setEmailUser(emailUser);
		user.setCpfUser(cpfUser);
		return true;
	}
	
	public boolean takeOutUser(int idUser){
		if(idUser < 0){
			return false;
		}	
		return data.deleteUser(IdUser);
	}
	
	public boolean insertUser(String[] dataUser, String nameUser, String emailUser, int cpfUser){
		Object[] atr = {nameUser, emailUser, cpfUser};
		if (controlObject(atr)) return false;
		User u = new User();
		Data.uRegister(u);
		return true;
	}
	
	public boolean updateUser(String[] dataUser, int idUser, String nameUser, String emailUser, int cpfUser){
		Object[] atr={};
		if(controlObject(atr) || idUser < 0) return false;
		User user = data.getUser(idUser);
		if (user == null) return false;
		user.setNameUser(nameUser);
		user.setEmailUser(emailUser);
		user.setCpfUser(cpfUser);
		return true;
	}
	
	public boolean takeOutUser(int idUser){
		if(idUser < 0){
			return false;
		}	
		return data.deleteUser(IdUser);
	}
	
	public boolean insertUser(String[] dataUser, String nameUser, String emailUser, int cpfUser){
		Object[] atr = {nameUser, emailUser, cpfUser};
		if (controlObject(atr)) return false;
		User u = new User();
		Data.uRegister(u);
		return true;
	}
	
	public boolean updateUser(String[] dataUser, int idUser, String nameUser, String emailUser, int cpfUser){
		Object[] atr={};
		if(controlObject(atr) || idExpense < 0) return false;
		Restaurant restaurant = data.getRestaurant(idExpense);
		if (restaurant == null) return false;
		restaurant.setNameRestaurant(nameRestaurant);
		restaurant.setDateExpense(dateExpense);
		restaurant.setAmountRestaurant(amountRestaurant);
		return true;
	}
	
	
	
	
	public boolean takeOutExpenses(int idExpense){
		LinkedList<Restaurant> restaurants = data.getRestaurants(idExpense);
		for (Restaurant restaurant: restaurants){
			for(User user: data.getUsers()){
				user.delete(restaurant);
			}
			for(Group group: data.getGroups()){
				group.delete(restaurant);
			}
		}
		for (Ride ride: rides){
			for(User user: data.getUsers()){
				user.delete(ride);
			}
			for(Group group: data.getGroups()){
				group.(ride);
			}
		
		}
	
	
		
	
	
	
	
	
}
