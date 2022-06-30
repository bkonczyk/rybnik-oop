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

    public void setName(String newName) {
        if (newName.length() < 3) {
            throw new IllegalArgumentException("Name length cannot be shorter than 3 characters");
        }
        name = newName;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }
}
