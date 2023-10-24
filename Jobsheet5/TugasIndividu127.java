import java.util.Scanner;

public class TugasIndividu127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jarak;

        System.out.println(" Masukan jarak: ");
        jarak= sc.nextInt();
        if (jarak <= 5) {
            System.out.println(" Gunakan melee Weapon");
        } else if (jarak > 5) {
            System.out.println("Gunakan Ranged Weapon");
        }
    }
}
