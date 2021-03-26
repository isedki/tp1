package tp1;


import java.util.List;

public class Administrator extends User{
	
	private String staff_id;
	private List<User> blacklisted;
	private List<User> registred;
	


	
	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param phone_number
	 * @param number_books_allowed
	 * @param is_blacklisted
	 * @param password
	 * @param staff_id
	 * @param blacklisted
	 * @param registred
	 */
	public Administrator(int id, String name, String email, String phone_number, int number_books_allowed,
			boolean is_blacklisted, String password, String staff_id, List<User> blacklisted, List<User> registred) {
		super(name, email, phone_number, number_books_allowed, is_blacklisted, password);
		this.staff_id = staff_id;
		this.blacklisted = blacklisted;
		this.registred = registred;
	}

	public void addBlacklistUser(User user) {
		//adding a user to the list of blacklisted users
		user.setIs_blacklisted(true);
		blacklisted.add(user);
	}
	
	public void removeBlacklistUser(User user) {
		user.setIs_blacklisted(false);
		//removing a user from the list of blacklisted
		if (blacklisted.contains(user)){
			blacklisted.remove(user);
		}
	}

	/**
	 * @return the staff_id
	 */
	public String getStaff_id() {
		return staff_id;
	}

	/**
	 * @param staff_id the staff_id to set
	 */
	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}

	/**
	 * @return the blacklisted
	 */
	public List getBlacklisted() {
		return blacklisted;
	}

	/**
	 * @param blacklisted the blacklisted to set
	 */
	public void setBlacklisted(List blacklisted) {
		this.blacklisted = blacklisted;
	}
	
	public void acceptRegistration(User user) {
		registred.add(user);
	}
	
	public void declineRegistration(User user) {
		if (registred.contains(user)) {
			registred.remove(user);
		}
	}

}
