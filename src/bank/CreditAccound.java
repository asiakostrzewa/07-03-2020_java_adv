package bank;

public class CreditAccound extends Account {

    public CreditAccound(int balance, String number, Client c1) {
        super(balance, number, c1);
    }

    @Override //=nadpisanie
    public int withdraw(int cash){
        super.balance -= cash; //nie obowiązuje cash <= balance
        return cash;
    }

}
