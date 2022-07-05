package pl.sda.generics.animal;

public class HouseMain {

    public static void main(String[] args) {
        Animal cat = new Cat("Klaczek");
        Animal dog = new Dog("Burek");
        Animal pig = new GuineaPig("Swinia");

        House house = new House();
        house.addAnimal(cat);
        house.addAnimal(dog);
        house.addAnimal(pig);

        System.out.println("3 animals added");

        System.out.println("################");
        System.out.println("################");
        house.addAnimal(cat);
    }
}
