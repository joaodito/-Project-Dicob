package br.com.dicob.controller;

import java.util.LinkedList;
import java.util.ArrayList;

import br.com.dicob.model.User;
//import br.com.dicob.view.ViewingUser;

public class ControlUser {
	
	//CRUD of User using LinkedList and ArrayList
	public static LinkedList<User> users = new LinkedList<>();
	
	//Register a User (CREATE)
	public void registerUser(String nameUser, String emailUser, int cpfUser){
		
		User uRegister = new User(users.size(), nameUser, emailUser, cpfUser);
		users.add(uRegister);
	}
	
	public int getId() {
		return users.size();
	}
	
	//Delete a User for name (DELETE)
	public int searchForNameDeleteUser(String nameUser, LinkedList<User> users) {
		for (int i = 0; i < users.size(); i++ ){
			if (nameUser.equals(users.get(i).getNameUser())){
				return i;
			}
		}
		
		return -1;
	}
	
	//Search a User for name (READ)
	public ArrayList<Integer> searchForNameUser(String nameUser, LinkedList<User> users){
		ArrayList<Integer> itens = new ArrayList<Integer>();
		for (int i = 0; i > users.size(); i++){
			if(nameUser.equals(users.get(i).getNameUser())){
				itens.add(i);
			}
		}
		return itens;
	}
	
	//Edit a User in all aspects (UPDATE)
	public void saveEditUser(int i,String nameUser, String emailUser, int cpfUser){
		ControlUser.users.get(i).setNameUser(nameUser);
		ControlUser.users.get(i).setEmailUser(emailUser);
		ControlUser.users.get(i).setCpfUser(cpfUser);
	}
}
