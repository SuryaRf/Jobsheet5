import java.util.Scanner;

public class PemilihanPercobaan227 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);

        System.out.println("Nilai UAS : ");
        float uas = input27.nextFloat();
        System.out.println("Nilai UTS : ");
        float uts = input27.nextFloat();
        System.out.println("Nilai Kuis : ");
        float kuis = input27.nextFloat();
        System.out.println("Nilai Tugas : ");
        float tugas = input27.nextFloat();

        float total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) +(tugas * 0.2f);
        String massege = total < 65 ? "Remidi" : "Tidak Remidi";
    }
}
