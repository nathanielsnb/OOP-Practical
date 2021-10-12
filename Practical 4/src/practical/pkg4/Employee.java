package practical.pkg4;

public class Employee {
    private String name;
    private double salary;
    
    Employee(String employeeName, double currentSalary){
        name = employeeName;
        salary = currentSalary;
    }
    
    public Employee(){
        name = "";
        salary = 0.0;
    }
    
    public Employee(String empName){
        name = empName;
        salary = 0.0;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public String getName(String n){
        return this.name;
    }
    
    void raiseSalary(double percent){
        salary = salary + (salary * percent/100.0);
    }
    
    public void setSalary(double m){
        salary = m;
    }
    
    public double getSalary(){
        return salary;
    }
}
