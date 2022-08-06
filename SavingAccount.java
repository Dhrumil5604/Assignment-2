package part2;

class SavingAccount extends Account1
{
    SavingAccount(double a)
    {
        amount = a;
        balance -= amount;
    }
    public String toString()
    {
        if (balance >= 3000)
        {
            return "The balance left after withdrawal of Rs " + amount + " is Rs. " + balance;
        }
        else
        {
            return "Minimum balance of Rs. 3000 is required.";
        }
    }
}
class CheckingAccount extends Account1
{
    CheckingAccount(double am)
    {
        amount=am;
        balance-=amount;
    }
    public String toString()
    {
        System.out.println("Withdrawal successful");
        return "Now the balance left is Rs. "+balance+" after the withdrawal of Rs. "+amount;
    }
}
