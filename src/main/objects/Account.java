public class Account {
	Account() {

	}

	String Firstname;
	String Lastname;
	String Email;
	String Password;

	Account(String Firstname, String Lastname, String Email, String Password) {
		this.Firstname = Firstname;
		this.Lastname = Lastname;
		this.Email = Email;
		this.Password = Password;

	}

	public String getFirstName() {
		return Firstname;
	}

	public String getLastName() {
		return Lastname;
	}

	public String Email() {
		return Email;
	}

	public String Password() {
		return Password;
	}

}