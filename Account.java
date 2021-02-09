public class Account {
    //declare and initialize static acct num counter variable
    private static int acct_num_counter = 10001;
    //declare acct num and balance vars
    private int account_number;
    private double account_balance;

    //constructor that calls overloaded constructor with balance of 0
    public Account() {
        this(0);
    }

    //constructor that accepts acct balance
    public Account(double account_balance) {
        //set acct num from counter
        account_number = acct_num_counter;
        //increment counter
        acct_num_counter++;
        //set account balance
        this.account_balance = account_balance;

    }

    //withdrawal method that subtracts argument value from acct balance
    public void withdrawal(double withdrawal_amt) {
        account_balance -= withdrawal_amt;
    }

    //deposit method that adds argument value to acct balance
    public void deposit(double deposit_amt) {
        account_balance += deposit_amt;
    }

    //account number getter
    public int getAccount_number() {
        return account_number;
    }

    //account balance getter
    public double getAccount_balance() {
        return account_balance;
    }

    //account balance setter
    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }
}
