package superKeyword;

public class LoginPage extends Page {

	int timeOut = 200;

	public LoginPage() {
		super();
		System.out.println("Hi");
	}

	public void loginInfo() {
		System.out.println("login info methods");
		super.display();// parent
		display();// child
	}

	@Override
	public void display() {
		System.out.println("LP Display");
		super.display();
	}

	public void getTimeOut() {
		System.out.println(timeOut);
		System.out.println(super.timeOut);
	}
}
