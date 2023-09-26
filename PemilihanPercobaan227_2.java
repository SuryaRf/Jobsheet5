import java.util.Scanner;

public class PemilihanPercobaan227 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);

            System.out.println("Nilai UAS     : ");
            float uas = input27.nextFloat();
            System.out.println("Nilai UTS");
            float uts = input27.nextFloat();
            System.out.println("Nilai Kuis");
            float kuis = input27.nextFloat();
            System.out.println("Nilai Tugas");
            float tugas = input27.nextFloat();

            float total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) +(tugas * 0.2f);
            if (total > 80 && total <= 100) {
                System.out.println("A");
                
            } else if (total > 73 && total <=80){
                System.out.println("B+");

            }else if (total > 65 && total <=73){
                System.out.println("B");

            }else if (total >60 && total <= 65){
                System.out.println("C+");

            }else if (total > 50 && total <= 60){
                System.out.println("C");

            }else if (total > 39 && total <= 50){
                System.out.println("D");

            }else {
                System.out.println("E");
            }

            

    }
}
