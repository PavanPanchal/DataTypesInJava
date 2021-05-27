package MethodOverriding;

public class CustomPC {
	public void ram() {
		System.out.println("Your ram is 8gb");
	}
	public void HDD() {
		System.out.println("Your HDD is 1TB");

	}
	private void processor() {
		System.out.println("Your processot is i7 11th gen");

	}

}

class personal extends CustomPC{
	public void ram() {
		System.out.println("Your ram is now 16 gb");
	}
	public void HDD() {
		System.out.println("Your HDD is 2 TB");

	}	
}

class Test {
	public static void main(String[] args) {
		personal p=new personal();
		p.ram();
		p.HDD();
		
	}
}