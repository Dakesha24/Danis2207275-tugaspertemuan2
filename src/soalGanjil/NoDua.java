/*
Nama : Danis Keysara Saputra 
NIM  : 2207275
PBO Pendidikan Ilmu Komputer 4A

SOAL 2
Buatlah algoritma dalam Bahasa Java Anda akan keluar membeli gorengan jika
mempunyai uang lebih besar dari 5000 (rupiah) dan hari tidak hujan, yang dapat ditulis
sebagai ekspresi: (uang > 5000) && (!hujan)
*/

package soalGanjil;

import java.util.Scanner;

public class NoDua {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Meminta jumlah uang yang dimiliki dan kondisi cuaca
    System.out.print("Masukkan jumlah uang (dalam rupiah): ");
    int uang = scanner.nextInt();

    System.out.print("Apakah hari ini hujan? (ya/tidak): ");
    String cuacaInput = scanner.next();

    // Mengubah input cuaca menjadi boolean
    boolean hujan = cuacaInput.equalsIgnoreCase("ya");

    if (uang > 5000 && !hujan) {
      //Output jika uang cukup dan tidak hujan
      System.out.println("Anda bisa membeli gorengan hari ini!");
    } else {
      if (uang <= 5000 && hujan) {
        System.out.println("Maaf, Anda tidak bisa membeli gorengan hari ini karena uang Anda tidak cukup dan cuaca hujan.");
      } else if (uang <= 5000) {
        System.out.println("Maaf, Anda tidak bisa membeli gorengan hari ini karena uang Anda tidak cukup.");
      } else if (hujan) {
        System.out.println("Maaf, Anda tidak bisa membeli gorengan hari ini karena cuaca hujan.");
      } else {
        System.out.println("Maaf, terdapat kesalahan, coba lagi.");
      }
    }
  }
}
