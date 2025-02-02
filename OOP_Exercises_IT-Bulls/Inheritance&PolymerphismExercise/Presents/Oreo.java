package inheritanceAndPolyExercise.presents;

public class Oreo extends Cookie {

	
	
	public String toString() {
		return "Oreo [doughWeight=" + doughWeight + ", name=" + name + ", sugarWeight=" + sugarWeight + ", weight="
				+ weight + "]";
	}

	@Override
	public void setDoughWeight(double d) {
		super.doughWeight = d;
		
	}

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
		
		return super.sugarWeight + super.doughWeight + super.weight;
	}

}
