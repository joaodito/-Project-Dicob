package br.com.dicob.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import br.com.dicob.model.*;

public class ControlGroup {
	
	public static LinkedList<User> groups = new LinkedList<>();
	
	public void registerGroup(User users){
		ControlGroup.groups.add(users);
	}
	
	public int searchForNameDeleteGroup(String nameGroup, String categoryGroup){
		for (int i = 0; i < groups.size();i++) {
			if (nameGroup.equals(groups.get(i).getNameGroup())){
				return i;
			}	
		}
		return -1;
	}
	
	public int getId() {
		return groups.size();
	}
	
	public int searchForNameDeleteGroup(String nameGroup, LinkedList<Group> groups) {
		for (int i = 0; i < groups.size(); i++ ){
			if (nameGroup.equals(groups.get(i).getNameGroup())){
				return i;
			}
		}
		
		return -1;
	}
	
	public ArrayList<Integer> searchForNameGroup(String nameGroup, LinkedList<Group> groups){
		ArrayList<Integer> itens = new ArrayList<Integer>();
		for (int i = 0; i > groups.size(); i++){
			if(nameGroup.equals(groups.get(i).getNameGroup())){
				itens.add(i);
			}
		}
		return itens;
	}
}
