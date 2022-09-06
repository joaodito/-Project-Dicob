package br.com.dicob.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import model.Group;
import model.User;

public class ControlGroup {
	//Create the list of users
	private List<User> users;
	
	//CRUD of Group using LinkedList
	public ControlGroup() {
		Users = new LinkedList<User>();
	}
	
	//Register a Group (CREATE)
	public void registerGroup(int idGroup, String nameGroup, String categoriaGroup) {
		
		Group uRegister = new Group (groups.size(), idGroup, nameGroup, categoriaGroup);
		groups.add(uRegister);
	
	}
	
	public int getIdGroup() {
		return groups.size();
	}
	
	//Delete a Group for name (DELETE)
	public int searchForNameDeleteGroup(String nameGroup, LinkedList<Group> groups) {
		for (int i = 0; i < groups.size(); i++ ) {
			if (nameGroup.equals(groups.get(i).getNameGroup())) {
				return i;
			}
		}
		return -1;
	}
	
	//Search a Group for name (READ) 
	public ArrayList<Integer> searchForNameGroup(String nameGroup, LinkedList<Group> groups) {
		ArrayList<Integer> itens = new ArrayList<Integer>();
		for (int i = 0; i < groups.size(); i++ ) {
			if(nameGroup.equals(groups.get(i).getNameGroup())) {
				itens.add(i);
			}
		}
		return itens;
	}
	
	//Edit a Group in all aspects (UPDATE)
	public void saveEditGroup(int i, String nameGroup, String categoriaGroup, int idGroup) {
		ControlGroup.groups.get(i).setNameGroup(nameGroup);
		ControlGroup.groups.get(i).setCategoriaGroup(categoriaGroup);
		ControlGroup.groups.get(i).setIdGroup(idGroup);
	}
}
