package MethodOverriding;

public class ProductPrivate {
	
	
	public void ApplePencil() {
		System.out.println("The Price of apple pencil is 6999");
	}
	private void raybanShades() {
		System.out.println("The Price of apple Rayban sunglasses is 3999");
	}
}

class Amazon extends ProductPrivate{
	
	public void ApplePencil() {
		System.out.println("The Price of apple pencil is 6599");
	}
	private void raybanShades() {
		System.out.println("The Price of apple Rayban sunglasses is 3500");
	}
	
}
class Chroma extends ProductPrivate{
		
		public void ApplePencil() {
			System.out.println("The Price of apple pencil is 8999");
		}
		private void raybanShades() {
			System.out.println("The Price of apple Rayban sunglasses is 4900");
		}
	}




class CheckPrice1{
	
	public static void main(String[] args) {
		Amazon a1= new Amazon();
		Chroma c1= new Chroma();
		
		
		a1.ApplePencil();
		c1.ApplePencil();
		
		
//		ap1.raybanShades();
//		c1.raybanShades();

		
	}
}


