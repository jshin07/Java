import java.util.Random;

public class BankAccount{
    private String accountNumber;
    private long checkingBal;
    private long savingBal;
    private static int numAccounts =0;
    private static long totalRevenue= 0;
    private static Random rand = new Random();


// BankAccount that takes checking and saving which will have accountNumber, checkingBal, savingBal, totalRevenue, and numAccounts
    public BankAccount(long checking, long saving){
        accountNumber = BankAccount.genAccoutNum();
        checkingBal = checking;
        savingBal = saving;
        totalRevenue= checkingBal+ savingBal;
        numAccounts++;
    }

// When new BankAccount gets opened with no parameter
    public BankAccount(){
        this(0,0);
    }

// When new BankAccount gets opened with only one parameter-- it will take as checking, and it goes to the full scope as the first method.
    public BankAccount(long checking){
        this(checking,0);
    }

// Getter: To return numAccounts
    public Integer getNumAccounts(){
        return numAccounts;
    }

// To generate account Number. It returns integer which will be converted to a string.
    private static String genAccoutNum(){
        return Integer.toString(rand.nextInt(1000000000)+ 1000000000);
    }

// Getter: Returns account Number from genAccoutNum method. //accountNumber = BankAccount.genAccoutNum();
    public String getAccountNum(){
        return accountNumber;
    }

// Setter: set checking balance when it takes one parameter.
    public void setCheckingBal(long checking){
        checkingBal=checking;
    }

// Setter: set saving balance when it takes one parameter.
    public void setSavingBal(long saving){
        savingBal = saving;
    }

// Getter: returns checking balance.
    public long getCheckingBal(){
        return checkingBal;
    }

// Getter: returns saving balance.
    public long getSavingBal(){
        return savingBal;
    }

// Will reset checking balance and saving balance AFTER it gets it's saving or chekcing balnce + new amount to be deposited
// Updates totalRevenue
    public void deposit(long checking, long saving){
        // checkingBal +=checking;
        // savingBal += saving;
        this.setCheckingBal(this.getCheckingBal()+ checking);
        this.setSavingBal(this.getSavingBal()+saving);
        totalRevenue += checking + saving;
    }

// When it gets one amount as parameter, it gets deposited as checking.
    public void deposit(long checking){
        this.deposit(checking,0);
    }

//
    public void withdrawl(long checking, long saving){
        if(this.getCheckingBal() < 1 || this.getSavingBal() <1){
            System.out.println("In sufficient balance");
            return;
        }
        long total = this.getSavingBal()+ this.getCheckingBal();
        this.setSavingBal(this.getSavingBal()-saving);
        this.setCheckingBal(this.getCheckingBal()-checking);

        totalRevenue -=total;
    }

    public void withdrawl(long checking){
        this.withdrawl(checking,0);
    }

    public void show(){
        long total = this.getCheckingBal()+ this.getSavingBal();
        System.out.println("***********************************");
        System.out.println("Automatically generated account number: " + this.getAccountNum() );
        System.out.println("Checking Balance: " + this.getCheckingBal());
        System.out.println("Saving Balance: " + this.getSavingBal());
        System.out.println("Total Balance: " + total);
        System.out.println("Total number of accounts thus far: " + this.getNumAccounts());
    }




}
