package tp1;

import java.util.ArrayList;
import java.util.List;

public class Library_section {
	private String name;
	private int id;
	private String description;
	private List<Library_material> list_of_books;
	
	
	/**
	 * @param name
	 * @param id
	 * @param description
	 * @param list_of_books
	 */
	public Library_section(String name, int id, String description) {
		super();
		this.name = name;
		this.id = id;
		this.description = description;
		this.list_of_books = new ArrayList<Library_material>();
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
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
	
	//ad a book to the section
	public void addNewMaterial(Library_material mat) {
		list_of_books.add(mat);
		
	}
	
	//remove a book from the section
	public void removeMaterial(Library_material mat) {
		if (list_of_books.contains(mat)) {
			list_of_books.remove(mat);
		}
	}
	

}
