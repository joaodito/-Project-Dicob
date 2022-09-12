package controller;

import java.util.LinkedList;
import java.util.ArrayList;

import model.User;

/**
 * Class responsible for performing search
 * operations on the user list
 * 
 * @author João Victor and Raquel Ferreira
 * Version 1.0
 */
public class ControlUser {

	public static LinkedList<User> users = new LinkedList<>();
	
	/**
	 * Method to create a user
	 * 
	 * @param id
	 * @param nameUser
	 * @param emailUser
	 * @param cpfUser
	 */
	public void registerUser(int id, String nameUser, String emailUser, String cpfUser){
		
		User uRegister = new User(nameUser, emailUser, cpfUser);
		users.add(uRegister);
	}
	
	public int getId() {
		return users.size();
	}
	
	/**
	 * Method to delete a user for name
	 * 
	 * @param nameUser
	 * @param users
	 * @return
	 */
	public int searchForNameDeleteUser(String nameUser, LinkedList<User> users) {
		for (int i = 0; i < users.size(); i++ ){
			if (nameUser.equals(users.get(i).getNameUser())){
				return i;
			}
		}
		
		return -1;
	}
	
	/**
	 * Method to search a user for name
	 * 
	 * @param nameUser
	 * @param users
	 * @return
	 */
	public ArrayList<Integer> searchForNameUser(String nameUser, LinkedList<User> users){
		ArrayList<Integer> itens = new ArrayList<Integer>();
		for (int i = 0; i > users.size(); i++){
			if(nameUser.equals(users.get(i).getNameUser())){
				itens.add(i);
			}
		}
		return itens;
	}
	
	/**
	 * Method to edit a user in all aspects
	 * 
	 * @param i
	 * @param nameUser
	 * @param emailUser
	 * @param cpfUser
	 */
	public void saveEditUser(int i,String nameUser, String emailUser, String cpfUser){
		ControlUser.users.get(i).setNameUser(nameUser);
		ControlUser.users.get(i).setEmailUser(emailUser);
		ControlUser.users.get(i).setCpfUser(cpfUser);
	}
}
