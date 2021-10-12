/**
 * 
 */
package lab3;

import java.util.ArrayList;

/**
 * @author Diana Anton
 *
 */
public class Book {
	private String title;
	private ArrayList<Author> authors;
	private ArrayList<Element> content = new ArrayList<>();
	
	/**
	 * 
	 * @param name
	 */
	public Book(String name) {
		this.title = name;
	}
	
	/**
	 * 
	 */
	public void print() {
		System.out.println("Book: " + this.title + "\n");
		System.out.println("Authors: ");
		for(Author a : authors) {
			a.print();
		}
		
		System.out.println("\n");
		
		for(Element e: content) {
			e.print();
		}
	}
	
	/**
	 * 
	 * @param a
	 */
	public void addAuthor(Author a) {
		if(authors == null) {
			authors = new ArrayList<>();
		}
		authors.add(a);
	}
	
	/**
	 * Adds new content to the array.
	 * @param e - The element to be added to the array.
	 */
	public void addContent(Element e) {
		this.content.add(e);
	}
}
