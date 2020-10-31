
public class Account {

    protected String FirstName, LastName;
    protected double CurBalance;

    public Account(String fname, String lname, double cb) {

        FirstName = fname;
        LastName = lname;
        CurBalance = cb;

    }

    public String getAccType() {
        return this.getClass().getName();
    }

    public double DebitTransaction(double debitAmount) {

        CurBalance -= debitAmount;
        return CurBalance;
    }

    public double CreditTransaction(double creditAmount) {

        CurBalance += creditAmount;
        return CurBalance;
    }

    @Override
    public String toString() {

        return "Account name: " + FirstName + " " + LastName + ", Account Type: " + getAccType() + ", Balance: " + String.format("%.2f", CurBalance);
    }

    public static void main(String[] args) {

        Account ac1 = new Account("John", "Smith", 100);
        System.out.println(ac1);
        
        ac1.DebitTransaction(30.25);
        System.out.println(ac1);
        
        ac1.CreditTransaction(10.10);
        System.out.println(ac1);

    }
}
