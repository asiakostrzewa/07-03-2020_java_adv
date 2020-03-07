package bank;

public class Bank {
    public static void main(String[] args) {

        PersonalClient c1 = new PersonalClient("Jan", "Kowalski");
        BusinessClient c2 = new BusinessClient("Acme");

        if (c2 instanceof BusinessClient) {
            System.out.println("biznesowy" + ((BusinessClient) c2).getNip()); //rzutowanie klienta biznesowego na klienta.
            //Client nie może być rzutowany na BusinessClient bo nie każdy klient ma biznes.
        }

    CreditAccound a1 = new CreditAccound(500, "1234", c1); //nadrzędna x = new podrzędna
    CheckingAccound a2 = new CheckingAccound(100, "2345", c1);
    CreditAccound a3 = new CreditAccound(200, "3456", c2);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(c1);

    }
}
