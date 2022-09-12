package controller;

import java.util.ArrayList;
import java.util.LinkedList;
import model.*;

/**
 * Class responsible for performing search
 * operations on the user list
 * 
 * @author João Victor and Raquel Ferreira
 * version 1.0
 */
public class ControlGroup {
	
	public static LinkedList<User> groups = new LinkedList<>();
	
	/**
	 * Method to create a group with users
	 * 
	 * @param users
	 */
	public void registerGroup(User users){
		ControlGroup.groups.add(users);
	}
	
	/**
	 * Method to delete a group for name
	 *   
	 * @param nameGroup
	 * @param categoryGroup
	 * @return 
	 */
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
	
	/**
	 * Method to delete a group for name from the group list
	 * 
	 * @param nameGroup
	 * @param groups
	 * @return
	 */
	public int searchForNameDeleteGroup(String nameGroup, LinkedList<Group> groups) {
		for (int i = 0; i < groups.size(); i++ ){
			if (nameGroup.equals(groups.get(i).getNameGroup())){
				return i;
			}
		}
		
		return -1;
	}
	
	/**
	 * Method to search a group for name
	 * 
	 * @param nameGroup
	 * @param groups
	 * @return
	 */
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
