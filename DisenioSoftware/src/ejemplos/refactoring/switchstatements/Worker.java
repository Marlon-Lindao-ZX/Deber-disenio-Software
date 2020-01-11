package ejemplos.refactoring.switchstatements;

public class Worker extends Employee {

	
	public Worker(float salary, float bonusPercentage) {
		super(salary, bonusPercentage);
		
	}

	@Override
	public float CalculateSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

}
