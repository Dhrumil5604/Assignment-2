package part2;

class pr4
{
    public static void main(String[] args)
    {
        Account1 a1=new Account1();
        Account1 a2=new Account1(225566,200000);
        a2.setdata(1289031,100000,5.6,"5-8-2022");
        System.out.println("Account Details: ");
        System.out.println("Balance : "+a2.balance);
        System.out.println("Annual Interest : "+a2.getAnn());
        System.out.println("Monthly Interest Rate : "+a2.getMonthlyInterestRate());
        System.out.println("Monthly Interest : "+a2.getMonthlyInterest());
        System.out.println("Account was created on : "+a2.getDt());
        a2.withdraw(12000);
        a2.deposit(15000);
        System.out.print("------------------------\n");
        SavingAccount a=new SavingAccount(100);
        CheckingAccount b=new CheckingAccount(25000);
        System.out.println("For Saving Account : ");
        System.out.println(a);
        System.out.print("------------------------\n");
        System.out.println("For Checking Account : ");
        System.out.println(b);
        System.out.println("preapred by trasadiya Dhrumil 21CE146");
    }
}
