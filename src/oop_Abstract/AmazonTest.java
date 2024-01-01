package oop_Abstract;

public class AmazonTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.header();
		lp.doLogin("admin", "admin");

		HomePage hp = new HomePage();
		hp.title();
		hp.url();
		hp.header();
		hp.logout();
		hp.logo();

		// top casting:
		// child class object can be referred by parent abs.. class ref variable
		Page p = new LoginPage();
		p.title();
		p.url();
		p.header();
		
		Page p1 = new HomePage();
		p1.title();
		p1.url();
		p1.header();
		p1.logo();

		// down casting: CT Not allowed
		// LoginPage l1 = new Page();

	}

}
