package constructorConcept;

public class TestRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserRegistrationPage reg = new UserRegistrationPage("Ashish", "Kumar", "test@gmail.com", 9876543210L, "Password1", 
				"Password1");
			
		System.out.println("First Name: " + reg.getFirstName());
		System.out.println("Last name: "+ reg.getLastName());
		System.out.println("Email: "+ reg.getEmail());
		System.out.println("Telephone: "+ reg.getTelephone());
		System.out.println("Password: "+ reg.getPassword());
		System.out.println("Confirm Password: "+ reg.getConfirmPassword());
		
		reg.setTelephone(9874561230L);
		reg.setPassword("UpdatedPassword1");
		reg.setConfirmPassword("UpdatedPassword1");
		System.out.println("--------Updated Phone Number & Password -----------");
		System.out.println("Updated Telephone: "+ reg.getTelephone());
		System.out.println("Updated Password: "+ reg.getPassword());
		System.out.println("Updated Confirm Password: "+ reg.getConfirmPassword());
		

	}

}
