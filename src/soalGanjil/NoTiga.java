/*
Nama : Danis Keysara Saputra 
NIM  : 2207275
PBO Pendidikan Ilmu Komputer 4A

SOAL 3
Buatlah algoritma dalam bahasa Java, menjumlahkan kode ASCII dari karakter ‘1’ dan
karakter ‘2’!
*/

package soalGanjil;

import java.util.Scanner;

public class NoTiga {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    //Membaca input karakter
    System.out.print("Masukkan karakter pertama: ");
    char karakter1 = scanner.next().charAt(0);

    System.out.print("Masukkan karakter kedua: ");
    char karakter2 = scanner.next().charAt(0);

    //Konversi karakter ke kode ASCII
    int kodeAscii1 = (int) karakter1;
    int kodeAscii2 = (int) karakter2;

    int totalKodeAscii = kodeAscii1 + kodeAscii2;

    //Menampilkan hasil
    System.out.println("Total kode ASCII dari '" + karakter1 + "' dan '" + karakter2 + "' adalah: " + totalKodeAscii);
  }
}