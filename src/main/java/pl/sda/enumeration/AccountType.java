package pl.sda.enumeration;

public enum AccountType {

    LOAN("ln_ac", true),
    CREDIT("crdt", true),
    DEBIT("dbt", true);

    private final String shortName;
    private final boolean active;

    AccountType(String shortName, boolean active) {
        this.shortName = shortName;
        this.active = active;
    }

    public String introduceAccount() {
        return "Hi, I am a " + shortName + " and I am active";
    }

    public String getShortName() {
        return shortName;
    }

    public boolean isActive() {
        return active;
    }
}
