package br.com.dicob.model;

import java.util.*;
import java.util.LinkedList;
import java.util.List;
import br.com.dicob.model.*;

public class Data{

	private LinkedList<Group> groups = new LinkedList<Group>();
	private LinkedList<User> users = new LinkedList<User>();
	private LinkedList<Expense> expenses = new LinkedList<Expense>();
	
	public void fillWithSomeData(){
		for (int i=0;i<10;i++){
			users.add(new User ("Usário: "+i,"Email:"+i+"@emailusuario.com","CPF:"+(i+1)*123122112));
			groups.add(new Group("Grupo: "+i, "Categoria: "+i));
			expenses.add(new Expense("Despesa: "+i,"Valor da despesa"+(i+1)*123));
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
	
	public void setExpenses(LinkedList<Expense> expenses) {
		this.expenses = expenses;
	}
	
	public LinkedList<Expense> getExpenses() {
		return expenses;
	}
		
	public void uRegister(User user){
		users.add(user);
	}
	public User getUser (int idUser) {
		for(User user: users) {
			if(user.getIdUser() == idUser) {
				return user;
			}
		}
		return null;
	}
	
	public boolean deleteUser(int idUser) {
		for(int i = 0; i < users.size(); i++) {
			if(users.get(i).getIdUser() == idUser) {
				users.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void deleteGroup(int idUsuario, int idAmigo) {
		User user = getUser(idUser);
		LinkedList<group> groups = user.getGroups();
		for(int i = 0; i < groups.size(); i++) {
			if(groups.get(i).getIdGroup() == idGroup) {
				groups.remove(i);
			}
		}
		user.setGroups(groups);
	}
	
	public void gRegister(Group group) {
		groups.add(group);
	}
	
	public Group getGroup(int idGroup) {
		for(int i = 0; i < groups.size(); i++) {
			if(groups.get(i).getIdGroup() == idGroup) {
				return groups.get(i);
			}
		}
		return null;
	}

	public boolean deleteGroup(int idGroup) {
		for(int i = 0; i < groups.size(); i++) {
			if(groups.get(i).getIdGroup() == idGroup) {
				groups.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void eRegister(Expense expense) {
		expenses.add(expense);
	}

	public Expense getDespesa(int id) {
		for(Expense expense: getExpenses()) {
			if(expense.getIdAmount() == idExpense) {
				return expense;
			}
		}
		return null;
	}
	
	public LinkedList<Expense> getExpenses(int idExpense) {
		LinkedList<Expense> listExpense = new LinkedList<Expense>();
		for(Expense expense: getExpenses()) {
			if(expense.getIdAmount() == idExpenses) {
				listExpense.add(expense);
			}
		}
		return listExpense;
	}

}
