package tp1;

import java.util.Date;

public class Periodical extends Library_material {
	
	private Date issue_date;

	/**
	 * @return the issue_date
	 */
	public Date getIssue_date() {
		return issue_date;
	}

	/**
	 * @param issue_date the issue_date to set
	 */
	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}

	public Periodical( String title, Boolean availability, int max_reservation_period, String genre, Date issue_date) {
		super( title, availability, max_reservation_period, genre);
		this.issue_date = issue_date;
	}

}
