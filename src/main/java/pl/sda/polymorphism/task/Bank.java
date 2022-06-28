package pl.sda.polymorphism.task;

public class Bank {

    private String name;
    private int numberOfClients;

    public Bank(String name, int numberOfClients) {
        this.name = name;
        this.numberOfClients = numberOfClients;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }
}
