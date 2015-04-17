
import java.util.Scanner;

class Transposmatrix {

    static int c, d;
    Scanner keyboard = new Scanner(System.in);

    static int[][] transposeMatrix(int[][] m) {
        int[][] hasilll = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                hasilll[j][i] = m[i][j];
            }
        }
        return hasilll;
    }

    void cetakHasiltranspose(int[][] matrixE, int matriks3[][], char p) {
        for (int i = 0; i < matrixE.length; i++) {
            for (int j = 0; j < matriks3[0].length; j++) {
                System.out.print("  " + matriks3[i][j]);
            }
            System.out.println();
        }
    }

    void inputmatrix() {
        System.out.println();
        System.out.println("=============================");
        System.out.println();
        System.out.println();
        System.out.println("Selamat datang di aplikasi transpose matrix");
        System.out.println();
        System.out.println("====================");
        System.out.println();
        System.out.println();
        transloop:
        while (true) {
            System.out.print("\nEnter jumlah baris : ");
            int r = keyboard.nextInt();
            System.out.print("\nEnter jumlah kolom: ");
            int w = keyboard.nextInt();
            int[][] matrix = new int[r][w];
            if (r <= 0) {
                System.out.println();
                System.out.println("Eror");
                System.out.println();
                System.out.println("minimal untuk jumlah baris matriks  adalah 1");
                System.out.println();
                System.out.println("anda harus menginput ulang lagi");
                System.out.println();
                continue transloop;
            } else if (w <= 0) {
                System.out.println();
                System.out.println("Eror");
                System.out.println();
                System.out.println("minimal untuk jumlah kolom matriks  adalah 1");
                System.out.println();
                System.out.println("anda harus menginput ulang lagi");
                System.out.println();
                continue transloop;
            } else {
                System.out.println("\nEnter  elemen-elemen matrix : ");
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < w; j++) {
                        System.out.print("Elemen Matriks  baris ke " + (i + 1) + " kolom ke " + (j + 1) + " : ");
                        matrix[i][j] = keyboard.nextInt();
                    }
                }
                System.out.println("\n Matrixnyaa\n");
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < w; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.print("\n");
                }
                System.out.println();
                System.out.println();
                System.out.println(" Matriks Transposenya adalah ");
                System.out.println();
                System.out.println();
                Transposmatrix ks = new Transposmatrix();
                int matrixHasil[][] = ks.transposeMatrix(matrix);
                System.out.println();
                ks.cetakHasiltranspose(matrixHasil, matrixHasil, '*');
                break;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("nah itu tadi aplikasi transpose matrix");
        System.out.println();
    }
}