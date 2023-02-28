package chapter10;

public class HourlyEmployee extends Employee{

    private double wage; //per ore
    private double hours;

    //konstruktori
    public HourlyEmployee(String fn, String ln, String ssn, double wage, double hours) {
        super(fn, ln, ln);

        //validimi i pageses
        if (wage < 0.0) // validate wage
            throw new IllegalArgumentException(
            "Hourly wage must be >= 0.0");



        //validimi i oreve
        if ((hours < 0.0) || (hours > 168.0)) // validate hours
            throw new IllegalArgumentException(
            "Hours worked must be >= 0.0 and <= 168.0");

        this.wage = wage;
        this.hours = hours;



    }

    //set wage
    public void setWage(double wage) {
        //validimi i pageses
        if (wage < 0.0) // validate wage
            throw new IllegalArgumentException(
            "Hourly wage must be >= 0.0");

        this.wage = wage;

    }

    //getwage
    public double getWage() {return wage;}

    //set hours
    public void setHours(double hours) {

        //validimi i oreve
        if ((hours < 0.0) || (hours > 168.0)) // validate hours
            throw new IllegalArgumentException(
            "Hours worked must be >= 0.0 and <= 168.0");

        this.hours = hours;
    }

    public double getHours() {return hours;}

    //llogarit te ardhurat
    @Override
    public double earnings() {
        if (getHours() <= 40) // no overtime
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;

    }

    @Override
    public double getPaymentAmount() {
        return earnings();
    }

    // return String representation of HourlyEmployee object
    @Override
    public String toString()
    {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
        super.toString(), "hourly wage", getWage(),
        "hours worked", getHours());
}
    
}
