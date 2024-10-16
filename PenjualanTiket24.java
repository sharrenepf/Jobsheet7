import java.util.Scanner;

public class PenjualanTiket24 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // deklarasi variabel
        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;

        while (true) {
            System.out.println("Masukkan jumlah tiket yang dibeli ");
            System.out.println("(ketik 0 untuk selesai): ");
            int jumlahTiket = input.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan jumlah tiket yang benar.");
                continue;
            }

            double hargaTotal = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                double diskon = 0.15 * hargaTotal; // diskon 15% jika tiket lebih dari 10
                hargaTotal -= diskon;
            } else if (jumlahTiket > 4) {
                double diskon = 0.10 * hargaTotal; // diskon 10% jika tiket lebih dari 4
                hargaTotal -= diskon;
            }

            totalPenjualan += hargaTotal;
            totalTiketTerjual += jumlahTiket;

            System.out.println("Harga setelah diskon: Rp " + hargaTotal);
        }

        // output
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan tiket: Rp " + totalPenjualan);

        input.close();
    }
}
