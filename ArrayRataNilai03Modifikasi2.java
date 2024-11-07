import java.util.Scanner;

public class ArrayRataNilai03Modifikasi2 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int totalMhs = sc.nextInt();

        int[] nilaiMhs = new int[totalMhs];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jmlLulus = 0;
        int jmlTidakLulus = 0;

        for (int i = 0; i < totalMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] >= 70) {
                totalLulus += nilaiMhs[i];
               jmlLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jmlTidakLulus++;
            }
        }

        double rataLulus = (jmlLulus > 0) ? totalLulus / jmlLulus : 0;
        double rataTidakLulus = (jmlTidakLulus > 0) ? totalTidakLulus / jmlTidakLulus : 0;

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);

    }
}    