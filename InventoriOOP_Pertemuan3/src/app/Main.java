package app;

import java.util.ArrayList;
import java.util.List;
import model.barang;

public class Main {
    public static void main(String[] args) {
       barang keyboard = new barang("BRG-001", "keyboard USB", 10);
       barang mouse = new barang("BRG-002", "Mouse USB", 8);
       
       List<barang> daftarbarang = new ArrayList<barang>();
       daftarbarang.add(keyboard);
       daftarbarang.add(mouse);
       
       System.out.println("DATA AWAL");
       tampilkan(daftarbarang);
       
       keyboard.pinjam(3);
       keyboard.kembalikan(2);
       
       System.out.println("SETELAH TRANSAKSI CONTOH");
       tampilkan(daftarbarang);
       
       try {
    keyboard.pinjam(100);
} catch (Exception e) {
    System.out.println(e.getMessage());
}
System.out.println("Keyboard tersedia: "+ keyboard.getJumlahTersedia());
    }
    
 private static void tampilkan(List<barang> daftarbarang) {
  for (barang barang : daftarbarang) {
        System.out.println(barang.getKode() + " | "
                + barang.getNama() + " | tersedia: "
                + barang.getJumlahTersedia());
    }
}
}
