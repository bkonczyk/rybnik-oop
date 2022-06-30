package pl.sda.oop_exercise;

public abstract class Person {

    private String name;
    private String address;

    public Person() {
        this.name = "";
        this.address = "";
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.name + " -> " + this.address;
    }
}

class Student2 extends Person {

    private int type;
    private int year;
    private int price;

    public Student2(int type, int year, int price) {
        this.type = type;
        this.year = year;
        this.price = price;
    }

    public Student2(String name, String address, int type, int year, int price) {
        super(name, address);
        this.type = type;
        this.year = year;
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Main {
    public static void main(String[] args) {
        Student2 student2 = new Student2("Andrzej", "Wejscherowo", 1, 2, 1000);
        System.out.println(student2);
    }
}
