
import java.util.Scanner;

public class NamaBarang {

    // Create Object From Scanner Class
    Scanner userInput = new Scanner(System.in);

    // import Class
    HargaBarang hargaBarang = new HargaBarang();

    public void Menu() {

        int repeatCount = 40;
        String samaDengan = "=".repeat(repeatCount);
        System.out.println(samaDengan);

        System.out.println("\t\t\t~Pilih Menu~\t");
        System.out.println(samaDengan);

        System.out.println("1. Belanja langsung(tanpa liat harga) ");
        System.out.println("2. Liat Harga");
        System.out.println("3. Keluar");

    }

    public void listNamaBarang() {
        int repeatCount = 40;
        String samaDengan = "=".repeat(repeatCount);
        System.out.println(samaDengan);
        System.out.println("\t\t\t~List Barang~\t");
        System.out.println(samaDengan);

        System.out.print("Silahkan pilih barang dari menu:");

        System.out.print("\n");

        HargaBarang hargaBarang1 = new HargaBarang();
        for (String barang : hargaBarang1.hape) {
            System.out.println(barang);
        }
    }


    public void seleksiMenu() {

//        HargaBarang hargaBarang = new HargaBarang();

        int repeatCount = 40;
        String samaDengan = "=".repeat(repeatCount);
        System.out.println(samaDengan);

        System.out.print("Masukan Pilihan[1-3]: ");
        int inputPilihanUser = Integer.parseInt(userInput.nextLine()); // konversi ke interger

        while ( inputPilihanUser > 3){

            System.out.println("Masukan Pilihan[1-3]:");
            inputPilihanUser = Integer.parseInt(userInput.nextLine()); // konversi ke interger

        }


        switch (inputPilihanUser) {

            case 1 -> listNamaBarang();
            case 2 -> hargaBarang.seleksiHarga();
            case 3 -> {

                System.out.println("Terimakasih Sudah Berkunjung ;)");
                System.exit(0); // keluar

            } // memakai blok karena didalam <case> tidak ada inisialisasi

            default -> System.out.println("Input tidak valid");

        }
    }
}