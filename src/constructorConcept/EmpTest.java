package constructorConcept;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		e1.name = "Poornima";
		e1.age = 25;
		e1.id = 100;
		e1.isPerm = true;
		e1.gender = 'f';

		Employee e2 = new Employee(10);

		Employee e3 = new Employee("Tom", 201);
		System.out.println(e3.name + " " + e3.id + " " + e3.age + " " + e3.isPerm + " " + e3.gender);

		Employee e4 = new Employee("Peter", 202, 30, 13.44, true, 'm');
		System.out.println(e4.isPerm);

	}

}
