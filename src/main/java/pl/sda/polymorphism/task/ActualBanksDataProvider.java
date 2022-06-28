package pl.sda.polymorphism.task;

public class ActualBanksDataProvider implements BanksDataProvider {

    @Override
    public Bank getBank() {
        // tutaj faktycznie strzelamy do serwisu w BANKU i zwracamy faktyczne dane
        return null;
    }
}
