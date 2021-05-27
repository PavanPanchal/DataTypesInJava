package MethodOverriding;

public class DefaultWallpaper {

	public void wallpaperppi() {
		System.out.println("The wallpaer is 551ppi");
	}
	public void atmorning() {
		System.out.println("Tech");

	}
	public void atnoon() {
		System.out.println("Cartoon");

	}
	public void atnight() {
		System.out.println("Fashion");

	}

	

}
		
	class Personalize extends DefaultWallpaper{
		public void wallpaperppi() {
			System.out.println("The wallpaer is now 756ppi");
		}
		public void atmorning() {
			System.out.println("Random");

		}
		public void atnoon() {
			System.out.println("tech");

		}
		public void atnight() {
			System.out.println("Beauty");

		}
		
		}
		
		class Test3 {
			public static void main(String[] args) {
				Personalize per=new Personalize();
				per.wallpaperppi();
				per.atmorning();
				per.atnoon();
				per.atnight();
			}
		}
