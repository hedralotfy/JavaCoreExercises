package inheritanceAndPolyExercise.presents;

import java.util.Arrays;
import java.util.Objects;

public class Present {

	private static final int DEFAULT_GIFT_CAPACITY = 10;
	private Sweet[] sweets;
	private int lastIndexAdded;

	{
		sweets = new Sweet[DEFAULT_GIFT_CAPACITY];
	}

	public void addSweet(Sweet sweet) {
		if (sweet == null) {
			return;
		}
		if (sweets.length <= lastIndexAdded) {
			sweets = Arrays.copyOf(sweets, sweets.length * 2);
		}
		sweets[lastIndexAdded++] = sweet;
	}

	public double calculateTotalWeight() {
		double sumWeight = 0;
		for (Sweet sweet : sweets) {
			if (sweet != null) {
				sumWeight += sweet.weight;
			}
		}
		return sumWeight;
	}

	public Sweet[] filterSweetsBySugarRange(double minSugarWeight,
			double maxSugarWeight) {
		int matchSweetsAmount = 0;
		for (Sweet sweet : sweets) {
			if (sweet != null && (sweet.sugarWeight >= minSugarWeight
					&& sweet.sugarWeight <= maxSugarWeight)) {
				matchSweetsAmount++;
			}
		}
		
		Sweet[] filteredSweets = new Sweet[matchSweetsAmount];
		int index = 0;
		for (Sweet sweet : sweets) {
			if (sweet != null && (sweet.sugarWeight >= minSugarWeight
					&& sweet.sugarWeight <= maxSugarWeight)) {
				filteredSweets[index++] = sweet;
			}
		}

		return filteredSweets;
	}

	public Sweet[] getSweets() {
		int nonNullSweetsAmount = 0;
		for (Sweet sweet : sweets) {
			if (sweet != null) {
				nonNullSweetsAmount++;
			}
		}

		Sweet[] nonNullSweets = new Sweet[nonNullSweetsAmount];
		int index = 0;
		for (Sweet sweet : this.sweets) {
			if (sweet != null) {
				nonNullSweets[index++] = sweet;
			}
		}

		return nonNullSweets;
	}

}

/*
 * import java.util.Arrays;
import java.util.Objects;

public class Present {

	private static final int DEFAULT_SWEET_CAPACITY = 10;
	private int last_index_added;
	Sweet[] sweets;
	
	{
		sweets = new Sweet[DEFAULT_SWEET_CAPACITY];
	}

	// This method adds an instance of type Sweet to the sweets array
	public void addSweet(Sweet sweet) {
		if (sweet != null) {
			return;
		}
		if (DEFAULT_SWEET_CAPACITY <= last_index_added) {
			sweets = Arrays.copyOf(sweets, sweets.length * 2);
		}
		
		sweets[last_index_added++] = sweet;

	}

	public Sweet[] addSweet() {
		int nonNullIndex = 0;
		int changingIndex = 0;

		for (Sweet sweet : sweets) {
			if (sweet != null) {
				nonNullIndex++;
			}
		}

		Sweet[] noNullSweets = new Sweet[nonNullIndex];

		for (Sweet sweet : sweets) {
			if (sweet != null) {
				noNullSweets[changingIndex++] = sweet;
			}
		}

		
		return noNullSweets;
	}

	public double calculateTotalWeight() {

		double totalWeight = 0;
		for (Sweet sweet : sweets) {
			if(sweet != null) {
				totalWeight += sweet.weight;
			}
		}
		return totalWeight;
	}

	public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {

		int filtered = 0;
		int incrementingIndex = 0;
		for (Sweet sweet : sweets) {
			if (sweet != null && (sweet.sugarWeight >= minSugarWeight && sweet.sugarWeight <= maxSugarWeight)) {
				filtered++;
			}
		}
		
		Sweet[] filteredSweets = new Sweet[filtered];
		
		for (Sweet sweet : sweets) {
			if (sweet != null && (sweet.sugarWeight >= minSugarWeight && sweet.sugarWeight <= maxSugarWeight)) {
				filteredSweets[incrementingIndex++] = sweet;
			}
		}
		return filteredSweets;
	}


 */