package tp1;

import java.util.List;

public class Teacher extends User {
	private String school_id;

	/**
	 * @return the student_id
	 */
	public String getSchool_id() {
		return school_id;
	}

	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(String school_id) {
		this.school_id = school_id;
	}

	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param phone_number
	 * @param number_books_allowed
	 * @param is_blacklisted
	 * @param password
	 * @param list_of_books
	 * @param school_id
	 */
	public Teacher( String name, String email, String phone_number, int number_books_allowed,
			boolean is_blacklisted, String password,  String school_id) {
		super( name, email, phone_number, number_books_allowed, is_blacklisted, password);
		this.school_id = school_id;
	}




	

}
