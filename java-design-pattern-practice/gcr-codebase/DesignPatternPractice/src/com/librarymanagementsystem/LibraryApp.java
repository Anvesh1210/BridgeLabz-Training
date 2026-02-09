package com.librarymanagementsystem;

public class LibraryApp {
	public static void main(String[] args) {

		// Singleton Pattern
		LibraryCatalog catalog = LibraryCatalog.getInstance();

		// Factory pattern
		User student = UserFactory.createUser("student", "Alice");
		User faculty = UserFactory.createUser("faculty", "Dr. Bob");

		student.showRole();
		faculty.showRole();

		// Observer registration
		catalog.addObserver(student);
		catalog.addObserver(faculty);

		// Builder pattern
		Book book = new Book.BookBuilder("Design Patterns").author("GoF").edition("2nd Edition")
				.genre("Software Engineering").build();
		catalog.addBook(book);
	}
}
