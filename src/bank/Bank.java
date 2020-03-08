package bank;

public class Bank {
    public static void main(String[] args) {

        PersonalClient c1 = new PersonalClient("Jan", "Kowalski");
        BusinessClient c2 = new BusinessClient("Acme");

        if (c2 instanceof BusinessClient) {
            System.out.println("biznesowy" + ((BusinessClient) c2).getNip()); //rzutowanie klienta biznesowego na klienta.
            //Client nie może być rzutowany na BusinessClient bo nie każdy klient ma biznes.
        }

        /*CreditAccound a1 = new CreditAccound(500, "1234", c1); //nadrzędna x = new podrzędna
        CheckingAccound a2 = new CheckingAccound(100, "2345", c1);
        CreditAccound a3 = new CreditAccound(200, "3456", c2);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(c1);*/

        Account a1 = new CheckingAccound(500, "1234", c1);
        try {
            a1.withdraw(-5);
        } //catch (IllegalArgumentException e) {
        //catch (Exception e) {
        catch (NegativeWithdrawExeption e) {
            System.out.println("Sytuacja wyjątkowa! " + e.getMessage());
        } finally {
            System.out.println("Brawo Ty!");
        }

        Account a2 = new CheckingAccound(2000, "2345", c1);
        try {
            a2.deposit(0);
        } catch (MyExeption e) {
            System.out.println("Sytuacja wyjątkowa! " + e.getMessage());
        }
    }
}
