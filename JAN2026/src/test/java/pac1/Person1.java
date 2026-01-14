package pac1;

public class Person1 {
	
	 String FirstName;
	 String LastName;
	 char Gender;
	
	public Person1(String fn, String ln, char g){
		this.FirstName = fn;
		this.LastName = ln;
		this.Gender = g;
	}
	

	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public char getGender() {
		return Gender;
	}


	public void setGender(char gender) {
		Gender = gender;
	}


	public static void main(String[] args) {
		
		Person1 obj = new Person1("Gungun","Choudhary", 'F');
		System.out.println(obj.getFirstName());

	}

}
