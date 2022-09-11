package br.com.dicob.model;

import java.util.LinkedList;

public class User {

	private int idUser;
	private String nameUser;
	private String emailUser;
	private int cpfUser;

	public User(int idUser, String nameUser, String emailUser, int cpfUser){
		this.idUser = idUser;
		this.nameUser = nameUser;
		this.emailUser = emailUser;
		this.cpfUser = cpfUser;
	}
	
	public int getIdUser() {
		return idUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public int getCpfUser() {
		return cpfUser;
	}

	public void setCpfUser(int cpfUser) {
		this.cpfUser = cpfUser;
	}

	public String toString() {
		return "User id=" + idUser + ", nameUser=" + nameUser + ", emailUser=" + emailUser + ", cpfUser=" + cpfUser + "]";
	}

	public Object getNameGroup() {
		return null;
	}

	public LinkedList<Group> getGroups() {
		return null;
	}

	public void setGroups(LinkedList<Group> groups) {
	}

}
