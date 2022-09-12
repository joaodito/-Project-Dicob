package model;

import java.util.LinkedList;

/**
 * Class Data is a database to store the information and the lists 
 * of the classes
 * 
 * @author João Victor and Raquel Ferreira
 * version 1.0
 */
public class Data{

	private LinkedList<Group> groups = new LinkedList<Group>();
	private LinkedList<User> users = new LinkedList<User>();
	private LinkedList<Restaurant> restaurants = new LinkedList<Restaurant>();
	private LinkedList<Ride> rides = new LinkedList<Ride>();
	
	/**
	 * Method to insert some random data in the lists
	 */
	public void fillWithSomeData(){
		for (int i=0;i<10;i++){
			users.add(new User ("Usário: "+i,"Email:"+i+"@emailusuario.com","CPF:"+(i+1)*123122112));
			groups.add(new Group(i, "Grupo: "+i, "Categoria: "+i));
			restaurants.add(new Restaurant(+i,"Despesa: "+i, 22/02/2022,"Pedido:",+(i+1)*123));
			rides.add(new Ride(+i, "Despesa:", +i*1, +i*2, +(i+1)*2,+(i+1)*123, i));
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
	
	public void setRides(LinkedList<Ride> rides) {
		this.rides = rides;
	}
	
	public LinkedList<Ride> getRides() {
		return rides;
	}
	
	/**
	 * Method to create and add a user in a list
	 * 
	 * @param user
	 */
	public void uRegister(User user){
		users.add(user);
	}
	
	/**
	 * Method to check if the user id is equal to 
	 * the one given as parameter
	 * 
	 * @param idUser
	 * @return user or null in case the user cannot be found
	 */
	public User getUser (int idUser) {
		for(User user: users) {
			if(user.getIdUser() == idUser) {
				return user;
			}
		}
		return null;
	}
	
	/**
	 * Method to delete a user when a user with the same id as the 
	 * parameter is found
	 * 
	 * @param idUser
	 * @return true if the user with the id given is deleted and false otherwise
	 */
	
	public boolean deleteUser(int idUser) {
		for(int i = 0; i < users.size(); i++) {
			if(users.get(i).getIdUser() == idUser) {
				users.remove(i);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Method to delete a group 
	 * 
	 * @param idUser
	 * @param idGroup
	 */
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
	
	/**
	 * Method to create and add a group
	 * 
	 * @param group
	 */
	public void gRegister(Group group) {
		groups.add(group);
	}
	
	/**
	 * Method to check if the group id is equal to 
	 * the one given as parameter
	 * 
	 * @param idGroup
	 * @return group or null in case the group cannot be found
	 */
	public Group getGroup(int idGroup) {
		for(int i = 0; i < groups.size(); i++) {
			if(groups.get(i).getIdGroup() == idGroup) {
				return groups.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Method to delete a group when a group with the same id as the 
	 * parameter is found
	 * 
	 * @param idGroup
	 * @return true if the group with the id given is deleted and false otherwise
	 */
	public boolean deleteGroup(int idGroup) {
		for(int i = 0; i < groups.size(); i++) {
			if(groups.get(i).getIdGroup() == idGroup) {
				groups.remove(i);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Method to create and add a restaurant expense
	 * 
	 * @param restaurant
	 */
	public void rRegister(Restaurant restaurant) {
		restaurants.add(restaurant);
	}
	
	/**
	 * Method to check if the restaurant expense id is equal to 
	 * the one given as parameter
	 * 
	 * @param idExpense
	 * @return restaurant or null in case the restaurant cannot be found
	 */
	public Restaurant getRestaurant(int idExpense) {
		for(Restaurant restaurant: getRestaurants()) {
			if(restaurant.getAmountRestaurant() == idExpense) {
				return restaurant;
			}
		}
		return null;
	}
	
	/**
	 * Method to receive the id referring to the amount and search all 
	 * related restaurant expenses from this amount
	 * 
	 * @param idExpense
	 * @return list of related restaurant expenses
	 */
	public LinkedList<Restaurant> getRestaurants(int idExpense) {
		LinkedList<Restaurant> listRestaurant = new LinkedList<Restaurant>();
		for(Restaurant restaurant: getRestaurants()) {
			if(restaurant.getAmountRestaurant() == idExpense) {
				listRestaurant.add(restaurant);
			}
		}
		return listRestaurant;
	}
	
	/**
	 * Method to create and add a ride expense
	 * 
	 * @param ride
	 */
	public void dRegister(Ride ride) {
		rides.add(ride);
	}
	
	/**
	 * Method to check if the ride expense id is equal to 
	 * the one given as parameter
	 * 
	 * @param idExpense
	 * @return ride or null in case the ride cannot be found
	 */
	public Ride getRide(int idExpense) {
		for(Ride ride: getRides()) {
			if(ride.getAmountRide() == idExpense) {
				return ride;
			}
		}
		return null;
	}
	
	/**
	 * Method to receive the id referring to the amount and search all 
	 * related ride expenses from this amount
	 * 
	 * @param idExpense
	 * @return list of related ride expenses
	 */
	public LinkedList<Ride> getRides(int idExpense) {
		LinkedList<Ride> listRide = new LinkedList<Ride>();
		for(Ride ride: getRides()) {
			if(ride.getAmountRide() == idExpense) {
				listRide.add(ride);
			}
		}
		return listRide;
	}

}
