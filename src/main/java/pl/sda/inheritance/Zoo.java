package pl.sda.inheritance;

public class Zoo {

    private static String dupa = "dupa";

    public static void main(String[] args) {
        Animal simba = new Lion("simba");
        System.out.println(simba.getSound());
    }
}
