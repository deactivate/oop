
import java.util.Scanner;

class Pembuktianmatrix {

    static int c, d;
    Scanner keyboard = new Scanner(System.in);

    void bukti() {
        System.out.println();
        System.out.println("=============================");
        System.out.println();
        System.out.println("Selamat datang di aplikasi pembuktian matrix ");
        System.out.println();
        System.out.println(" ini dilakukan hanya pada matrix persegi");
        System.out.println();
        System.out.println("  yaitu pembuktian AxB != BxA ");
        System.out.println();
        System.out.println("  karena ini matrix persegi ");
        System.out.println();
        System.out.println("  jumlah baris dan kolomnya sama ");
        System.out.println();
        approloop:
        while (true) {
            //Proses input jumlah baris dan kolom
            System.out.println();
            System.out.print("Masukkan ingin berapa NxN matrix = ");
            int barin = keyboard.nextInt();
            System.out.println();
            System.out.println();
            System.out.println();
            if (barin <= 0) {
                System.out.println();
                System.out.println("Eror");
                System.out.println();
                System.out.println("minimal untuk jumlah baris dan kolom kedua matrix adalah 1");
                System.out.println();
                System.out.println("anda harus menginput ulang lagi");
                System.out.println();
                continue approloop;
            } else {
                System.out.println();
                System.out.println("=============================");
                System.out.println();
                System.out.println("Anda telah memenuhi syarat matriks persegi");
                System.out.println();
                System.out.println();
                System.out.println("Anda memasuki tahap selanjutnya untuk menginput elemen2 matriksnya ");
                System.out.println();
                System.out.println();
                System.out.println("=============================");
                System.out.println();
                try {
                    //Proses menginput nilai matriks
                    int[][] matrixA = new int[barin][barin];
                    int[][] matrixB = new int[barin][barin];
                    System.out.println();
                    System.out.println("Input Matriks A");
                    System.out.println();
                    for (c = 0; c < barin; c++) {
                        for (d = 0; d < barin; d++) {
                            System.out.print("Elemen Matriks A baris ke " + (c + 1) + " kolom ke " + (d + 1) + " : ");
                            matrixA[c][d] = keyboard.nextInt();
                        }
                    }
                    System.out.println();
                    System.out.println("Output Matriks A : ");
                    System.out.println();
                    for (c = 0; c < barin; c++) {
                        System.out.println();
                        for (d = 0; d < barin; d++) {
                            System.out.print(" " + matrixA[c][d]);
                        }
                    }
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Input Matriks B");
                    System.out.println();
                    for (c = 0; c < barin; c++) {
                        for (d = 0; d < barin; d++) {
                            System.out.print("Elemen Matriks B baris ke " + (c + 1) + " kolom ke " + (d + 1) + " : ");
                            matrixB[c][d] = keyboard.nextInt();
                        }
                    }
                    System.out.println();
                    System.out.println("Output Matriks B : ");
                    System.out.println();
                    for (c = 0; c < barin; c++) {
                        System.out.println();
                        for (d = 0; d < barin; d++) {
                            System.out.print(" " + matrixB[c][d]);
                        }
                    }

                    System.out.println();
                    System.out.println();
                    System.out.println("Hasil AxB : ");
                    System.out.println();
                    Kalimatrix ks2 = new Kalimatrix();
                    int[][] hasill = ks2.perkalianMatrix(matrixA, matrixB);
                    ks2.cetakHasil(matrixA, hasill, '*');
                    System.out.println();
                    System.out.println(" sedangkan ");
                    System.out.println("=============================");
                    System.out.println();
                    System.out.println("Hasil  BxA : ");
                    System.out.println();

                    int[][] hasill2 = ks2.perkalianMatrix(matrixB, matrixA);
                    ks2.cetakHasil(matrixB, hasill2, '*');
                    System.out.println();
                    System.out.println("=============================");
                    System.out.println();
                    System.out.println(" Nah terbukti bahwa AxB != BxA ");
                    System.out.println("  ");
                    System.out.println(" terkecuali ");
                    System.out.println(" Kalau yang muncul AxB = BxA berarti anda memasukan matrix yg sama");
                    System.out.println("  ");
                    System.out.println("  ");
                    System.out.println("=============================");
                    System.out.println();
                } catch (Exception e) {
                    System.out.println("some error occured");
                    System.out.println();
                    System.out.println("=============================");
                    System.out.println();
                }
                break;
            }
        }
        System.out.println();
        System.out.println("nah itu tadi aplikasi pembuktian matrix AxB != BxA ");
        System.out.println();
    }
}
