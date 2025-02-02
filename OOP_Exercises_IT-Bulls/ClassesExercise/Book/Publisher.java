package classesExercise.book;

import java.util.Objects;

public class Publisher {

	int id;
	String publisherName;
	
	public Publisher(int id, String publisherName) {
		this.id = id;
		this.publisherName = publisherName;
	}
	@Override
	public String toString() {
		return "Publisher [id=" + id + ", publisherName=" + publisherName + "]";
	}
	
	/*
	 * == compares memory addresses to check that they're the same.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publisher other = (Publisher) obj;
		return id == other.id && Objects.equals(publisherName, other.publisherName);
	}
}
