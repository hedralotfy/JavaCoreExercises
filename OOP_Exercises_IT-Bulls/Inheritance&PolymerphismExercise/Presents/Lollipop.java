package inheritanceAndPolyExercise.presents;

public class Lollipop extends Candy {

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
		// TODO Auto-generated method stub
		return super.sugarWeight + super.weight;
	}

}
