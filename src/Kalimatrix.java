
import java.util.Scanner;

class Kalimatrix {

    static int c, d;
    Scanner keyboard = new Scanner(System.in);

    static int[][] perkalianMatrix(int[][] matrixC, int[][] matrixD) {
        int hasil[][] = new int[matrixC.length][matrixD[0].length];
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[0].length; j++) {
                for (int k = 0; k < matrixC[0].length; k++) {
                    hasil[i][j] += matrixC[i][k] * matrixD[k][j];
                }
            }
        }
        return (hasil);
    }

    void cetakHasil(int[][] matrixE, int matriks3[][], char p) {
        for (int i = 0; i < matrixE.length; i++) {
            for (int j = 0; j < matriks3[0].length; j++) {
                System.out.print("  " + matriks3[i][j]);
            }
            System.out.println();
        }
    }

    void inputMatrix() {
        System.out.println();
        System.out.println("=============================");
        System.out.println();
        System.out.println();
        System.out.println("Selamat datang di aplikasi perkalian matrix");
        System.out.println();
        System.out.println("karena syarat perkalian matrix adalah ");
        System.out.println();
        System.out.println("jumlah kolom matrix A = jumlah baris matrix B");
        System.out.println();
        System.out.println();
        System.out.println();
        loop:
        while (true) {

            //Proses input jumlah baris dan kolom
            System.out.println();
            System.out.print("Masukkan jumlah baris Matriks A = ");
            int barisA = keyboard.nextInt();
            System.out.println();
            System.out.print("Masukkan jumlah kolom Matriks A = ");
            int kolomA = keyboard.nextInt();
            System.out.println();
            System.out.print("Masukkan jumlah baris Matriks B = ");
            int barisB = keyboard.nextInt();
            System.out.println();
            System.out.print("Masukkan jumlah kolom Matriks B = ");
            int kolomB = keyboard.nextInt();
            System.out.println();
            System.out.println();
            if (barisA <= 0) {
                System.out.println();
                System.out.print("Eror");
                System.out.println();
                System.out.println("minimal untuk jumlah baris A adalah 1");
                System.out.println();
                System.out.println("anda harus menginput ulang lagi");
                System.out.println();
                System.out.println("=============================");
                System.out.println();
                continue loop;
            } else if (kolomA <= 0) {
                System.out.println();
                System.out.print("Eror");
                System.out.println();
                System.out.println("minimal untuk jumlah kolom A adalah 1");
                System.out.println();
                System.out.println("anda harus menginput ulang lagi");
                System.out.println();
                System.out.println();
                System.out.println("=============================");
                System.out.println();
                continue loop;
            } else if (barisB <= 0) {
                System.out.println();
                System.out.println("Eror");
                System.out.println();
                System.out.println("minimal untuk jumlah baris B adalah 1");
                System.out.println();
                System.out.println("anda harus menginput ulang lagi");
                System.out.println();
                System.out.println();
                System.out.println("=============================");
                System.out.println();
                continue loop;
            } else if (kolomB <= 0) {
                System.out.println();
                System.out.println("Eror");
                System.out.println();
                System.out.println("minimal untuk jumlah kolom B adalah 1");
                System.out.println();
                System.out.println("anda harus menginput ulang lagi");
                System.out.println();
                System.out.println();
                System.out.println("=============================");
                System.out.println();
                continue loop;
            } else {
                if (kolomA == barisB) {
                    System.out.println();
                    System.out.println("=============================");
                    System.out.println();
                    System.out.println("Anda telah memenuhi syarat perkalian matriks");
                    System.out.println();
                    System.out.println("yaitu jumlah kolom matriks A dan jumlah baris B sama");
                    System.out.println();
                    System.out.println("Anda memasuki tahap selanjutnya untuk menginput elemen2 matriksnya ");
                    System.out.println();
                    System.out.println();
                    System.out.println("=============================");
                    System.out.println();
                    try {
                        //Proses menginput nilai matriks
                        int[][] matrixA = new int[barisA][kolomA];
                        int[][] matrixB = new int[barisB][kolomB];
                        System.out.println();
                        System.out.println("Input Matriks A");
                        System.out.println();
                        for (c = 0; c < barisA; c++) {
                            for (d = 0; d < kolomA; d++) {
                                System.out.print("Elemen Matriks A baris ke " + (c + 1) + " kolom ke " + (d + 1) + " : ");
                                matrixA[c][d] = keyboard.nextInt();
                            }
                        }
                        System.out.println();
                        System.out.println("Output Matriks A : ");
                        System.out.println();
                        for (c = 0; c < barisA; c++) {
                            System.out.println();
                            for (d = 0; d < kolomA; d++) {
                                System.out.print(" " + matrixA[c][d]);
                            }
                        }
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println("Input Matriks B");
                        System.out.println();
                        for (c = 0; c < barisB; c++) {
                            for (d = 0; d < kolomB; d++) {
                                System.out.print("Elemen Matriks B baris ke " + (c + 1) + " kolom ke " + (d + 1) + " : ");
                                matrixB[c][d] = keyboard.nextInt();
                            }
                        }
                        System.out.println();
                        System.out.println("Output Matriks B : ");
                        System.out.println();
                        for (c = 0; c < barisB; c++) {
                            System.out.println();
                            for (d = 0; d < kolomB; d++) {
                                System.out.print(" " + matrixB[c][d]);
                            }
                        }
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println("=======================================");
                        System.out.println("=======================================");
                        System.out.println("=======================================");
                        System.out.println("=======================================");
                        System.out.println("=======================================");
                        System.out.println("=======================================");
                        System.out.println();
                        System.out.println();
                        System.out.println("Hasil Kali Matriks A dengan matriks B : ");
                        System.out.println();
                        Kalimatrix ks2 = new Kalimatrix();
                        int[][] hasill = ks2.perkalianMatrix(matrixA, matrixB);
                        ks2.cetakHasil(matrixA, hasill, '*');
                        System.out.println();
                        System.out.println();
                        System.out.println("=============================");
                        System.out.println();
                    } catch (Exception e) {
                        System.out.println("some error occured");
                        System.out.println();
                        System.out.println("=============================");
                        System.out.println();
                    }
                    break;
                } else {
                    System.out.println();
                    System.out.println("=============================");
                    System.out.println();
                    System.out.println("Tidak dapat melakukan perkalian");
                    System.out.println();
                    System.out.println("	jumlah kolom A != jumlah baris B");
                    System.out.println();
                    System.out.println("Anda harus menginput ulang ");
                    System.out.println();
                    continue loop;
                }
            }
        }
        System.out.println();
        System.out.println("nah itu tadi aplikasi perkalian matrix");
        System.out.println();

        System.out.println();

    }
}
