import  java.util.* ;
public class mains {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Account A = new Account();
        System.out.println("Enter the id : ");
        int id = sc.nextInt();
        System.out.println("Enter the balance : ");
        double balance = sc.nextDouble();
        System.out.println("Enter the Intrest rate : ");
        double intrestrate = sc.nextDouble();
        System.out.println("Enter the Date At which the account was created : ");
        String datecreated = sc.next();
        Account A1 = new Account( id ,  balance);
        System.out.println("the id is : " + A1.getId());
        System.out.println("The Balance in the Account is : " +A1.getBalance() );
        System.out.println("The Date at which the Account was created : " +A1.getdatecreated());
        System.out.println("The Monthly Intrest rate is : " +A1.getmonthlyintrestrate());
        System.out.println("The Monthly intrest rate is : " +A1.getmonthlyintrest());
        System.out.println("Enter the amount you want to withdraw : " );
        int withdraw = sc.nextInt();
        A1 . Withdraw(withdraw);
        System.out.println("Enter the amount you want to deposit : ");
        int deposit = sc.nextInt();
        A1.Deposit(deposit);




    }
}
