package tp1;

import java.util.Date;


public class Test {

	public static void main(String[] args) {
		
		/**  creation of a new student **/ 
		//the two student are not blacklisted initially
		User alireza = new Student(1,"Alireza","alireza@gmail.com","5147835678", 3, false, "xxxx12345@", "encs1");
		User issam = new Student(2,"issam","issam@gmail.com","51478357654", 3, false, "xxxx6789!", "encs2");
		
		/** creation of an author named John Doe **/
		Author john_doe = new Author("JOhn Doe", "Great science author living in Canada with his wife and 5 kids");
		
		/** creation of a book **/
		//this book can be borrowed for up to 7 days
		//genre = science
		//edition = 3
		//publisher = Gilbert Edition
		//publication date = March 2020
		//ISBN = IS123456
		//Author = John Doe
		//(int id, String title, Boolean availability, int max_reservation_period, String genre, int edition,
		//Date publication_date, String publisher, String iSBN, Author author)
		Library_material book_science_grade3 = new Book(1,"book of science for grade 3",true,7,"science",3,new Date("01/03/2020"),"Gilbert Edition","IS123456", john_doe);
		
		
		/**  creation of a periodical instance **/
		//this book can be borrowed for up to 10 days
		//genre = nature
		//publication date = 15/02/2021
	
		Library_material magazine_of_nature = new Periodical(1,"Magazine of Nature and Wildlife",true, 10, "nature", new Date("15/02/2020"));
		
	    /** creation of two library sections **/
		Library_section science = new Library_section("science",1,"section for sceince books and periodicals");
		Library_section nature = new Library_section("nature",1,"section for nature and wildlife books and periodicals");
		
		/** adding the material to the appropriate section
		 * book material where bought and added the same date to different library sections
		 */
		
		Inventory inv1= new Inventory(new Date("28/01/2021"),1,book_science_grade3,science);
		science.addNewMaterial(book_science_grade3);
		Inventory inv2= new Inventory(new Date("28/01/2021"),1,magazine_of_nature,nature);
		nature.addNewMaterial(magazine_of_nature);
		
		/** a student is reserving a book **/
		
		Reservation resa1= new Reservation ("1", new Date("28/02/2021"), new Date("05/03/2021"),book_science_grade3,issam);
		issam.borrowNewMaterial(book_science_grade3);
		System.out.println("display of books borrowed by"+issam);
		System.out.println(issam.getList_of_books());
		issam.returnMaterial(book_science_grade3);
		System.out.println("display of books borrowed by"+issam);
		System.out.println(issam.getList_of_books());
		
		//we are performing the same test for alireza who is blacklisted
		//the outcome should be that he can not borrow any material
		alireza.setIs_blacklisted(true);
		alireza.borrowNewMaterial(magazine_of_nature);
		System.out.println("display of books borrowed by"+alireza);
		System.out.println(alireza.getList_of_books());
		

	}

}
