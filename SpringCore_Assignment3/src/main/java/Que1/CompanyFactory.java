package Que1;

public class CompanyFactory {
	
	public Person ShowTypeOfPerson(String name) {
		name.toLowerCase();
		if(name==null || name.isEmpty()) 
			return null;
		switch (name) {
		case "user":
			return new User();
		
		case "admin":
			return new Admin();
		
		case "client":
			return new Client();
		default:
			throw new IllegalArgumentException("Unknown person"+ name);
		
	}
	}

}
