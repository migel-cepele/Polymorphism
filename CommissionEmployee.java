package chapter10;

public class CommissionEmployee extends Employee{

    private double grossSales;
    private double commissionRate;

    //konstruktori
    public CommissionEmployee(String fn, String ln, String ssn, double gs, double cr) {
        super(fn, ln, ssn);

        if (cr <= 0.0 || cr >= 1.0) // validate
            throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

        if (gs < 0.0) // validate
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        grossSales = gs;
        commissionRate = cr;
    }

    public void setGrossSales(double gs) {
        if (gs < 0.0) // validate
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        grossSales = gs;

    }

    public double getGrossSales() {return grossSales;}

    public void setCommissionRate(double cr) {

        if (cr <= 0.0 || cr >= 1.0) // validate
            throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

        commissionRate = cr;

    }

    public double getCommissionRate() {return commissionRate;}

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings()
    {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public double getPaymentAmount() {
        return getCommissionRate() * getGrossSales();
    }

    // return String representation of CommissionEmployee object
    @Override
    public String toString()
    {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
       "commission employee", super.toString(),
        "gross sales", getGrossSales(),
        "commission rate", getCommissionRate());
}




    
}
