package br.com.dicob.model;

import java.util.LinkedList;

public class Group {
	
	private int idGroup;
	private String nameGroup;
	private String categoriaGroup;
	private LinkedList <User> groups;
	
	public Group(int idGroup, String nameGroup, String categoriaGroup){
		this.idGroup = idGroup;
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

	public void registerGroup(User users){
		this.groups.add(users);
	}
	
}
