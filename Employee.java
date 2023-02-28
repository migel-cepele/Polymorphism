package chapter10;
//Employee abstract superclass
/*klasat qe implemetojne kete klase eksplicikisht dhe implicikisht jane:
 * SalariedEmployee
 * HourlyEmployee
 * CommissionEmployee
 * BasePlusCommissionEmployee
 */


 //ne kete klase nuk implementojme metoden getPaymentAmount dhe per ate arsye
 // kjo klase duhet abstrakte(megjithate ka dhe nje fun tjeter abstrakt)
public abstract class Employee implements Payable {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    //konstruktori
    public Employee(String fn, String ln, String ssn) {
        firstName = fn;
        lastName = ln;
        socialSecurityNumber = ssn;
    }

    //kthen emrin
    public String getFirstName() {
        return firstName;
    }

    //kthen mbiemrin
    public String getLastName() {
        return lastName;
    }

    //kthen ssn
    public String getSsn() {
        return socialSecurityNumber;
    }

    //kthen nje paraqitje ne string te objektit Employee
    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s", getFirstName(),
        getLastName(), getSsn());
    }

    //metoda abstrakte e superklases qe duhet te jete overridden nga nenklasat konkrete
    //pa implementim
    public abstract double earnings();
    
}
