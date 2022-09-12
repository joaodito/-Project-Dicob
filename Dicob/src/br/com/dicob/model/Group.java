package model;

import java.util.LinkedList;

/**
 * Class Group stores the information of a group
 * 
 * @author João Victor and Raquel Ferreira
 * version 1.0
 *
 */
public class Group {
	
	private static int idControl;
	private int idGroup;
	private String nameGroup;
	private String categoriaGroup;
	private LinkedList <User> groups;
	
	/**
	 * Group Constructor
	 * 
	 * @param idGroup
	 * @param nameGroup
	 * @param categoriaGroup
	 */
	public Group(int idGroup, String nameGroup, String categoriaGroup){
		this.idGroup = idControl++;
		this.nameGroup = nameGroup;
		this.categoriaGroup = categoriaGroup;
		this.groups = new LinkedList <User>();
	}	
	
	public Group(){}

	public int getIdGroup() {
		return idGroup;
	}

	public String getNameGroup() {
		return nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}

	public String getCategoriaGroup() {
		return categoriaGroup;
	}

	public void setCategoriaGroup(String categoriaGroup) {
		this.categoriaGroup = categoriaGroup;
	}

	public LinkedList<User> getGroups() {
		return this.groups;
	}
	
	/**
	 * Method to create group and add users
	 * 
	 * @param users
	 */

	public void registerGroup(User users){
		this.groups.add(users);
	}
	
}
