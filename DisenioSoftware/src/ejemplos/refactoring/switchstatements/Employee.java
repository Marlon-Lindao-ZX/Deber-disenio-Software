package ejemplos.refactoring.switchstatements;

abstract public class Employee 
{ 
    protected float salary;    
    protected float bonusPercentage;    
    public Employee(float salary, float bonusPercentage)    
    {        
        this.salary = salary;        
        this.bonusPercentage = bonusPercentage;    
    }    
    abstract public float CalculateSalary();
    public float CalculateYearBonus()     
    {
        return 0.0F;    
    }
}
