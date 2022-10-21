public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        System.out.println(b.getbalance());
        b.deposit(1000);
        b.deposit(500);
        System.out.println(b.getbalance());
        b.withdraw(100);
        System.out.println(b.getbalance());
    }
}
