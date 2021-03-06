
public class CheckingAccount extends Account {

    static private double MinBalance = 100;
    static private double Fee = 10;

    public CheckingAccount(String fname, String lname, double cb) {
        super(fname, lname, cb);
    }

    @Override
    public double DebitTransaction(double debitAmount) {

        CurBalance-=debitAmount;
        ChargeFee();
        return CurBalance;
    }
    
    @Override
    public double CreditTransaction(double creditAmount) {

        CurBalance+=creditAmount;
        ChargeFee();
        return CurBalance;
    }

    private void ChargeFee() {
        if (CurBalance < MinBalance) {
            CurBalance -= 10;
        }
    }

    public static void main(String[] args) {

        CheckingAccount ch1 = new CheckingAccount("Steve", "Jobs", 50);
        System.out.println(ch1);

        ch1.DebitTransaction(0.25);
        System.out.println(ch1);

        ch1.CreditTransaction(7.00);
        System.out.println(ch1);

        ch1.CreditTransaction(1000000);
        System.out.println(ch1);
    }

}
