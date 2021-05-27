package MethodOverriding;

public class StaticKeyword {
	
	public static void sum(int a, int b)  {
	int c=a+b;  
	System.out.println("The sum is: "+c);   
	}   

}

class StaticErr extends StaticKeyword {
	
	public static void sum(int a, int b)  {
		int c=a+a+b+b;
		System.out.println("The sum is: "+c);   
	
}
	
}


	class test5{
		public static void  main(String[] args) {
			StaticErr stat= new StaticErr();
			stat.sum(5, 6);
			
		}
	}
		
		
		
	
	