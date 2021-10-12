package practical.pkg6;

public class CommissionEmployee extends Employee{
	private double grossSale;
        private double commisionRate;
	
	public CommissionEmployee() { 
	}
        
        public CommissionEmployee(String name, int yearJoined, double basicSalary,double grossSale, double commisionRate) {
            super(name, yearJoined, basicSalary);
            this.grossSale = grossSale;
            this.commisionRate = commisionRate;
        }

  	// use Alt-Insert to insert all the getters and setters

        public double getGrossSale() {
            return grossSale;
        }

        public double getCommisionRate() {
            return commisionRate;
        }

        public void setGrossSale(double grossSale) {
            this.grossSale = grossSale;
        }

        public void setCommisionRate(double commisionRate) {
            this.commisionRate = commisionRate;
        }

	public double calcMonthlySalary() {
	    return super.calcMonthlySalary()+(this.grossSale*this.commisionRate);
	}

	public String toString() {
            return super.toString()+"\n"+
                    "GrossSale: " + String.format("%.2f",grossSale) + "\n"+
                    "CommisionRate: " + String.format("%.2f",commisionRate);
        }

	public boolean equals(Object obj) {
            return super.equals(obj);
        }
}
