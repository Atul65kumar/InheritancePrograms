package Inheritance;

public class Flipkart_Google extends Google_Flipkart
{

	void filpme() {
		System.out.println("Flipkart Method");
	}
	
public static void main(String[] args) {
	Flipkart_Google f1 = new Flipkart_Google();
	f1.google();
	f1.filpme();
}

}
