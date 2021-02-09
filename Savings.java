public class Savings extends Account {

    private int num_deposits = 0;

    //no arg constructor
    public Savings() {
        this(0);
    }

    //constructor to set account balance
    public Savings(double opening_balance) {
        super(opening_balance);
    }

    //overriding withdrawal method to check if below $500
    @Override
    public void withdrawal(double withdrawal_amt) {

        //if statement to check for balance below 500
        if (getAccount_balance() - withdrawal_amt < 500) {
            System.out.println("Charging a fee of $10 because you are below $500");
            super.withdrawal(withdrawal_amt + 10);
        } else super.withdrawal(withdrawal_amt);
    }

    //overriding deposit method to charge if more than 5
    @Override
    public void deposit(double deposit_amt) {
        //make deposit, increment counter, print num of deposits.
        super.deposit(deposit_amt);
        num_deposits++;
        System.out.println("This is deposit number " + num_deposits + " to this account.");
        //check if deposits over 5 and charge fee if so
        if (num_deposits > 5) {
            System.out.println("Charging a fee of $10.");
            setAccount_balance(getAccount_balance() - 10);
        }
    }

    //interest method
    public void annual_interest() {
        //store interest value
        final double interest_value = 0.015;
        //print interest earned
        System.out.println("Customer earned " + (interest_value * getAccount_balance()) + " in interest.");
        //update account balance
        double new_bal = getAccount_balance() * (1 + interest_value);
        setAccount_balance(new_bal);
    }

    //deposit counter getter
    public int getNum_deposits() {
        return num_deposits;
    }

    //deposit counter setter
    public void setNum_deposits(int num_deposits) {
        this.num_deposits = num_deposits;
    }

    //override toString method to print balance easier
    @Override
    public String toString() {
        String readout = "Your balance for savings " + getAccount_number() + " is " + getAccount_balance();
        return readout;
    }
}
