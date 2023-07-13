
import java.util.Scanner;

public class NamaBarang {

    // Create Object From Scanner Class
    Scanner userInput = new Scanner(System.in);

    public void Menu() {

        int repeatCount = 30;
        String samaDengan = "=".repeat(repeatCount);
        System.out.println(samaDengan);

        System.out.println("    ~Pilih Menu~    ");
        System.out.println(samaDengan);

        System.out.println("1. Belanja ");
        System.out.println("2. Harga ");
        System.out.println("3. Pembayaran");
        System.out.println("4. Keluar");

    }

    public void seleksiMenu() {

        

        int repeatCount = 40;
        String samaDengan = "=".repeat(repeatCount);



    }


//    public static void main(String[] args) {
//        NamaBarang listBarang = new NamaBarang();
//        listBarang.Menu();
//
//        int repeatCount = 30;
//        String samaDengan = "=".repeat(repeatCount);
//        System.out.println(samaDengan);
//
//        listBarang.listBarang();
//    }

}
