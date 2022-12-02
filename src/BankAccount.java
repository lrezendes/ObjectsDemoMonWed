public class BankAccount {
    private double balance;
    private float interestRate;

    public BankAccount(){
        interestRate = 0.02f;
        }
        public double addInterest() {
           var interest = balance * interestRate;
           balance += interest;
           return balance;
           //mutator
       }

       public void deposit(double amount) {
           balance = balance + amount;
           //mutator
       }

       public boolean withdraw(double amount) {
           if (balance < amount)
               return false;
           balance -= amount;
           return true;
           //mutator
       }

       public double checkBalance() {
           return balance;
           //accessor
       }

}
