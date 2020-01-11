package ejemplos.refactoring.switchstatements;

public class Supervisor extends Employee {

	
	public Supervisor(float salary, float bonusPercentage) {
		super(salary, bonusPercentage);
		
	}

	@Override
	public float CalculateSalary() {
		// TODO Auto-generated method stub
		return salary + (bonusPercentage * 0.5F);
	}
	
	@Override
	public float CalculateYearBonus()     
    {
        return salary + salary * 0.7F;    
    }

}
