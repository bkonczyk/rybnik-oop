package pl.sda.enumeration;
//Stwórz klasę enum `PackageSize` ze stałymi `SMALL`, `MEDIUM`, `LARGE`.
//Enum powinien przyjmować w konstruktorze dwa parametry:
//* minimalny rozmiar paczki w `cm`
//* maksymalny rozmiar paczki w `cm`
//
//Dodatkowo enum `PackageSize` powinien zawierać metodę statyczną `getPackageSize`,
//która przyjmuje na wejściu minimalny i maksymalny rozmiar paczki, a jako rezultat powinna zwracać konkretny obiekt
//`PackageSize` na podstawie przekazanego rozmiaru paczki.

public enum PackageSize {
    SMALL(1, 10),
    MEDIUM(11, 30),
    LARGE(31, 99);

    private final int min;
    private final int max;

    PackageSize(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static PackageSize getPackageSize(int maxSize) {
        if (maxSize > LARGE.max) {
            throw new IllegalArgumentException("The package is too big");
        }
        if (maxSize <= SMALL.max) {
            return SMALL;
        }
        if (maxSize <= MEDIUM.max) {
            return MEDIUM;
        }
        return LARGE;
    }

    @Override
    public String toString() {
        return "PackageSize{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
}
