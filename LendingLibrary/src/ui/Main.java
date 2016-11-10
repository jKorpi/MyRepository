package ui;

import models.Book;
import models.BookCatalog;
import models.Customer;
import models.DVD;
import utilities.GenderType;

public class Main {

	public static void main(String[] args) {

		BookCatalog bookCatalog = new BookCatalog();

		Book book1 = new Book(1, "Introduction to Java", "Matt Greencroft", "12345", "Anytown Branch", 400);
		Book book2 = new Book(2, "Better Java", "Joe Le Blanc", "23456", "Anytown Branch", 150);
		DVD dvd1 = new DVD(3, "Epic Film", "Anytown Branch", "Stephen Spielberg", "99887", 120);
		DVD dvd2 = new DVD(3, "Epic Film", "Anytown Branch", "Stephen Spielberg", "99887", 120);

		System.out.println(dvd1.getTitle());
		book1.relocate("My City Branch");

		bookCatalog.addBook(book1);
		bookCatalog.addBook(book2);

		UI ui = new UI();
		ui.printHeader();

		ui.printBookCatalog(bookCatalog.getBookArray());

		Book foundBook = bookCatalog.findBook("Better java");
		if (foundBook != null) {
			System.out.println("We found " + foundBook.getTitle());
		}

		Customer customer = new Customer("Mr", "Mike", "Smith", "1 High St.", "1234456", "m@s.com", 1, GenderType.MALE);
		System.out.println(customer.getExpiryDate());
		System.out.println(customer.getMailingName());

		System.out.println(customer);
		System.out.println(dvd1);
		
		System.out.println(dvd1.equals(dvd2));
		System.out.println(dvd1.equals(dvd2));
		
		
	}

}
