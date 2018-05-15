package S1;

import com.google.gson.annotations.SerializedName;

public class S1Users {
	
	private int id;
	@SerializedName("first-name")
	private String firstName;
	
	@SerializedName("last-name")
	private String lastName;
	
	@SerializedName("email-address")
	private String emailAddress;
	
	private S1Tags tags;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public S1Tags getTags() {
		return tags;
	}

	public void setTags(S1Tags tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailAddress="
				+ emailAddress + ", tags=" + tags + "]";
	}
	
	
}
