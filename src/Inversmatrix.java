
import java.util.Scanner;

class Inversmatrix {

    static int c, d;
    Scanner keyboard = new Scanner(System.in);

    void invers() {
        System.out.println();
        System.out.println("=============================");
        System.out.println();
        System.out.println("Selamat datang di aplikasi invers matrix");
        System.out.println();
        inverloop:
        while (true) {
            try {
                //Jika memilih A, ordo 2x2
                System.out.println();
                System.out.println("=============================");
                System.out.println();
                System.out.println("Pilih ordo yang anda inginkan:\n1. 2x2 \t 2. 3x3");
                System.out.println();
                System.out.println();
                System.out.print("Ketik '1' atau '2' = ");
                System.out.println();
                System.out.println();
                int ketik = keyboard.nextInt();
                if (ketik == 1) {
                    System.out.print("\n===== Ordo Matriks = 2 x 2 =====");
                    System.out.println();
                    System.out.println("=============================");
                    System.out.println();
                    int[][] MatriksX = new int[2][2];
                    int temp;
                    //Proses memasukkan elemen-elemen matriksnya
                    System.out.println("\nMasukkan elemen-elemen matriksnya : ");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print("Elemen [" + (i + 1) + "," + (j + 1) + "] = ");
                            MatriksX[i][j] = keyboard.nextInt();
                        }
                    }
                    //Proses menampilkan matriks
                    System.out.print("\nBerikut tampilan matriksnya : \n");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print(MatriksX[i][j] + "\t");
                        }
                        System.out.println();
                    }

                    //Proses perhitungan determinan Matriks
                    float dtrm;
                    dtrm = (MatriksX[0][0] * MatriksX[1][1]) - (MatriksX[1][0] * MatriksX[0][1]);
                    if (dtrm == 0) {
                        System.out.println();
                        System.out.println(" ====== Determinan sama dengan 0 jadi tidak bsa dicari inversnya ==========");
                        System.out.println();
                        System.out.println(" silahkan ulang menginput elemen2nya agar determinan !=0 ");
                        System.out.println();
                        continue inverloop;
                    } else {
                        //Proses membentuk adjoin
                        System.out.print("\nInvers Matriks : \n");
                        temp = MatriksX[0][0];
                        MatriksX[0][0] = MatriksX[1][1];
                        MatriksX[1][1] = temp;
                        MatriksX[0][1] = MatriksX[0][1] * -1;
                        MatriksX[1][0] = MatriksX[1][0] * -1;
                        //Proses perhitungan Invers
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 2; j++) {
                                System.out.print(MatriksX[i][j] / dtrm + "\t");
                            }
                            System.out.println();
                        }
                        break;
                    }
                } else if (ketik == 2) {
                    System.out.print("\n===== Ordo Matriks = 3 x 3 =====");
                    System.out.println();
                    System.out.println("=============================");
                    System.out.println();
                    int[][] MatriksY = new int[3][3];
                    //Proses memasukkan elemen-elemen matriksnya
                    System.out.println("\nMasukkan elemen-elemen matriksnya : ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("Elemen [" + (i + 1) + "," + (j + 1) + "] = ");
                            MatriksY[i][j] = keyboard.nextInt();
                        }
                    }

                    //Proses menampilkan matriks
                    System.out.print("\nBerikut tampilan matriksnya : \n");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(MatriksY[i][j] + "\t");
                        }
                        System.out.println();
                    }

                    //Proses perhitungan determinan matriks
                    float dtr;
                    dtr = (MatriksY[0][0] * MatriksY[1][1] * MatriksY[2][2]) + (MatriksY[0][1] * MatriksY[1][2] * MatriksY[2][0]) + (MatriksY[0][2] * MatriksY[1][0] * MatriksY[2][1]) - (MatriksY[2][0] * MatriksY[1][1] * MatriksY[0][2]) - (MatriksY[2][1] * MatriksY[1][2] * MatriksY[0][0]) - (MatriksY[2][2] * MatriksY[1][0] * MatriksY[0][1]);
                    if (dtr == 0) {
                        System.out.println();
                        System.out.println(" ====== Determinan sama dengan 0 jadi tidak bsa dicari inversnya");
                        System.out.println();
                        System.out.println(" silahkan ulang menginput elemen2nya agar determinan !=0 ");
                        System.out.println();
                        continue inverloop;
                    } else {
                        System.out.print("\nInvers Matriks : \n");
                        //Proses Kofaktor
                        int m11, m12, m13, m21, m22, m23, m31, m32, m33;
                        m11 = (MatriksY[1][1] * MatriksY[2][2] - MatriksY[1][2] * MatriksY[2][1]);
                        m12 = -1 * (MatriksY[1][0] * MatriksY[2][2] - MatriksY[1][2] * MatriksY[2][0]);
                        m13 = (MatriksY[1][0] * MatriksY[2][1] - MatriksY[1][1] * MatriksY[2][0]);
                        m21 = -1 * (MatriksY[0][1] * MatriksY[2][2] - MatriksY[0][2] * MatriksY[2][1]);
                        m22 = (MatriksY[0][0] * MatriksY[2][2] - MatriksY[0][2] * MatriksY[2][0]);
                        m23 = -1 * (MatriksY[0][0] * MatriksY[2][1] - MatriksY[0][1] * MatriksY[2][0]);
                        m31 = (MatriksY[0][1] * MatriksY[1][2] - MatriksY[0][2] * MatriksY[1][1]);
                        m32 = -1 * (MatriksY[0][0] * MatriksY[1][2] - MatriksY[0][2] * MatriksY[1][0]);
                        m33 = (MatriksY[0][0] * MatriksY[1][1] - MatriksY[0][1] * MatriksY[1][0]);

                        //Proses Adjoin (Transpose dari Kofaktor)
                        MatriksY[0][0] = m11;
                        MatriksY[0][1] = m21;
                        MatriksY[0][2] = m31;
                        MatriksY[1][0] = m12;
                        MatriksY[1][1] = m22;
                        MatriksY[1][2] = m32;
                        MatriksY[2][0] = m13;
                        MatriksY[2][1] = m23;
                        MatriksY[2][2] = m33;
                        //Proses perhitungan Invers
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.print(MatriksY[i][j] / dtr + "\t");
                            }
                            System.out.println();
                        }
                        break;
                    }
                } else {
                    System.out.println();
                    System.out.println("===========Anda salah memasukan angka===============");

                    System.out.print("anda harus memilih ordo sesuai pilihan yang tersedia");

                    System.out.print("============= Silahkan menginput lagi ==============");
                    continue inverloop;
                }
            } catch (Exception e) {
                System.out.println("Anda salah memasukkan data");
                break;
            }
        }
        System.out.println();
        System.out.println("nah itu tadi aplikasi invers matrix ");
        System.out.println();
    }
}
