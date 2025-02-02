package inheritanceAndPolyExercise.presents;

public abstract class Sweet {

	String name;
	double weight;
	double sugarWeight;
	
	public abstract void setName(String string);

	public abstract void setSugarWeight(double d);

	public abstract void setWeight(double d);
	
	public abstract double getTotalWeight();

}
