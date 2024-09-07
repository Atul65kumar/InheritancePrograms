package Inheritance;

class Snapdeal{
	
	static void loginwithmobilenum() {
		System.out.println("Mobile no");
	}
	
	void registration() {
		System.out.println("Registered mobile");
	}
}

public class Single_Level_Inheritance extends Snapdeal {
	
	static void loginwithEmail() {
		System.out.println("Emialid");
	}
	
	void logout() {
		System.out.println("logout");
	}
	
	public static void main(String[] args) {
		loginwithEmail();
		loginwithmobilenum();
		Single_Level_Inheritance i1 = new Single_Level_Inheritance();
		i1.registration();
		i1.logout();
		
	}

}
