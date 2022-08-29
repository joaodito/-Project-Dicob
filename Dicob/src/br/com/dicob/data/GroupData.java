package br.com.dicob.data;

import br.com.dicob.model.User;
import java.util.List;
import java.util.ArrayList;

public class GroupData {
	
	private static List<User> users;
	
	static {
		users = new ArrayList<User>();
	}
	
	public static List<User> getUsers(){
		return users;
	}
	
}
