import java.util.Scanner;

public class HargaBarang {

    Scanner scanner = new Scanner(System.in);

    public void listHarga() {
        int repeatCount = 40;
        String samaDengan = "=".repeat(repeatCount);
        System.out.println(samaDengan);
        System.out.println("\t\t\t~List Harga~\t");
        System.out.println(samaDengan);

        System.out.println("Silahkan pilih barang dari menu:");
        System.out.println("1. ViVo X80 pro");
        System.out.println("2. ViVo X80");
        System.out.println("3. iPhone 14 pro");
        System.out.println("4. iPhone 13 pro");
        System.out.println("5. Samsung s20 Ultra flagship");

    }

    public void seleksiHarga() {

        String vivo1 = "ViVo X80 pro";
        //System.out.println(vivo1);
        String vivo2 = "ViVo X80";
        //System.out.println(vivo2);
        String iPhone1 = "iPhone 14 pro";
        //System.out.println(iPhone1);
        String iPhone2 = "iPhone 13 pro";
        //System.out.println(iPhone2);
        String samsung = "Samsung s20 Ultra flagship";
        //System.out.println(samsung);

        int repeatCount = 40;
        String samaDengan = "=".repeat(repeatCount);
        System.out.println(samaDengan);

        System.out.print("Masukan Pilihan Untuk Melihat Harga:");
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1 ->
                // Process for ViVo X80 pro
                    System.out.println("Harga "+ vivo1 + ": Rp10.000.000,00");
            case 2 ->
                // Process for ViVo X80
                    System.out.println("Harga " + vivo2 + ": Rp10.000.000,00");
            case 3 ->
                // Process for iPhone 14 pro
                    System.out.println("Harga " + iPhone1 + ": Rp19.000.000,00");
            case 4 ->
                // Process for iPhone 13 pro
                    System.out.println("Harga " + iPhone2 + ": Rp17.999.999,00");
            case 5 ->
                // Process for Samsung s20 Ultra flagship
                    System.out.println("Harga " + samsung +": RpS10.000.000,00");
            default -> System.out.println("Input tidak valid");
        }
    }

    public static void main(String[] args) {
        HargaBarang hargaBarang = new HargaBarang();
        hargaBarang.listHarga();
        hargaBarang.seleksiHarga();
    }
}
