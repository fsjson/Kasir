
public class ApplicationCashier {

    public static void main(String[] args) {

        // create Object from Class


        // Identity Class
        System.out.println("==============================");
        System.out.println("\n");

        IdentityUser appUserIdentity = new IdentityUser();
        appUserIdentity.getIdentityUser(); // this line, will call the method

        int repeatCount = 7;
        String line = "\n".repeat(repeatCount);
        System.out.println(line);


        // NamaBarang Class
        NamaBarang listBarang = new NamaBarang();
        listBarang.Menu();

        int repeatCountTwo = 30;
        String samaDengan = "=".repeat(repeatCountTwo);
        System.out.println(samaDengan);

        listBarang.listBarang();

        System.out.println(line);

        // HargaBarang Class

        HargaBarang hargaBarang = new HargaBarang();
        hargaBarang.listHarga();
        hargaBarang.seleksi();

    }


}

// NEXT:

//
//    private void namaBarang() {
//
//    }

//
//    private void hargaBarang() {
//
//    }

//    private void jumlahBarang() {
//
//    }

//    private void diskon() {
//
//    }

//    private void totalHarga() {
//
//    }

//    private void totalBayar() {
//
//    }
//