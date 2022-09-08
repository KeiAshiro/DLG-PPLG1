import java.util.*;
public class iyah {

  public Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      
    System.out.println("1.Hitung Keliling Persegi");
    System.out.println("2.Menentukan Ganjil Genap Suatu Bilangan");
      int pilihan = scanner.nextInt();
     

      //System.out.println("");

      // System.out.println("Diameter: " + diameter);
      // System.out.println("Jari-jari: " + r);
      // System.out.println("Luas Lingkaran: " + pi*r*r);
      // System.out.println("keliling Lingkaran: " + pi*diameter);
    }

    private void Keliling_persegi() {
      final int sisi_persegi = (int) 4;

      System.out.println("\nMencari Keliling Persegi");

      System.out.print("Masukan panjang sisi: "); 
      float sisi = scanner.nextFloat();

      float hasil_persegi = sisi_persegi* sisi;

      System.out.println("Keliling persegi tersebut adalah: " + hasil_persegi);
    }

  }