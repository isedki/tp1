package tp1;

import java.util.Date;

public class Inventory {
	
	public Date date_of_purchase;
	public int number_of_copy;
	public Library_material material;
	public Library_section section;
	
	/**
	 * @param date_of_purchase
	 * @param number_of_copy
	 * @param material
	 * @param section
	 */
	public Inventory(Date date_of_purchase, int number_of_copy, Library_material material, Library_section section) {
		super();
		this.date_of_purchase = date_of_purchase;
		this.number_of_copy = number_of_copy;
		this.material = material;
		this.section = section;
	}

	/**
	 * @return the number_of_copy
	 */
	public int getNumber_of_copy() {
		return number_of_copy;
	}

	/**
	 * @param number_of_copy the number_of_copy to set
	 */
	public void setNumber_of_copy(int number_of_copy) {
		this.number_of_copy = number_of_copy;
	}

	/**
	 * @return the date_of_purchase
	 */
	public Date getDate_of_purchase() {
		return date_of_purchase;
	}

	/**
	 * @param date_of_purchase the date_of_purchase to set
	 */
	public void setDate_of_purchase(Date date_of_purchase) {
		this.date_of_purchase = date_of_purchase;
	}

	/**
	 * @return the material
	 */
	public Library_material getMaterial() {
		return material;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(Library_material material) {
		this.material = material;
	}

	/**
	 * @return the section
	 */
	public Library_section getSection() {
		return section;
	}

	/**
	 * @param section the section to set
	 */
	public void setSection(Library_section section) {
		this.section = section;
	}





}
