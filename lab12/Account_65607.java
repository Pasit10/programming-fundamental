public class Account_65607 {
    public static void main(String[] args) {
        Account acct1 = new Account(1, "melon", 1500);
        Account acct2 = new Account(2, "rose apple", 2200);
        System.out.println(acct1.credit(700)); // 2200
        System.out.println(acct2.debit(300)); // 1900
        System.out.println(acct1.transferTo(acct2, 1000)); // 2200
        System.out.println(acct1.credit(-50)); // 1200
        System.out.println(acct2.debit(-50)); // 2900
        System.out.println(acct1);
        System.out.println(acct2);
    }
}

class Account{
    int id;
    String name;
    int balance = 0;

    Account(int id,String name,int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    int newbalance = balance;

    int getID(){
        return id;
    }
    String getName(){
        return name;
    }
    int credit(int amount){
        if(amount >= 0){
            balance += amount;
            return balance;
        }
        return balance;
    }
    int debit(int amount){
        if(amount >= 0){
            balance -= amount;
            return balance;
        }
        return balance;
    }
    int transferTo(Account acct,int amount){
        if(balance  >= amount && amount >= 0){
            acct.balance += amount;
            balance -= amount;
            return balance;
        }
        return balance;
    }
    public String toString(){
        return String.format("Account %s(%d) balance is %d",name,id,balance);
    }
}