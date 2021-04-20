package einheit1;

public class Account {
    private String owner;
    private String iban;
    private String bic;
    private double balance;
    private int accountID;
    private static int uniqueID =1;

    public Account(String owner, String iban, String bic){
        double balance = 0.0;
        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
        this.balance = balance;
        this.accountID = uniqueID;
        uniqueID ++;
    }

    public int getAccountID(){
        return accountID;
    }

    public double add(double wert){
        balance += wert;
        return balance;
    }

    public double deposit(double wert){
        if (balance > wert) {
            balance -= wert;
            return balance;
        }else {
            return balance;
        }
    }

    public double getBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", balance=" + balance +
                ", accountID=" + accountID +
                '}';
    }
}
