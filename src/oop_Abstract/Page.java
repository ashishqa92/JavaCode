package oop_Abstract;

//abstract class object can not be created
//but abstract class constructor can be created
//it will be called when we create the object of child class
//0% abstraction -> no abs... methods
//100% abstraction --> only abs... methods
//0-100% partial abstraction --> abs... + non abs... methods

public abstract class Page {

	public Page() {
		System.out.println("PAGE -- default const...");
	}

	public Page(int t) {
		System.out.println("PAGE -- one param const... " + t);
	}

	public abstract void title();

	public abstract void url();

	public void header() {
		System.out.println("Page header");
	}

	public final void logo() {
		System.out.println("Page -- logo");
	}

}
