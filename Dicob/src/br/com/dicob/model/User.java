package model;

import java.util.LinkedList;

/**
 * Class User stores information of a user
 * 
 * @author João Victor and Raquel Ferreira
 * version 1.0
 */

public class User {
	
	private static int idControl;
	private int idUser;
	private String nameUser;
	private String emailUser;
	private String cpfUser;
	
	/** 
	 * User Constructor
	 * 
	 * @param idUser
	 * @param nameUser
	 * @param emailUser
	 * @param cpfUser
	 */

	public User(String nameUser, String emailUser, String cpfUser){
		this.idUser = idControl++;
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

	public String getCpfUser() {
		return cpfUser;
	}

	public void setCpfUser(String cpfUser) {
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
