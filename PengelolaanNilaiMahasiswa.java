import java.util.Scanner;

public class PengelolaanNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];

        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        double rataRata = hitungRataRata(nilaiMhs);
        System.out.println("Nilai rata-rata: " + rataRata);

        int nilaiTertinggi = cariNilaiTertinggi(nilaiMhs);
        int nilaiTerendah = cariNilaiTerendah(nilaiMhs);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);

        System.out.println("Semua nilai mahasiswa:");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }
    }

    public static double hitungRataRata(int[] nilaiMhs) {
        int total = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        return (double) total / nilaiMhs.length;
    }

    public static int cariNilaiTertinggi(int[] nilaiMhs) {
        int tertinggi = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
        }
        return tertinggi;
    }

    public static int cariNilaiTerendah(int[] nilaiMhs) {
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        return terendah;
    }
}
