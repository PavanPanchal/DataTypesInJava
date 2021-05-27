package MethodOverriding;

public class ProductDefault {
	public void ApplePencil() {
		System.out.println("The Price of apple pencil is 6999");
	}
	private void raybanShades() {
		System.out.println("The Price of apple Rayban sunglasses is 3999");
	}
	protected void tomfordFragrance() {
		System.out.println("The Price of TomFord fragrance is 14999");
	}
	void dettolSanitizer() {
		System.out.println("The Price of Dettol hand sanitizer is 299");
	}

}


class Alibaba extends ProductDefault{
	
	public void ApplePencil() {
		System.out.println("The Price of apple pencil is 6599");
	}
	private void raybanShades() {
		System.out.println("The Price of apple Rayban sunglasses is 3500");
	}
	protected void tomfordFragrance() {
		System.out.println("The Price of TomFord fragrance is 13000");
	}
	void dettolSanitizer() {
		System.out.println("The Price of Dettol hand sanitizer is 250");
	}

	
	
}
class PaytmMall extends ProductProtected{
		
		public void ApplePencil() {
			System.out.println("The Price of apple pencil is 8999");
		}
		private void raybanShades() {
			System.out.println("The Price of apple Rayban sunglasses is 4900");
		}
		protected void tomfordFragrance() {
			System.out.println("The Price of TomFord fragrance is 16000");
		}
		void dettolSanitizer() {
			System.out.println("The Price of Dettol hand sanitizer is 350");
		}

	}



class CheckPrice3{
	
	public static void main(String[] args) {
		Alibaba al= new Alibaba();
		PaytmMall pa= new PaytmMall ();
		
		
		al.ApplePencil();
		pa.ApplePencil();
		
		
//		al.raybanShades();
//		pa.raybanShades();
		
		al.tomfordFragrance();
		pa.tomfordFragrance();
		
		al.dettolSanitizer();
		pa.dettolSanitizer();

		
	}
}