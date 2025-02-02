package exam;

/*
* Write a class bank, containing data member: Name of Depositor,
*  A/c type, Type of A/c, Balance amount. Member function: To assign initial value,
* to deposit an amount, to withdraw an amount after
* checking the balance (which should be greater than Rs. 500), To display name & balance.
*
*
* */
public class Bank2 {
    private String depositor_name;
    private String  ac_type;
    private int balance;
    private int depositingMoney;

    Bank2(String dn,String ac)
    {
        depositor_name = dn;
        ac_type = ac;


    }
    public void setBalance(int b)
    {
        System.out.println("this is the required balance");
        balance = b;

    }
    public int getBalance()
    {
        return balance;

    }
    public void deposit (int d) {

        depositingMoney = d;
        balance = balance + d;
        System.out.println("deposited money" + d);

    }
    public void withdraw(int amount)
    {
        System.out.println("total money"+amount);
        if(amount>500)
        {
            balance = balance - amount;
            System.out.println("withdrawn amount "+balance);
        }
        else {
            System.out.println("not ENOUGH to be withdrawn");
        }
    }
    public static void main(String[] args)
    {
        Bank2 obj1 = new Bank2("Ritika","icici");
        obj1.setBalance(50000);
        obj1.deposit(150000);
        obj1.withdraw(6000);



    }
}

