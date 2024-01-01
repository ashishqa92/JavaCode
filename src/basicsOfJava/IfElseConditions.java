package basicsOfJava;

public class IfElseConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 30;
		int b = 20;
		if (b>a){
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		
		// comparison operator
		// < > <= >= == !=
		
		int c = 40;
		int d = 40;
		if (c==d){
			System.out.println("c is equal to d");
		}
		else{
			System.out.println("c is not equal to d");
		}
		
		//write a logic to find the highest number
		int a1 = 400;
		int b1 = 800;
		int c1 = 800;
		
		if (a1>b1){
			if (a1>c1){
				System.out.println("a1 is the highest number");
			}
			else System.out.println("c1 is the highest number");
			}
		else if (b1>c1){
			System.out.println("b1 is the highest number");
			}
		else {
			System.out.println("c1 is the highest number");
		}
		
		// another logic
		int a2 = 400;
		int b2 = 500;
		int c2 = 300;
		
		if (a2>b2 && a2>c2){
				System.out.println("as is the highest");
			}
		else if (b2>c2){
			System.out.println("b2 is the highest");
			}
		else {
			System.out.println("c2 is the highest");
		}
		
		///////////////////////////////////////////////////////////////////////
		// dead code:
		if (true) {
			System.out.println("hi");
		} else {
			System.out.println("bye");
		}
		
		//////////////////////////////////////////////////////////////////////

		boolean t = false;
		if (t) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		  
		///////////////////////////////////////////////////////////////////////
		String browser = "firefox";

		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		} 
		else if (browser.equals("firefox")) {
			System.out.println("launch firefox");
		} 
		else if (browser.equals("safari")) {
			System.out.println("launch safari");
		} 
		else if (browser.equals("IE")) {
			System.out.println("launch IE");
		} 
		else {
			System.out.println("plz pass the right browser....");
		}

	}

}
