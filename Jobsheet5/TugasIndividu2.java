import java.util.Scanner;

public class TugasIndividu2 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    String username = "surya";
    int password = 123;

    System.out.println("Masukan Username dan Password");
    System.out.println("Username :");
    String user = sc.nextLine();
    System.out.println("Password");
    int pass = sc.nextInt();
    
    if (user.equals(username) && pass == password) {
        System.out.println("Anda Berhasil Login");
    }else{
        System.out.println("Harap cek kembali username dan password anda");
    }
}
}
