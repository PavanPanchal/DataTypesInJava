package MethodOverriding;


public class EmailID {
	public void mail() {
		System.out.println("Your mail ID is : pavan@gmail.com");
	}
	

}

class Compony extends EmailID{
	public void mail() {
		System.out.println("Your mail ID is : pavan@cg.com");
	}

}

class Test1 {
	public static void main(String[] args) {
		Compony co=new Compony();
		co.mail();
	}
}