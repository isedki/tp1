package tp1;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Library_section {
	private String name;
	private String id;
	private String description;
	private List<Library_material> list_of_books;
	private boolean not_damaged;
	
	
	/**
	 * @param name
	 * @param id
	 * @param description
	 * @param list_of_books
	 */
	public Library_section(String name,  String description) {
		super();
		this.name = name;
		//library section is unique
		this.id = UUID.randomUUID().toString();
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
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
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
		//Description for each library section should be at least 20 characters but no mare than 200 characters
		if(description.length()>20 || description.length()<200 ) {
			this.description = description;
		}
		
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
		//we add the material to a section only if it is not contained in this section
		if(not_damaged) {
			if (!list_of_books.contains(mat)) {
			list_of_books.add(mat);
			}
		}
	}
	
	//remove a book from the section
	public void removeMaterial(Library_material mat) {
		if (list_of_books.contains(mat)) {
			list_of_books.remove(mat);
		}
	}
	
	//remove a book from the section
	public void markMaterialAsDamaged() {
		not_damaged = false;
	}
	/**
	 * @return the not_damaged
	 */
	public boolean isNot_damaged() {
		return not_damaged;
	}
	/**
	 * @param not_damaged the not_damaged to set
	 */
	public void setNot_damaged(boolean not_damaged) {
		this.not_damaged = not_damaged;
	}
	

}
