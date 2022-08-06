 import java.util.*;
public class Account {
    private int id = 0 ;
    private double balance = 500;
    private double Intrestrate = 7 ;
    private String datecreated;

    Account()
    {
        System.out.println("The default Account is created having id : " +id+ " , Balance of Rupees : " +balance+ " and the Annual Intrest rate is : " + Intrestrate );
    }
    Account(int id , double balance)
    {
        this.id = id ;
        this.balance = balance;
    }
    public int getId()
    {
        return id ;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setDatecreated(String datecreated)
    {
        this.datecreated = datecreated ;
    }
    public String getdatecreated()
    {
        return datecreated ;
    }
    public float getmonthlyintrestrate()
    {
        float monthlyintrestrate = (float)Intrestrate/12;
        return monthlyintrestrate ;
    }
   public float getmonthlyintrest()
   {
       float monthlyintrest = (float)(balance * getmonthlyintrestrate() * 1)/100;
       return monthlyintrest ;
   }
   public int Withdraw(int withdraw)
   {
       if(balance<withdraw)
       {
           System.out.println("Please check the Withdrawl amount ");
       }
       else if(balance == withdraw)
       {
           System.out.println("The amount Present in the balance is 00.00");
       }
       else
       {
           System.out.println("The Amount Withdrawn is : " + withdraw);

       }
       return 0;
   }
   public int Deposit( int deposit)
   {
       System.out.println("The Total Balance in the account is  : " +(balance + deposit) );
       return 0 ;
   }
}
