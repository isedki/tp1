package tp1;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class User {

	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param phone_number
	 * @param number_books_allowed
	 * @param is_blacklisted
	 * @param password
	 * @param list_of_books
	 */
	

	
	public User(String name, String email, String phone_number, int number_books_allowed,
			boolean is_blacklisted, String password) {
		super();
		//Implementation of unique student id 
		//the id is generated automatically and is unique by definition
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.email = email;
		this.phone_number = phone_number;
		this.number_books_allowed = number_books_allowed;
		this.is_blacklisted = is_blacklisted;
		this.password = password;
		this.list_of_books = new ArrayList<Library_material>();
		
	}

	@Override
	public String toString() {
		return " [name=" + name + ", email=" + email + ", phone_number=" + phone_number
				+ "]";
	}

	/**
	 * @return the list_of_books
	 */
	public List<Library_material> getList_of_books() {
		return list_of_books;
	}

	/**
	 * @param list_of_books the list_of_books to set
	 */
	public void setList_of_books(List<Library_material> list_of_books) {
		this.list_of_books = list_of_books;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	private String id;
	private String name;
	private String email;
	private String phone_number;
	private int number_books_allowed;
	private boolean is_blacklisted;
	private String password;
	private List<Library_material> list_of_books;

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		//the password is not set unless it is longer than 8 characters
		if(password.length() >= 8) {
		this.password = password;
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the number_books_allowed
	 */
	public int getNumber_books_allowed() {
		return number_books_allowed;
	}

	/**
	 * @param number_books_allowed the number_books_allowed to set
	 */
	public void setNumber_books_allowed(int number_books_allowed) {
		this.number_books_allowed = number_books_allowed;
	}

	/**
	 * @return the is_blacklisted
	 */
	public boolean isIs_blacklisted() {
		return is_blacklisted;
	}

	/**
	 * @param is_blacklisted the is_blacklisted to set
	 */
	public void setIs_blacklisted(boolean is_blacklisted) {
		this.is_blacklisted = is_blacklisted;
	}

	/**
	 * @return the student_id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(String id) {
		this.id = id;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone_number
	 */
	public String getPhone_number() {
		return phone_number;
	}

	/**
	 * @param phone_number the phone_number to set
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	public void editProfile(String name,String phone_number) {
		setName(name);
		setPhone_number(phone_number);
	}
	
	public void changePassword(String password) {
		setPassword(password);
	}
	
	//ad a book to the section
	public void borrowNewMaterial(Library_material mat) {
		//the user can borrow another books if he has booked less than the number he is entitled to
		
		if (list_of_books.size()< getNumber_books_allowed() 
				//the material should be available
				|| mat.availability 
				//the book is not already contained in the user list of borrowed books
				|| !list_of_books.contains(mat)) {
			//if the user is blacklisted he can not borrow any material from the library
			if(!is_blacklisted) {
			list_of_books.add(mat);
			}
		}
		
	}
	
	//remove a book from the section
	public void returnMaterial(Library_material mat) {
		//removing the boof from the list of booked material
		if (list_of_books.contains(mat)) {
			list_of_books.remove(mat);
		}
		//the material is available
		mat.setAvailability(true);
	}

}
