package tp1;

import java.util.Date;

public class Reservation {
	private String reservation_id;
	private Date borrow_date;
	private Date return_date;
	public Library_material material;
	public User user;
	/**
	 * @return the reservation_id
	 */
	public String getReservation_id() {
		return reservation_id;
	}
	/**
	 * @param reservation_id the reservation_id to set
	 */
	public void setReservation_id(String reservation_id) {
		this.reservation_id = reservation_id;
	}
	/**
	 * @return the borrow_date
	 */
	public Date getBorrow_date() {
		return borrow_date;
	}
	/**
	 * @param borrow_date the borrow_date to set
	 */
	public void setBorrow_date(Date borrow_date) {
		this.borrow_date = borrow_date;
	}
	/**
	 * @return the return_date
	 */
	public Date getReturn_date() {
		return return_date;
	}
	/**
	 * @param return_date the return_date to set
	 */
	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
	/**
	 * @param reservation_id
	 * @param borrow_date
	 * @param return_date
	 * @param material
	 * @param user
	 */
	public Reservation(String reservation_id, Date borrow_date, Date return_date, Library_material material,
			User user) {
		super();
		this.reservation_id = reservation_id;
		this.borrow_date = borrow_date;
		this.return_date = return_date;
		this.material = material;
		this.user = user;
	}

	

}
