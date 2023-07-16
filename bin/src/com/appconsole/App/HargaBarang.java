import java.util.Arrays;
import java.util.Scanner;

public class HargaBarang {

    // Scanner
    Scanner scanner = new Scanner(System.in);
    int userInput;
    String tanyaLagi;
    int getBarangUser;
    int getBerapaBarang;

    // variable
    int totalHarga;
    int repeatCount = 40;
    String samaDengan = "=".repeat(repeatCount);

    // penamaan variable dengan benda/merk hp beserta harga
    String[] hape = {
            "1. ViVo X80 pro",
            "2. ViVo X80",
            "3. iPhone 14 pro",
            "4. iPhone 13 pro",
            "5. Samsung s20 Ultra flagship"};
    String[] harga = {"Rp10.000.000,00", "Rp10.000.000,00", "Rp19.000.000,00", "Rp17.999.999,00", "Rp9.999.999,99"};

    int[] hargaPecahann = {10000000, 10000000, 19000000, 17999999, 9999999};

    public void seleksiHarga() {
        int repeatCount = 40;
        String samaDengan = "=".repeat(repeatCount);
        System.out.println(samaDengan);

        // Meng-loop array hape{}
        for (String item : hape) {
            System.out.println(item);
        }

        System.out.print("Masukan Pilihan Untuk Melihat Harga [1-5]: ");
        userInput = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println(samaDengan);

        // Validate user input
        if (userInput >= 1 && userInput <= 5) {
            System.out.println("Harga " + hape[userInput - 1] + " " + harga[userInput - 1]);
        } else {
            System.out.println("Input tidak valid");
        }

        System.out.println();
        System.out.print("Apakah ingin melihat harga barang lainnya (y/n): ");
        tanyaLagi = scanner.nextLine();
        System.out.println();

        while (tanyaLagi.equalsIgnoreCase("y")) {
            System.out.print("Masukan Pilihan Untuk Melihat Harga [1-5]: ");
            userInput = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.println(samaDengan);

            if (userInput >= 1 && userInput <= 5) {
                System.out.println("Harga " + hape[userInput - 1] + " " + harga[userInput - 1]);
            } else {
                System.out.println("Input tidak valid");
            }

            System.out.println();
            System.out.print("Apakah ingin melihat harga barang lainnya (y/n): ");
            tanyaLagi = scanner.nextLine();
            System.out.println();
        }
    }

    public void getTotalHarga() {
        if (getBarangUser >= 1 && getBarangUser <= 5) {
            totalHarga = getBerapaBarang * hargaPecahann[getBarangUser - 1];
        } else {
            return; // Exit the method if the input is not valid
        }

        System.out.println("Total Bayar: Rp" + totalHarga + ",00");
    }

    public void beliBarang() {
        System.out.println(samaDengan);
        System.out.println("~Silahkan Dibeli~");
//        System.out.println(Arrays.toString(hape) + "\n");

        System.out.print("Silahkan Pilih barang yang ingin dibeli[1-5]: ");
        getBarangUser = scanner.nextInt();
        System.out.print("\n");

        System.out.print("Masukan berapa barang yang mau dibeli: ");
        getBerapaBarang = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (getBarangUser >= 1 && getBarangUser <= 5) {
            System.out.println("Anda membeli: " + hape[getBarangUser - 1]
                    + "\n\t" + "Seharga: " + harga[getBarangUser - 1]);
        } else {
            System.out.println("Input tidak valid");
        }

        getTotalHarga();

        System.out.println(samaDengan);
        System.out.println("Xie-Xie!");
    }
}
