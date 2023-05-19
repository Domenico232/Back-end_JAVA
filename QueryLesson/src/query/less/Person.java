package query.less;

public class Person {
	int PersonID;
	String LastName ;
	String FirstName;
	String Address;
	String City;
	public Person(Integer personID, String lastName, String firstName, String address, String city) {
		super();
		PersonID = personID;
		LastName = lastName;
		FirstName = firstName;
		Address = address;
		City = city;
	}
	public Person(String lastName, String firstName, String address, String city) {
		super();
		LastName = lastName;
		FirstName = firstName;
		Address = address;
		City = city;
	}
	public Integer getPersonID() {
		return PersonID;
	}
	public void setPersonID(Integer personID) {
		PersonID = personID;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Person [PersonID=" + PersonID + ", LastName=" + LastName + ", FirstName=" + FirstName + ", Address="
				+ Address + ", City=" + City + "]";
	}
	 
}
