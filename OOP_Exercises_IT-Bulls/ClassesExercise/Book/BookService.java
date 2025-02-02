package classesExercise.book;

public class BookService {

	public Book[] book;
	public Author author;

	public Book[] filterBooksByAuthor(Author author, Book[] books) {
		// Use array filtration concept for this purpose.
		int filteredBooksCount = 0;

		if (author == null) {
			return  books = new Book[0];
		}

		if (books == null) {
			return books = new Book[0];
		}

		for (Book book2bFiltered : books) {
			for (Author found : book2bFiltered.getAuthors()) {
				// When we used equals() method, it always returned false.
				// Though the objects are the same, I will ask chatGPT
				// Why I get false, though I have objects that are identical
				// show him the call of this method and the book array, also the first part of
				// it.

				/*
				 * .equals() method wasn't working, as I haven't overridden it in the class that
				 * have objects to be compared.
				 * 
				 * (Gemini) 1-https://stackoverflow.com/questions/72398134/in-arraydeque-
				 * containsallcollection-c-containsobject-o-equalsobject-o-gi
				 * 
				 * 2-github.com/haozhang27/java By default, the .equals() method inherited from
				 * the Object class (which all
				 * 
				 * classes ultimately inherit from) simply compares object references. This
				 * means it checks if both objects are literally the same object in memory.
				 * 
				 * So, even if two objects have the same values for their properties, they will
				 * return false with the default .equals() because they reside at different
				 * memory locations.
				 */
				if (found.equals(author)) {
					filteredBooksCount++;
				}
			}
		}

		Book[] filteredBooks = new Book[filteredBooksCount];
		Author found;

		for (int i = 0, j = 0; i < books.length; i++) {

			for (int k = 0; k < books[i].getAuthors().length; k++) {

				found = books[i].getAuthors()[k];

				if (found.equals(author)) {
					filteredBooks[j] = books[i];
					j++;
				}
			}
		}

		return filteredBooks;
	}

	public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
		
		if (publisher == null) {
			return books = new Book[0];
		}

		if (books == null) {
			return books = new Book[0];
		}
		
		// Use array filtration concept for this purpose.
		int filteredBooksCount = 0;

		for (Book books2bFiltered : books) {
			Publisher found = new Publisher(books2bFiltered.getPublisher().id,
					books2bFiltered.getPublisher().publisherName);
			if ((found).equals(publisher)) {
				filteredBooksCount++;
			}

		}

		Book[] filteredBooks = new Book[filteredBooksCount];
		Publisher found;

		for (int i = 0, j = 0; i < books.length; i++) {
			found = books[i].getPublisher();
			if (found.equals(publisher)) {
				filteredBooks[j] = books[i];
				j++;
			}
		}

		return filteredBooks;
	}

	// methods keeps books with publishing year inclusively.
	public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
		int filteredBooksCount = 0;

		if (yearFromInclusively == 0) {
			return books;
		}

		if (books == null) {
			return books = new Book[0];
		}
		
		for(Book filteredBooks : books) {
			if(filteredBooks.getPublishingYear() >= yearFromInclusively) {
				filteredBooksCount++;
			}
		}
		
		Book[] filteredBooks = new Book[filteredBooksCount];
		
		for(int i = 0, j = 0; i < books.length; i++) {
			if(books[i].getPublishingYear() >= yearFromInclusively) {
				filteredBooks[j] = books[i];
				j++;
			}
		}
		
		return filteredBooks;
	}

}
