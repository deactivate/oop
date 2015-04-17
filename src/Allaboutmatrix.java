
import java.util.*;

class Allaboutmatrix {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Masukan 1 jika ingin Penjumlahan Matrix");
        System.out.println(" Masukan 2 jika ingin Pengurangan Matrix");
        System.out.println(" Masukan 3 jika ingin Perkalian Matrix");
        System.out.println(" Masukan 4 jika ingin Determinan Matrix");
        System.out.println(" Masukan 5 jika ingin Invers Matrix");
        System.out.println(" Masukan 6 jika ingin Pembuktian AxB != BxA");
        System.out.println(" Masukan 7 jika ingin Transpose Matrix");
        System.out.println(" Masukan angka selain itu jika ingin exit");
        int masukantombol = keyboard.nextInt();
        switch (masukantombol) {
            case 1:
                Jumlahmatrix mulai = new Jumlahmatrix();
                mulai.inputmatrix();
                break;
            case 2:
                Kurangmatrix km = new Kurangmatrix();
                km.inputmatrix();
                break;
            case 3:
                Kalimatrix ks = new Kalimatrix();
                ks.inputMatrix();
                break;
            case 4:
                Determinanmatrix dm = new Determinanmatrix();
                dm.determinan();
                break;
            case 5:
                Inversmatrix im = new Inversmatrix();
                im.invers();
                break;
            case 6:
                Pembuktianmatrix pm = new Pembuktianmatrix();
                pm.bukti();
                break;
            case 7:
                Transposmatrix tm = new Transposmatrix();
                tm.inputmatrix();
                break;
            default:
                System.out.println(" exit program");

                break;
        }
        System.out.println(" Thank you");
        System.out.println(" by : Andrianto Saputra");
        System.out.println(" class 2ks2");
        System.out.println(" 13.7492");
    }
}
