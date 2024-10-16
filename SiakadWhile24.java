import java.util.Scanner;

public class SiakadWhile24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai, jml, i = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        // Perulangan while sesuai dengan jumlah mahasiswa
        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid, masukkan ulang.");
                continue;
            }

            if (nilai > 80) {
                System.out.println("Kategori: A");
            } else if (nilai > 73) {
                System.out.println("Kategori: B+");
            } else if (nilai > 65) {
                System.out.println("Kategori: B");
            } else if (nilai > 60) {
                System.out.println("Kategori: C+");
            } else if (nilai > 50) {
                System.out.println("Kategori: C");
            } else if (nilai > 39) {
                System.out.println("Kategori: D");
            } else {
                System.out.println("Kategori: E");
            }
            i++;

        // Pengelompokan nilai
        if (nilai <= 100 && nilai > 80) {
            System.out.println("Nilai mahasiswa ke-" + i + " adalah A");
            System.out.println("Bagus, pertahankan nilainya!");
        }
        
        }
    }
}
