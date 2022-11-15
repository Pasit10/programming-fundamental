import java.util.ArrayList;

public class AcctList_65607 {
    public static void main(String[] args) {
        ProFun12_AcctList clients = new ProFun12_AcctList();
        String startWith = "c";
        System.out.println("List of account name start with " + startWith.toUpperCase());
        //System.out.println(clients.filterName(startWith.toUpperCase()));
        System.out.println("-----------------------------------");
        for(ProFun12_Account x : clients.filterName(startWith.toUpperCase())){
            System.out.println(x);
        }
        int bound = 1400;
        System.out.println("-----------------------------------");
        System.out.println("List of account balance less than " + bound);
        //System.out.println(clients.balanceLessThan(bound));
        for(ProFun12_Account x : clients.balanceLessThan(bound)){
            System.out.println(x);
        }
        System.out.println("-----------------------------------");
    }
}

class ProFun12_AcctList {
    ArrayList<ProFun12_Account> acctList;

    ProFun12_AcctList() {
        acctList = new ArrayList<>();
        acctList.add(new ProFun12_Account(1, "Cactus", 1000));
        acctList.add(new ProFun12_Account(2, "Celsia", 500));
        acctList.add(new ProFun12_Account(3, "Clove pink", 1500));
        acctList.add(new ProFun12_Account(4, "Crown Imperial", 900));
        acctList.add(new ProFun12_Account(5, "Daffodil", 1200));
        acctList.add(new ProFun12_Account(6, "Daisy", 1700));
        acctList.add(new ProFun12_Account(7, "Dandelion", 500));
        acctList.add(new ProFun12_Account(8, "Dittany", 600));
    }

    ArrayList<ProFun12_Account> filterName(String c) {
        ArrayList<ProFun12_Account> result = new ArrayList<>();
        for(int i = 0;i < acctList.size();i++){
            if(acctList.get(i).name.charAt(0) == c.charAt(0)){
                result.add(acctList.get(i));
            }
        }
        return result;
    }

    ArrayList<ProFun12_Account> balanceLessThan(int b) {
        ArrayList<ProFun12_Account> result = new ArrayList<>();
        for(int i = 0;i < acctList.size();i++){
            if(acctList.get(i).balance < b){
                result.add(acctList.get(i));
            }
        }
        return result;
    }
}

class ProFun12_Account{
    int id;
    String name;
    int balance;
    ProFun12_Account(int id,String name,int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String toString(){
        return String.format("Account %s(%d) balance is %d",name,id,balance);
    }
}