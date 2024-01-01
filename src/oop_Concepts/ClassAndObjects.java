package oop_Concepts;

public class ClassAndObjects {

	int i = 20;// class variable

	public static void main(String[] args) {

		int i = 10;// local variable
		System.out.println(i);

		// create the object of the class: use new keyword
		ClassAndObjects obj = new ClassAndObjects(); //obj is not object, obj is reference name to object
		// once object will be created, obj is the reference variable, referring to this object
		// after creating the object, the copy of all non-static methods will be given to this particular object
		// object can't hold static(main) methods
		System.out.println(obj.i);

		// class - template / blueprint / category for the objects
		// will have class properties which will be used to create the objects
		// objetcs - physical entity should be created from the class category/template

	}

}
