package chapter10;
//kjo nenklase konkrete e superklases Employee duhet te implementoje metoden abstrakte te Employee


public class SalariedEmployee extends Employee {

    private double weeklySalary;

    //konstruktori
    public SalariedEmployee(String fn, String ln, String ssn, double ws) {

        //thirrja e konstruktorit te superklases
        super(fn, ln, ssn);

        if(ws < 0.0) {
            throw new IllegalArgumentException("Paga javore duhet > 0.0");
        }

        weeklySalary = ws;

    }

    //set salary
    public void setWeeklySalary(double ws) {
        if(ws < 0.0) {
            throw new IllegalArgumentException("Paga javore duhet > 0.0");
        }

        weeklySalary = ws;
    }

    //kthen pagen
    public double getSalary() {return weeklySalary;}

    //llogaritja e te ardhurave: override metoden abstrakte
    @Override
    public double earnings() {
        return getSalary();
    }

    //rish
    @Override
    public double getPaymentAmount() {
        return getSalary();
    }

    //kthen nje paraqitje me String te nje objekti SalariedEmployee
    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(),
         "paga javore", getSalary());
    }


    
}
