package ejemplos.original.switchstatements;

public class Employee {
	private float salary;    
    private float bonusPercentage;    
    private EmployeeType employeeType;  
    
    public Employee(float salary, float bonusPercentage, EmployeeType employeeType)    
    {        
        this.salary = salary;        
        this.bonusPercentage = bonusPercentage;        
        this.employeeType = employeeType;    
    }    
    public float CalculateSalary()     
    {        
        switch (employeeType)         
        {            
            case Worker:                
                return salary;             
            case Supervisor:                
                return salary + (bonusPercentage * 0.5F);            
            case Manager:                
                return salary + (bonusPercentage * 0.7F);        
        }
        return 0.0F;    
    }
    public float CalculateYearBonus() 
    {    
        switch (employeeType)     
        {        
            case Worker:            
                return 0;         
            case Supervisor:            
                return salary + salary * 0.7F;        
            case Manager:            
                return salary + salary * 1.0F;      
        }
        return 0.0F;
    }
}
