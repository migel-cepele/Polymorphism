package chapter10;

public class PayableInterfaceTest {
    public static void main(String[] args) {
        
        //krijon nje array me 4 element
        Payable payableObjects[] = new Payable[4];

        //mbushja e objekteve qe implementojne
        payableObjects[0] = new Invoice("5615", "seat", 2, 375);
        payableObjects[1] = new Invoice("1555", "tire", 4, 79.58);
        payableObjects[2] = new SalariedEmployee("hfsds", "shdjkas", "1548=55", 800);
        payableObjects[3] = new SalariedEmployee("klsdkla", "sdnakl", "54574-58", 1200);

        //procesimi me ane te polimorfizmit te elementeve te tabeles
        for(Payable currentPayable:payableObjects) {

            System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(),
            "payment due",
            currentPayable.getPaymentAmount());

        }
    }
}
