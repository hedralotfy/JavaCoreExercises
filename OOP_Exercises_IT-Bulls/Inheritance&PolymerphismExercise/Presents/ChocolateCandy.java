package inheritanceAndPolyExercise.presents;

public class ChocolateCandy extends Candy {

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

}
