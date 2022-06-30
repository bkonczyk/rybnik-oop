package pl.sda.enumeration;

public class PackageSizeTest {

    public static void main(String[] args) {
        System.out.println(PackageSize.getPackageSize(2).name());
        System.out.println(PackageSize.getPackageSize(55).name());
    }
}
