
public class ApplicationCashier {

    public static void main(String[] args) {

        // create Object from Class

        // Identity Class
        int repeatCount = 40;
        String samaDengan = "=".repeat(repeatCount);
        System.out.println(samaDengan);
        System.out.println("\n");

        IdentityUser appUserIdentity = new IdentityUser();
        appUserIdentity.getIdentityUser(); // this line, will call the method

        int repeatCountTwo = 2;
        String line = "\n".repeat(repeatCountTwo);
        System.out.println(line);

        // NamaBarang Class
        NamaBarang listBarang = new NamaBarang();
        listBarang.Menu();
        listBarang.seleksiMenu();

        System.out.println(samaDengan);
        System.out.println(line);

        // HargaBarang Class
        HargaBarang hargaBarang = new HargaBarang();
        hargaBarang.beliBarang();


    }


}