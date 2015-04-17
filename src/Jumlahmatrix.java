
import java.util.Scanner;

class Jumlahmatrix {

    static int c, d, m, n;
    Scanner keyboard = new Scanner(System.in);

    void cetakmatrix(int F[][], int G[][], int e, int p) {
        int[][] Z = new int[e][p];
        System.out.println();
        System.out.println();
        System.out.println("Penjumlahan Matrix: ");
        System.out.println();
        System.out.println();
        for (int i = 0; i < Z.length; i++) {
            for (int j = 0; j < Z[i].length; j++) {
                Z[i][j] = F[i][j] + G[i][j];
                System.out.print(Z[i][j] + " ");
            }
            System.out.println();
        }
    }

    void inputmatrix() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Selamat datang di aplikasi penjumlahan matrix");
        System.out.println();
        System.out.println("karena syarat penjumlahan matrix adalah ");
        System.out.println();
        System.out.println("jumlah ordonya harus sama");
        System.out.println();
        firstloop:
        while (true) {
            System.out.print("Masukkan Jumlah Baris: ");
            m = keyboard.nextInt();
            System.out.println();
            System.out.print("Masukkan Jumlah Kolom: ");
            n = keyboard.nextInt();
            if (m <= 0) {
                System.out.println();
                System.out.println("Eror");
                System.out.println();
                System.out.println("minimal untuk jumlah baris matriks  adalah 1");
                System.out.println();
                System.out.println("anda harus menginput ulang lagi");
                System.out.println();
                continue firstloop;
            } else if (n <= 0) {
                System.out.println();
                System.out.println("Eror");
                System.out.println();
                System.out.println("minimal untuk jumlah kolom matriks  adalah 1");
                System.out.println();
                System.out.println("anda harus menginput ulang lagi");
                System.out.println();
                continue firstloop;
            } else {
                int[][] A = new int[m][n];
                int[][] B = new int[m][n];

                System.out.println();
                System.out.println("Input Matriks A");
                System.out.println();
                for (c = 0; c < m; c++) {
                    for (d = 0; d < n; d++) {
                        System.out.print("Elemen Matriks A baris ke " + (c + 1) + " kolom ke " + (d + 1) + " : ");
                        A[c][d] = keyboard.nextInt();
                    }
                }
                System.out.println();
                System.out.println("Output Matriks A : ");
                System.out.println();
                System.out.println();
                for (c = 0; c < m; c++) {
                    System.out.println();
                    for (d = 0; d < n; d++) {
                        System.out.print(" " + A[c][d]);
                    }
                }
                System.out.println();
                System.out.println();
                System.out.println("Input Matriks B");
                System.out.println();
                System.out.println();
                for (c = 0; c < m; c++) {
                    for (d = 0; d < n; d++) {
                        System.out.print("Elemen Matriks B baris ke " + (c + 1) + " kolom ke " + (d + 1) + " : ");
                        B[c][d] = keyboard.nextInt();
                    }
                }
                System.out.println();
                System.out.println("Output Matriks B : ");
                System.out.println();
                System.out.println();
                for (c = 0; c < m; c++) {
                    System.out.println();
                    for (d = 0; d < n; d++) {
                        System.out.print(" " + B[c][d]);
                    }
                }
                System.out.println();
                System.out.println();
                Jumlahmatrix mulai2 = new Jumlahmatrix();
                mulai2.cetakmatrix(A, B, m, n);
                System.out.println();

                System.out.println();
                System.out.println();

                break;
            }


        }
        System.out.println();
        System.out.println("=======================================");
        System.out.println();
        System.out.println("nah itu tadi aplikasi penjumlahan matrix");
        System.out.println();
        System.out.println();






    }
}