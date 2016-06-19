 package tambahkurangkalibagi;

import java.util.Scanner;



public class TambahKurangKaliBagi {

    public static void main(String[] args) {
        int nilai1 = 0, nilai2 = 0;
        int kali, bagi, tambah, kurang, rata;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai yang ingin dioperasikan!!!");
        System.out.print("Masukan Nilai 1 : ");
        nilai1 = input.nextInt(); // Untuk menginputkan nilai dari nilai1
        System.out.print("Masukan Nilai 2 : ");
        nilai2 = input.nextInt(); // Untuk menginputkan nilai dari nilai2

        kali = nilai1 * nilai2; // Mengalikan dua nilai yaitu nilai1 dikalikan dengan nilai2
        bagi = nilai1 / nilai2; // Mengalikan dua nilai yaitu nilai1 dibagikan dengan nilai2
        tambah = nilai1 + nilai2; // Mengalikan dua nilai yaitu nilai1 ditambahkan dengan nilai2
        kurang = nilai1 - nilai2; // Mengalikan dua nilai yaitu nilai1 dikurangkan dengan nilai2
        rata = ((nilai1*nilai2) + (nilai1/nilai2) + (nilai1+nilai2) + (nilai1-nilai2)) / 4; // Menjumlahkan semua hasil dari penghitungan sebelumnya dan dibagi dengan 4

        System.out.println("Hasil Kali = " + kali); // Menampilkan hasil kali dari nilai1 dan nilai2
        System.out.println("Hasil Bagi = " + bagi); // Menampilkan hasil bagi dari nilai1 dan nilai2
        System.out.println("Hasil Tambah = " + tambah); // Menampilkan hasil tambah dari nilai1 dan nilai2
        System.out.println("Hasil Kurang = " + kurang); // Menampilkan hasil kurang dari nilai1 dan nilai2
        System.out.println("Hasil Rata-Rata = " + rata); // Menampilkan hasil rata-rata hasil dari pengalian, pembagian, penambahan dan pengurangan kemudian dibagi 4
    }
}
