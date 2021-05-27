package MethodOverriding;

 class Changes {

	public void databaseChanges() {
		System.out.println("Only Pavan updates the database");
	}
	final void build() {
		System.out.println("Version 2.0.3 is ready");
	}
}

class teams extends Changes{
	
	public void databaseChanges() {
		System.out.println("Emergency Changes made by Atul in the database");
	}
//	final void build() {
//		System.out.println("Version 2.0.3 is ready");
//	}
//	
}

public class CollegeProj{
	
	public static void main(String[] args  ) {
		teams tea= new teams();
		tea.databaseChanges();
//		tea.build();
	}
	
	
}

