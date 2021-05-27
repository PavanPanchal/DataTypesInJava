package MethodOverriding;

public class ProductProtected {
	
	public void ApplePencil() {
		System.out.println("The Price of apple pencil is 6999");
	}
	private void raybanShades() {
		System.out.println("The Price of apple Rayban sunglasses is 3999");
	}
	protected void tomfordFragrance() {
		System.out.println("The Price of TomFord fragrance is 14999");
	}

}


class Snapdeal extends ProductProtected{
	
	public void ApplePencil() {
		System.out.println("The Price of apple pencil is 6599");
	}
	private void raybanShades() {
		System.out.println("The Price of apple Rayban sunglasses is 3500");
	}
	protected void tomfordFragrance() {
		System.out.println("The Price of TomFord fragrance is 13000");
	}

	
	
}
class Ebay extends ProductProtected{
		
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



class CheckPrice2{
	
	public static void main(String[] args) {
		Snapdeal s= new Snapdeal();
		Ebay e= new Ebay();
		
		
		s.ApplePencil();
		e.ApplePencil();
		
		
//		s.raybanShades();
//		e.raybanShades();
		
		s.tomfordFragrance();
		e.tomfordFragrance();

		
	}
}




