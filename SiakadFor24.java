import java.util.Scanner;

public class SiakadFor24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        // Perulangan untuk 10 mahasiswa
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            // Menentukan nilai tertinggi
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            // Menentukan nilai terendah
            if (nilai < terendah) {
                terendah = nilai;

            // Cari siswa lulus dan tidak
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
           
            }
        }

        // Menampilkan hasil
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
    }
}
