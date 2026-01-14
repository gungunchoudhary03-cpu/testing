package pac2;

public class person1 {
	
	private String FirstName;
	private String LastName;
	private char Gender;
	
	public person1 (String fn, String ln, char g){
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
		// TODO Auto-generated method stub
		person1 obj = new person1("Gungun","Choudhary", 'F');
		System.out.println(obj.getFirstName());

	}

}
