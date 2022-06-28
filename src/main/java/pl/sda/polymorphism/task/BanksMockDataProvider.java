package pl.sda.polymorphism.task;

public class BanksMockDataProvider implements BanksDataProvider {

    @Override
    public Bank getBank() {
        return new Bank("ING", 1000000);
    }
}
