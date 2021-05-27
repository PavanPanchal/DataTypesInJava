package MethodOverriding;

public class SameReturnType {
	
		public void wallpaperppi() {
			System.out.println("The wallpaer is 551ppi");
		}
		public String atmorning() {
			return "Nature";
	
		}
		public int cars() {
			return 2;
	
		}
	
	}
	
	class Personalized extends SameReturnType{
		public void wallpaperppi() {
			System.out.println("The wallpaer is now 756ppi");
		}
		public String atmorning() {
			return "Cartoon";
	
		}
	//	public char cars() {
	//		return 'g';
	//
	//	}
	
	}
	
	class Test4 {
		public static void main(String[] args) {
			Personalized per=new Personalized();
			per.wallpaperppi();
			System.out.println(per.atmorning());
	//		System.out.println(per.cars());	
		}
	}
	
	
