package MethodOverriding;

public class PasswordChange {

	final void password () {
		System.out.println("Your password is 'GtadQdl' ");
	}
}

class changePass extends PasswordChange{
	final void password () {
		System.out.println("Password is changed to '&8Gh3' ");
	}
	
}

class test4{
	
	public static void main(String[] args) {
		changePass cha= new changePass();
		
		cha.password();
	}
}
