package tp1;

public class Author {
	
	public String name;
	public String biography;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", biography=" + biography + "]";
	}
	/**
	 * @param name
	 * @param biography
	 */
	public Author(String name, String biography) {
		super();
		this.name = name;
		this.biography = biography;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the biography
	 */
	public String getBiography() {
		return biography;
	}
	/**
	 * @param biography the biography to set
	 */
	public void setBiography(String biography) {
		this.biography = biography;
	}
	

}
