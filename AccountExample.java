class BalanceInsufficientException extends Exception{
    BalanceInsufficientException(){};
    BalanceInsufficientException(String message){
        super(message);
    }
}

class Account{
    private long balance;

    Account() {}

    long getBalance(){
        return balance;
    }

    void deposit( int money ){
        balance += money;
    }

    void withdraw(int money) throws BalanceInsufficientException {
        if(balance < money){
            throw new BalanceInsufficientException("잔고 부족" + (money-balance) + " 모자람" );
        }
        balance -= money;
    }

}

public class AccountExample{
    public static void main(String[] args){
        Account account = new Account();

        //예금하기
        account.deposit(30000);
        System.out.println("예금액 : " + account.getBalance());

        //출금하기
        try{
            account.withdraw(30001);
        } catch (BalanceInsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
            System.out.println();
            e.printStackTrace();
        }
    }
}