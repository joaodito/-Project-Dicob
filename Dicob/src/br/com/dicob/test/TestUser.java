package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import data.*;

class TestUser {
	private ControlData controlData;
	@BeforeEach
	void criarAtributo() {
		controlData = new ControlData();
	}
	
	@Test
	void testRegisterUser() {
		boolean test = controlData.registerUser("nome", "email", "cpf");
		assertTrue(test);
		assertTrue(controlData.getUsers().get(0).getNameUser().equals("nome"));
		assertTrue(controlData.getUsers().get(0).getEmailUser().equals("email"));
		assertTrue(controlData.getUsers().get(0).getCpfUser().equals("cpf"));	
	}
	
	@Test
	void testRegisterUserNull() {
		boolean test = controlData.registerUser(null,"email", "cpf");
		assertFalse(test);
		boolean test2 = controlData.registerUser("nome", null, "cpf");
		assertFalse(test2);
		boolean test3 = controlData.registerUser("nome", "email", null);
		assertFalse(test3);
	}
}	
