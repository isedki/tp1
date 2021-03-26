package tp1;

import java.util.List;

public class Student extends User {
	private String student_id;

	/**
	 * @return the student_id
	 */
	public String getStudent_id() {
		return student_id;
	}

	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
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
	 * @param student_id
	 */
	public Student(String name, String email, String phone_number, int number_books_allowed,
			boolean is_blacklisted, String password,  String student_id) {
		super( name, email, phone_number, number_books_allowed, is_blacklisted, password);
		this.student_id = student_id;
	}


}
