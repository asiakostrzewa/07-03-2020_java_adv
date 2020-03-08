package bank;

public class NegativeWithdrawExeption extends RuntimeException {

    public NegativeWithdrawExeption(String msg) {
        super(msg);
    }
}
