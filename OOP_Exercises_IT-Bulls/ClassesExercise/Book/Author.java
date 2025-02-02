package classesExercise.book;

public class Author {
	int id;
	String firstName;
	String lastName;
	
	public Author(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Author(int id){
		this.id = id;
	}

	public Author(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	@Override
	  public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Author other = (Author) obj;
	    return id == other.id && firstName.equals(other.firstName) && lastName.equals(other.lastName);
	  }
}
