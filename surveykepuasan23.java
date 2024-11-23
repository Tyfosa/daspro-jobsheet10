import java.util.Scanner;

public class surveykepuasan23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);

        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;
        int[][] hasilSurvey = new int[jumlahResponden][jumlahPertanyaan];

        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Input hasil survey untuk responden ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Nilai untuk pertanyaan " + (j + 1) + ": ");
                hasilSurvey[i][j] = sc23.nextInt();
            }
        }

        System.out.println("\nRata-rata nilai untuk setiap responden:");
        for (int i = 0; i < jumlahResponden; i++) {
            double totalResponden = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalResponden += hasilSurvey[i][j];
            }
            System.out.println("Responden ke-" + (i + 1) + ": " + totalResponden / jumlahPertanyaan);
        }

        System.out.println("\nRata-rata nilai untuk setiap pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                totalPertanyaan += hasilSurvey[i][j];
            }
            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + totalPertanyaan / jumlahResponden);
        }

        double totalKeseluruhan = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += hasilSurvey[i][j];
            }
        }
        System.out.println("\nRata-rata nilai keseluruhan: " + totalKeseluruhan / (jumlahResponden * jumlahPertanyaan));

    }
}
