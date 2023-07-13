
// import java util Scanner
import java.util.Scanner;

public class IdentityUser {

    // create object from Scanner Class
    Scanner userInput = new Scanner(System.in);

    // method
    public void getIdentityUser() {

        String fullName = ""; // harus diinisialisasikan, agar program tidak error.
        // kenapa harus? agar dapat diupdate dalam looping.
        // inisialisasi adalah standard hukum dasar dalam java.


        // assignment variable
        boolean temp; // Variabel temp digunakan untuk memeriksa apakah nama hanya terdiri dari huruf, dan jika tidak,
                        // pengguna akan diminta untuk memasukkan ulang. Setelah validasi berhasil,
                        // program akan mencetak pesan selamat datang dengan nama lengkap pengguna.


        temp = fullName.matches("[a-zA-Z ]+"); // harus boolean karena, akan dimasukan ke dalam seleksi loop.
                                // mengapa setelah [a-zA-Z ], mengapa setelah 'Z' diberi space?
                                // karena untuk memberikan space kedalam output/hasil
                                // jika input nama, misalkan: "Jon Doe"
                                // maka akan muncul output: "Jon Doe"
                                // NAMUN, jika tidak memilki space '[a-zA-Z]' setelah 'Z' tidak dispace maka,
                                // output akan: "Jon"


        // keyword <.matches> disini, digunakan untuk memeriksa apakah yang diinputkan oleh user adalah huruf atau bukan.
        // jika huruf maka program akan dieksekusi,
        // jika selain huruf, maka program akan diulangi.

        // create selection
        // selagi, jika user memasukan nama dengan karakter huruf saja, maka program akan terus berjalan
        // jika-tidak, maka program akan mengulang dan meminta nama user kembali.

        while (!temp) {

            System.out.print("Masukkan nama: ");
            fullName = userInput.nextLine(); // fullName digunakan untuk menyimpan nama lengkap yang dimasukkan
                                                // oleh user menggunakan nextLine().


            temp = fullName.matches("[a-zA-Z ]+"); // menambahkan ke loop, agar dapat terupdate didalam looping.
                                                        // harus bertipe data boolean untuk memasukannya kedalam sebuah if-statement,
                                                        // karena boolean diidentikKan dengan tipe data logika/seleksi


            // Jika User tidak memasukan Input nama terdapat karakter lain selain Huruf. contoh: "Jonny 99XXX",
            // maka akan error dan muncul pesan.

            if (!temp) {
                System.out.println("Maaf, nama hanya boleh berupa huruf saja.");
            }

        }

        System.out.println("Selamat Datang, " + fullName);

    }

}