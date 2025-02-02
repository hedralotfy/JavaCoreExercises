package classesExercise.book;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class Book {
	int id;
	String name;
	Author[] authors;
	Publisher publisher;
	int publishingYear;
	int numberOfPages;
	BigDecimal price;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public BigDecimal getPrice() {
		return price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(authors);
		result = prime * result + Objects.hash(coverType, id, name, numberOfPages, price, publisher, publishingYear);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Arrays.equals(authors, other.authors) && coverType == other.coverType && id == other.id
				&& Objects.equals(name, other.name) && numberOfPages == other.numberOfPages
				&& Objects.equals(price, other.price) && Objects.equals(publisher, other.publisher)
				&& publishingYear == other.publishingYear;
	}

	public CoverType getCoverType() {
		return coverType;
	}


	CoverType coverType;

	public Book(int id, String name, Author[] authors, Publisher publisher, int publishingYear, int numberOfPages,
			BigDecimal price, CoverType coverType) {
		
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publisher = publisher;
		this.publishingYear = publishingYear;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.coverType = coverType;
	}
	
	public Book(int id, String name, Author[] authors){
		this.id = id;
		this.name = name;
		this.authors = authors;
	}
	
	public Book(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Book(int id, Publisher publisher, String name, int publishingYear){
		this.id = id;
		this.publisher = publisher;
		this.name = name;
		this.publishingYear = publishingYear;
	}

	public Book(Author[] authors) {
		this.authors = authors;
	}
	
	public Book(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authors=" + Arrays.toString(authors) + ", publisher="
				+ publisher + ", publishingYear=" + publishingYear + ", numberOfPages=" + numberOfPages + ", price="
				+ price + ", coverType=" + coverType + "]";
	}
}
