public class Checking extends Account {

    //no arg constructor
    public Checking() {
        this(0);
    }

    //constructor to call Account constructor with argument value
    public Checking(double opening_balance) {
        super(opening_balance);
    }

    //override account class withdrawal method to check for overdraft
    @Override
    public void withdrawal(double withdrawal_amt) {
        //if statement to check for overdraft
        if (withdrawal_amt > getAccount_balance()) {
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
            //call withdrawal method in account class and adding overdraft fee
            super.withdrawal(withdrawal_amt + 20);
        } else super.withdrawal(withdrawal_amt);
    }

    //override toString method to print balance easier
    @Override
    public String toString() {
        String readout = "Your balance for checking " + getAccount_number() + " is " + getAccount_balance();
        return readout;
    }
}
