import java.util.Scanner;

public class PemilihanPercobaan127 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);

        System.out.println("Masukan Angka: ");

        String hasil;
        int angka = input27.nextInt();

        hasil = (angka % 2 == 0) ? " Bilangan Genap " : " Bilangan Ganjil ";

        System.out.println(angka + "adalah" + hasil);
    }
}
