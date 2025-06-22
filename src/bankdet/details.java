package bankdet;

public class details {
    private int accountname;

    private String holdername;

    private double balance;

    public details(String holdername, int accountname) {
        this.holdername = holdername;
        this.accountname = accountname;
    }

    public void depositmoney(double money){
        if (money <= 0){
            System.out.println("invalid");
        }
        else {
            balance += money;
        }
    }
    public double withdrawmoney(double money){
        if (balance >= money){
            balance -= money;
        }
        else if (money <= 0){
            System.out.println("invalid");
        }
        else {
            money = balance;
            balance = 0;
        }
        return money;
    }
}
