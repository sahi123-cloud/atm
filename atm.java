import java.util.*;
class ATMmachine{
    static void withdraw(int amount,int account){
    System.out.println("Enter amountto withdraw");
    if(amount>account){
        System.out.println("insufficient balance");
    }
    else{
        account=account-amount;
        System.out.println("balance =" +account);
    }
    }
    static void deposit(int amount,int account){
        account=account+amount;
        System.out.println("balance ="+account);
    }
    static void balance(int account){
    System.out.println(account);
    }
}
class atm{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("1.with Draw");
        System.out.println("2.Deposit");
        System.out.println("3.check balance");
        int choice=s.nextInt();
        ATMmachine a=new ATMmachine();
        int account=1000000;
        switch(choice){
            case 1:
                  System.out.println("enter amount");
                  int amount=s.nextInt();
                   a.withdraw(amount,account);
            case 2:
                 System.out.println("enter amount");
                  int amoun=s.nextInt();
                   a.deposit(amoun,account);
            case 3:
                   a.balance(account);
        }
        
    }
}