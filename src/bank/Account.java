package bank;

public class Account {

    protected int balance;
    private Client c1;
    private String number;

    public Account(int balance, String number, Client c1) { //konstruktor 3-elementowy
        this.number = number; //this - odwołanie się zmiennej do istniejącego pola
        this.balance = balance;
        this.c1 = c1;
    }

    public void deposit(int cash) { //nie zwracamy bo mamy void = puste
        if (cash > 0) {
            balance += cash;
        }
        if (cash <= 0){
            throw new MyExeption("Błąd");
        }
    }

    public int withdraw(int cash) {
        if (cash < 0) {
            //throw new IllegalArgumentException("Próba wypłaty mniejszej od 0"); //wyjątek
            throw new NegativeWithdrawExeption("Próba wypłaty mniejszej od 0");
        }
        if (cash <= balance) {
            balance -= cash;
        }
        return cash;
    }

    /* if (canWithdraw(cash)){
        balance -= cash;
        return cash;
    } else {
        return 0;
    } */

    public boolean transfer(Account target, int amount) {
        balance -= amount;
        target.balance += amount;
        return true;
    }

    public int getBalance() { //int dopuszcza liczby ujemne
        return balance;
    }

    @Override
    public String toString() {
        //super.toString();
        return "Stan konta " + number + ": " + balance;
    }

    /* private boolean canWithdraw(int cash) {
        if (balance > cash){
            return true;
        } else {
            return false;
        }
    }
    skrócona wersja:
    private boolean canWithdraw (int cash){
        return balance > cash;
    } */
}
