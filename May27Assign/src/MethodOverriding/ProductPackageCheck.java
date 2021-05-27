package MethodOverriding;

class shopA extends Product{
	public void ApplePencil() {
		System.out.println("The Price of apple pencil is 8999");
	}
	private void raybanShades() {
		System.out.println("The Price of apple Rayban sunglasses is 4900");
	}
	protected void tomfordFragrance() {
		System.out.println("The Price of TomFord fragrance is 16000");
	}

	
}

class shopB extends Product{
	
	public void ApplePencil() {
		System.out.println("The Price of apple pencil is 7999");
	}
	private void raybanShades() {
		System.out.println("The Price of apple Rayban sunglasses is 5900");
	}
	protected void tomfordFragrance() {
		System.out.println("The Price of TomFord fragrance is 18000");
	}

	
}

public class ProductPackageCheck {
	public static void main(String[] args) {
		shopA sh= new shopA();
		shopB sh1= new shopB();
		
		
		sh.ApplePencil();
		sh1.ApplePencil();
		
//		sh.raybanShades();
//		sh1.raybanShades();
		
		sh.tomfordFragrance();
		sh1.tomfordFragrance();
		
		
	}
}
	
	
