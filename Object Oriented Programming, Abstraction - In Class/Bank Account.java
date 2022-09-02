// your code goes here
class BankAccount{
    int balance;
    String name;

    BankAccount(int balance, String name){
        this.balance = balance;
        this.name = name;
    }
    public boolean depositFund(int fund){
        this.balance +=fund;
        return false;
    }

    public boolean withdrawFund(int fund){
        this.balance -=fund;
        return false;
    }
}
