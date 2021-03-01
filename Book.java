package tp1;

import java.util.Date;

public class Book extends Library_material {
	public int edition;
	public Date publication_date;
	public String publisher;
	public String ISBN;
	public Author author;
	
	/**
	 * @param id
	 * @param title
	 * @param availability
	 * @param max_reservation_period
	 * @param genre
	 * @param edition
	 * @param publication_date
	 * @param publisher
	 * @param iSBN
	 */
	public Book(int id, String title, Boolean availability, int max_reservation_period, String genre, int edition,
			Date publication_date, String publisher, String iSBN, Author author) {
		super(id, title, availability, max_reservation_period, genre);
		this.edition = edition;
		this.publication_date = publication_date;
		this.publisher = publisher;
		this.ISBN = iSBN;
		this.author = author;
	}
	@Override
	public String toString() {
		return "[name=" + super.title + ", publication_date=" + publication_date + ", publisher=" + publisher
				+ "]";
	}
	/**
	 * @return the edition
	 */
	public int getEdition() {
		return edition;
	}
	/**
	 * @param edition the edition to set
	 */
	public void setEdition(int edition) {
		this.edition = edition;
	}
	/**
	 * @return the publication_date
	 */
	public Date getPublication_date() {
		return publication_date;
	}
	/**
	 * @param publication_date the publication_date to set
	 */
	public void setPublication_date(Date publication_date) {
		this.publication_date = publication_date;
	}
	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * @return the iSBN
	 */
	public String getISBN() {
		return ISBN;
	}
	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	

}
