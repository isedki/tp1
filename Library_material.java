package tp1;

public abstract class Library_material {
	public int id;
	public String title;
	public Boolean availability;
	private int max_reservation_period;
	private String genre;
	//library_section should be removed from Libray_material
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id
	 * @param title
	 * @param availability
	 * @param max_reservation_period
	 * @param genre
	 */
	public Library_material(int id, String title, Boolean availability, int max_reservation_period, String genre) {
		super();
		this.id = id;
		this.title = title;
		this.availability = availability;
		this.max_reservation_period = max_reservation_period;
		this.genre = genre;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the availability
	 */
	public Boolean getAvailability() {
		return availability;
	}
	/**
	 * @param availability the availability to set
	 */
	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}
	/**
	 * @return the max_reservation_period
	 */
	public int getMax_reservation_period() {
		return max_reservation_period;
	}
	/**
	 * @param max_reservation_period the max_reservation_period to set
	 */
	public void setMax_reservation_period(int max_reservation_period) {
		this.max_reservation_period = max_reservation_period;
	}
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	
	

}
