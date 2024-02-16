/*
Nama : Danis Keysara Saputra 
NIM  : 2207275
PBO Pendidikan Ilmu Komputer 4A

SOAL 1
Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah masukan
bilangan bulat dan menampilkan hasil operasi (+,-,*,/) ketiga bilangan!
*/

package soalGanjil;

import java.util.Scanner;

public class NoSatu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Deklarasikan variabel
        int a, b, c;
        char operasi;
        int hasil;

        //Meminta pengguna menginput tiga bilangan bulat
        System.out.print("Bilangan bulat pertama: ");
        a = scanner.nextInt();
        System.out.print("Bilangan bulat kedua: ");
        b = scanner.nextInt();
        System.out.print("Bilangan bulat ketiga: ");
        c = scanner.nextInt();

        //Meminta pengguna memilih jenis operasi
        System.out.println("Pilih jenis operasi (+,-,*,/): ");
        operasi = scanner.next().charAt(0);

        //Proses, dengan operasi sesuai dengan input pengguna
        switch (operasi) {
            case '+' -> hasil=a+b+c;
            case '-' -> hasil=a-b-c;
            case '*' -> hasil=a*b*c;
            case '/' -> hasil=a/b/c;
            default -> {
                System.out.println("Masukkan operasi yag valid!");
                return;
            }
        }
        //Print hasil
        System.out.println("Hasil operasi: " + hasil);
    }
}