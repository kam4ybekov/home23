public class BankAccount {
    private double amount;

    public BankAccount(double initialAmount) {
        this.amount = initialAmount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            amount += sum;
            System.out.println("Вы внесли " + sum + " на свой счет. Новый баланс: " + amount);
        } else {
            System.out.println("Неверная сумма для внесения.");
        }
    }

    public void withdraw(double sum) throws LimitException {
        if (sum > 0) {
            if (sum <= amount) {
                amount -= sum;
                System.out.println("Dы сняли " + sum + " со своего счета. Новый баланс: " + amount);
            } else {
                throw new LimitException("Недостаточно средств на счете.", amount);
            }
        } else {
            System.out.println("Неверная сумма для снятия. ");
        }
    }
}

