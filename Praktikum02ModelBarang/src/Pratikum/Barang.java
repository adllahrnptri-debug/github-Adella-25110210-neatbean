package Pratikum;

public class Barang {

    private String kode;
    private String nama;
    private int stok;
    private String keterangan;
    
    public Barang(String kode, String nama, int stok, String keterangan) {
        setkode(kode);
        setnama(nama);
        setstok(stok);
        Setketerangan(keterangan);
    }
    
    public String getKode (){
        return kode;
    }
    public void setKode(String kode){
        if (kode == null || kode.trim().isEmpty()){
            throw new IllegalArgumentException("kode barang tidak boleh kosong.");
        }
        this.kode = kode.trim();
    }
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        if (nama == null || nama.trim().isEmpty()){
            throw new IllegalArgumentException("Nama barang tidak boleh kosong.");
        }
        this.nama = nama.trim();
    }
    
    public int getStok(){
        return stok;
    }
    
    public void setStok(int stok){
        if(stok < 0){
            throw new IllegalArgumentException("Stok tidak boleh.");
        }
        this.stok = stok;
    }
    
    public String getKeterangan(){
        return keterangan;
    }
    
    public void setKeterangan(String keternagan){
        this.keterangan = 
                keterangan == null? "" : keterangan.trim();
    }
    
     public String tampilkanInfo() {
        return kode + " | " + nama
                + " | Stok: " + stok
                + " | " + keterangan;
    }
}
