import java.util.Scanner;

public class KafeDoWhile24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaPelanggan;
        int kopi, teh, roti, totalHarga;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk berhenti): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                break;
            }

            System.out.print("Masukkan jumlah kopi yang dibeli: ");
            kopi = sc.nextInt();
            System.out.print("Masukkan jumlah teh yang dibeli: ");
            teh = sc.nextInt();
            System.out.print("Masukkan jumlah roti yang dibeli: ");
            roti = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer

            totalHarga = kopi * hargaKopi + teh * hargaTeh + roti * hargaRoti;
            System.out.println("Total harga untuk " + namaPelanggan + " adalah: Rp " + totalHarga);
        } while (true);

        System.out.println("Transaksi selesai.");
    }
}
