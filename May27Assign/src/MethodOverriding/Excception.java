package MethodOverriding;

public class Excception {


		final void passwordis () {
			System.out.println("Your password is 'GtadQdl' ");
		}
	}

	class changedPass extends Excception{
		final void passwordis () {
			System.out.println("Password is changed to '&8Gh3' ");
		}
		
	}

	class test7{
		
		public static void main(String[] args) {
			changedPass cha= new changedPass();
			
			cha.passwordis();
		}
	}


