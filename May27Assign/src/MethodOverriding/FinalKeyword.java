package MethodOverriding;

public class FinalKeyword {
	
	final void newpassword () {
		System.out.println("Your password is 'GtadQdl' ");
	}
}

class changePassword extends FinalKeyword{
	final void newpassword () {
		System.out.println("Password is changed to '&8Gh3' ");
	}
	
}

class test6{
	
	public static void main(String[] args) {
		changePassword chaa= new changePassword();
		
		chaa.newpassword();
	}
}
