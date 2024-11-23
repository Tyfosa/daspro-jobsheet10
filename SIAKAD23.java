import java.util.Scanner;

public class SIAKAD23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc23.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc23.nextInt();

        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalpersiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc23.nextInt();
                totalpersiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalpersiswa / jumlahMatkul);
        }

        System.out.println("\n===================");
        System.out.println("Rata-rata nilai setiap mata kuliah:");

        for (int j = 0; j < jumlahMatkul; j++) {
            double totalpermatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalpermatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j + 1) + ": " + totalpermatkul / jumlahSiswa);
        }

        
    }
}
