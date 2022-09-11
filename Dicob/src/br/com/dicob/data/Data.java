package br.com.dicob.data;

import java.util.*;
import java.util.LinkedList;
import java.util.List;
import br.com.dicob.model.*;

public class Data{

	private LinkedList<Group> groups = new LinkedList<Group>();
	private static LinkedList<User> users = new LinkedList<User>();
	private LinkedList<Restaurant> restaurants = new LinkedList<Restaurant>();
	
	public void fillWithSomeData(){
		for (int i=0;i<10;i++){
			users.add(new User ("Usário: "+i,"Email:"+i+"@emailusuario.com","CPF:"+(i+1)*123122112));
			groups.add(new Group("Grupo: "+i, "Categoria: "+i));
			restaurants.add(new Restaurant("Restaurante: "+i,"Data do restaurante: 22/02/2022","Valor da restaurante"+(i+1)*123));
			restaurants.add(new Ride("Despesa: "+i,"Quilometros:"+i*1,"Performance carro km/l"+i*2,"Valor do combustível"+(i+1)*2,"Valor da carona"+(i+1)*123));
		}
	}
	
	
	public void setGroups(LinkedList<Group> groups) {
		this.groups = groups;
	}
	
	public LinkedList<Group> getGroups() {
		return groups;
	}
	
	public void setUsers(LinkedList<User> users) {
		this.users = users;
	}
	
	public LinkedList<User> getUsers() {
		return users;
	}
	
	public void setRestaurants(LinkedList<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}
	
	public LinkedList<Restaurant> getRestaurants() {
		return restaurants;
	}
		
	public static void uRegister(User user){
		users.add(user);
	}
	public User getUser (int idUser) {
		for(User user: users) {
			if(user.getIdUser() == idUser) {
				return user;
			}
		}
		return null;
	}
	
	public boolean deleteUser(int idUser) {
		for(int i = 0; i < users.size(); i++) {
			if(users.get(i).getIdUser() == idUser) {
				users.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void deleteGroup(int idUser, int idGroup) {
		User user = getUser(idUser);
		LinkedList<Group> groups = user.getGroups();
		for(int i = 0; i < groups.size(); i++) {
			if(groups.get(i).getIdGroup() == idGroup) {
				groups.remove(i);
			}
		}
		user.setGroups(groups);
	}
	
	public void gRegister(Group group) {
		groups.add(group);
	}
	
	public Group getGroup(int idGroup) {
		for(int i = 0; i < groups.size(); i++) {
			if(groups.get(i).getIdGroup() == idGroup) {
				return groups.get(i);
			}
		}
		return null;
	}

	public boolean deleteGroup(int idGroup) {
		for(int i = 0; i < groups.size(); i++) {
			if(groups.get(i).getIdGroup() == idGroup) {
				groups.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void rRegister(Restaurant restaurant) {
		restaurants.add(restaurant);
	}

	public Restaurant getRestaurant(int idExpense) {
		for(Restaurant restaurant: getRestaurants()) {
			if(restaurant.getAmountRestaurant() == idExpense) {
				return restaurant;
			}
		}
		return null;
	}
	
	public LinkedList<Restaurant> getRestaurants(int idExpense) {
		LinkedList<Restaurant> listRestaurant = new LinkedList<Restaurant>();
		for(Restaurant restaurant: getRestaurants()) {
			if(restaurant.getAmountRestaurant() == idExpense) {
				listRestaurant.add(restaurant);
			}
		}
		return listRestaurant;
	}

}
