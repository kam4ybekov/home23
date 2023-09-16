public class Main {
    public static void main(String[] args) {
        BankAccount clientAccount = new BankAccount(0.0);
        clientAccount.deposit(15000.0);

        try {
            while (true) {
                clientAccount.withdraw(6000.0);
            }
        } catch (LimitException e) {
            double remainingAmount = e.getRemainingAmount();
            System.out.println("На счете осталось: " + remainingAmount + " сом.");
        }
    }
}
