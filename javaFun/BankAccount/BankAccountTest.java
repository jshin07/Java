public class BankAccountTest{
    public static void main(String[] args) {
        // BankAccount jenny = new BankAccount(5000);
        // jenny.show();
        // jenny.withdrawl(4000);
        // jenny.showNumAccounts();
        // jenny.show();
        // jenny.deposit(1);
        // jenny.show();
        BankAccount leah = new BankAccount(500,1000);
        leah.show();
        leah.withdrawl(1,1);
        leah.show();
        leah.deposit(5,5);
        leah.show();


    }
}
