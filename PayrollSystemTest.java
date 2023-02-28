package chapter10;



public class PayrollSystemTest {
    public static void main(String[] args) {
        //krijojme objekte per cdo nenklase
        SalariedEmployee salariedEmployee =

        new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);

        HourlyEmployee hourlyEmployee =
        new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);

        CommissionEmployee commissionEmployee =
        new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);

        BasePlusCommissionEmployee basePlusCommissionEmployee =new BasePlusCommissionEmployee(
        "Bob", "Lewis", "444-44-4444", 5000,
       .04, 300);

       //ilustrimi i polimorfizmit
       Employee[] employees  = new Employee[4];

       //inicializimi i tabeles me punetoret sipas nenklasave
       employees[0] = salariedEmployee;
       employees[1] = hourlyEmployee;
       employees[2] = commissionEmployee;
       employees[3] = basePlusCommissionEmployee;

       //ne menyre te pergjithsme cdo element i tabeles procesohet
       for(Employee currentEmployee : employees) {

        System.out.println(currentEmployee); //therret metoden toString

        //percaktojme nese elementi eshte nje basepluscommissionemployee
        if (currentEmployee instanceof BasePlusCommissionEmployee) {

            //downcast Employee reference to BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf("paga e re me 10%% rritje: %.2f%n", employee.getBaseSalary());


        }

        System.out.println("earned " + currentEmployee.earnings());
       }

       //merr emrin e tipit per cdo objekt te tabeles se punonjesve
       for(int j = 0; j < employees.length; j++) {
        System.out.printf("Employee %d eshte nje %s%n", j, employees[j].getClass().getName());
       }




    }
}
