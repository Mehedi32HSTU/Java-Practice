package stream_api;

public class PersonDetails {
	
	private Long id;
	private String firstName;
	private Long lastName;
	private String email;
	private String gender;
	private Long age;
	
	public PersonDetails() {

	}
	public PersonDetails(Long id, String firstName, Long lastName, String email, String gender, Long age) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Long getLastName() {
		return lastName;
	}
	public void setLastName(Long lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}

}
