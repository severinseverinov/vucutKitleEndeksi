import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double index,boy;
        int kilo;
        Scanner inp=new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy=inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo=inp.nextInt();

        index = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : "+index+"dir.");
    }
}
