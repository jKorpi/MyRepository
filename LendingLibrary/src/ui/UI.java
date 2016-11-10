package ui;
import models.Book;

public class UI {

	public void printHeader() {
		System.out.println("BookId  Titel                 Author");
	}

	public void printBook(Book book) {

		System.out.println(fixLenghtString(book.getID(), 6) + "  " + fixLenghtString(book.getTitle(), 20) + "  "
				+ fixLenghtString(book.getAuthor(), 20));
	}

	private String fixLenghtString(String start, int lenght) {
		// TODO: fix string padding problem
		if (start.length() >= lenght) {
			return start.substring(0, lenght);
		} else {
			while (start.length() < lenght) {
				start += " ";
			}
			return start;
		}
	}

	private String fixLenghtString(int start, int lenght) {
		String startString = String.valueOf(start);
		return fixLenghtString(startString, lenght);
	}

	public void printBookCatalog(Book[] bookCatalog) {
		for (int counter = 0; counter < bookCatalog.length; counter++) {
			if (bookCatalog[counter] != null) {
				printBook(bookCatalog[counter]);
			}
		}
	}
}