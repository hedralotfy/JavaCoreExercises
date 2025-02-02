package inheritanceAndPolyExercise.presents;

public abstract class Cookie extends Sweet {
	
	double doughWeight;
	/*
	 * Cookie extending Sweet is inheritance.
	 */

	public abstract void setDoughWeight(double d);
	
	@Override
	public double getTotalWeight() {
		
		return super.sugarWeight + this.doughWeight + super.weight;
	}

}
