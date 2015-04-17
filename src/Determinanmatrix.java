
import java.util.Scanner;

class Determinanmatrix {

    static int c, d;
    Scanner keyboard = new Scanner(System.in);

    void determinan() {
        System.out.println();
        System.out.println("=============================");
        System.out.println();
        System.out.println();
        System.out.println("Selamat datang di aplikasi determinan matrix");
        System.out.println();
        System.out.println("====================");
        System.out.println();
        System.out.println();
        deterloop:
        while (true) {
            try {
                //Proses pemilihan ordo 2x2 atau 3x3 oleh user
                System.out.println("Pilih ordo yang anda inginkan:\n1. 2x2 \t 2. 3x3");
                System.out.print("Ketik '1' atau '2' = ");
                int ketik = keyboard.nextInt();
                //Jika memilih A, ordo 2x2
                if (ketik == 1) {
                    System.out.print("\n===== Ordo Matriks = 2 x 2 =====");
                    int[][] X = new int[2][2];
                    int temp;
                    //Proses memasukkan elemen-elemen matriksnya
                    System.out.println("\nMasukkan elemen-elemen matriksnya : ");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print("Elemen Matriks X baris ke" + (i + 1) + "kolom ke " + (j + 1) + " : ");
                            X[i][j] = keyboard.nextInt();
                        }
                    }
                    //Proses menampilkan matriks
                    System.out.println();
                    System.out.println("Output Matriks X : ");
                    System.out.println();
                    System.out.println();
                    for (c = 0; c < 2; c++) {
                        System.out.println();
                        for (d = 0; d < 2; d++) {
                            System.out.print(" " + X[c][d]);
                        }
                    }
                    System.out.println();
                    System.out.println();
                    //Proses perhitungan determinan Matriks         
                    float dtrm = (X[0][0] * X[1][1]) - (X[1][0] * X[0][1]);
                    //Proses menampilkan determinan Matriks
                    System.out.println();
                    System.out.println();

                    System.out.println("\nMaka, determinan = " + dtrm);
                    System.out.println();
                    System.out.println();
                    break;
                } else if (ketik == 2) {
                    System.out.print("\n===== Ordo Matriks = 3 x 3 =====");
                    int[][] Y = new int[3][3];
                    //Proses memasukkan elemen-elemen matriksnya
                    System.out.println("\nMasukkan elemen-elemen matriks Y  : ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("Elemen Matriks Y baris ke " + (i + 1) + " kolom ke " + (j + 1) + " : ");
                            Y[i][j] = keyboard.nextInt();
                        }
                    }
                    //Proses menampilkan matriks
                    System.out.print("\nBerikut tampilan matriksnya : \n");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(Y[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    //Proses perhitungan determinan matriks
                    float dtr;
                    dtr = (Y[0][0] * Y[1][1] * Y[2][2]) + (Y[0][1] * Y[1][2] * Y[2][0]) + (Y[0][2] * Y[1][0] * Y[2][1]) - (Y[2][0] * Y[1][1] * Y[0][2]) - (Y[2][1] * Y[1][2] * Y[0][0]) - (Y[2][2] * Y[1][0] * Y[0][1]);
                    //Proses menampilkan determinan matriks
                    System.out.println("\nMaka, determinan = " + dtr);
                    break;
                } else {
                    System.out.println();
                    System.out.println("anda salah memasukan angka");
                    System.out.println();
                    System.out.print("anda harus memilih ordo sesuai pilihan yang tersedia");
                    System.out.println();
                    continue deterloop;
                }
            } catch (Exception e) {
                System.out.println("Anda salah memasukkan data");
                break;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("nah itu tadi aplikasi determinan matrix");
        System.out.println();
    }
}