import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        //create scanner obj for user input
        Scanner scan = new Scanner(System.in);

        //declare and init choice variable
        int choice = 0;
        //declare and init deposit or withdrawal variable
        double amount = 0;

        //create accounts
        Checking checkingAcct = new Checking();
        Savings savingsAcct = new Savings();

        //print menu in do while loop to ensure at least 1 execution
        do {
            System.out.println("1. Withdraw from Checking");
            System.out.println("2. Withdraw from Savings");
            System.out.println("3. Deposit to Checking");
            System.out.println("4. Deposit to Savings");
            System.out.println("5. Balance of Checking");
            System.out.println("6. Balance of Savings");
            System.out.println("7. Award Interest to Savings now");
            System.out.println("8. Quit");

            //read user input
            choice = Integer.parseInt(scan.nextLine());

            //switch statement to evaluate user input
            switch (choice) {
                //checking withdrawal
                case 1:
                    System.out.println("How much would you like to withdraw from Checking?");
                    amount = Double.parseDouble(scan.nextLine());
                    checkingAcct.withdrawal(amount);
                    break;
                //savings withdrawal
                case 2:
                    System.out.println("How much would you like to withdraw from Savings?");
                    amount = Double.parseDouble(scan.nextLine());
                    savingsAcct.withdrawal(amount);
                    break;
                //checking deposit
                case 3:
                    System.out.println("How much would you like to deposit into Checking?");
                    amount = Double.parseDouble(scan.nextLine());
                    checkingAcct.deposit(amount);
                    break;
                //savings deposit
                case 4:
                    System.out.println("How much would you like to deposit into Savings?");
                    amount = Double.parseDouble(scan.nextLine());
                    savingsAcct.deposit(amount);
                    break;
                //checking print balance
                case 5:
                    System.out.println(checkingAcct.toString());
                    break;
                //savings print balance
                case 6:
                    System.out.println(savingsAcct.toString());
                    break;
                //savings add interest
                case 7:
                    savingsAcct.annual_interest();
                    break;
            }

        } while (choice != 8);
    }
}
