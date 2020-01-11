package ejemplos.refactoring.switchstatements;

public class Manager extends Employee {

	
	public Manager(float salary, float bonusPercentage) {
		super(salary, bonusPercentage);
		
	}

	@Override
	public float CalculateSalary() {
		// TODO Auto-generated method stub
		return salary + (bonusPercentage * 0.7F);
	}
	
	@Override
	public float CalculateYearBonus()     
    {
        return salary + salary * 1.0F;    
    }

}
