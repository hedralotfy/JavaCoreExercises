package inheritanceAndPolyExercise.presents;

public abstract class Candy extends Sweet {

	/*
	 * Candy extending Sweet is inheritance.
	 */
	/*
	 * name, weight and sugarWeight. Weight is a weight of the specific sweet in
	 * kilograms. sugarWeight is a weight of sugar in this sweet in kilograms.
	 */

	

	@Override
	public void setName(String string) {
		super.name = string;
	}

	@Override
	public void setSugarWeight(double d) {
		super.sugarWeight = d;
	}

	@Override
	public void setWeight(double d) {
		super.weight = d;
	}
	
	@Override
	public double getTotalWeight() {
		return super.sugarWeight + super.weight;
	}
}
