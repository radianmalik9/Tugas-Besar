/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

/**
 *
 * @author user
 */
public class Baju extends Pakaian{
    private String merk, warna, ukuran, harga;
    private Bahan bhn;
    
    Baju(){
        
    } 
    Baju(String merk, String warna, String ukuran, Bahan bhn, String harga){
        this.merk = merk;
        this.warna = warna;
        this.ukuran = ukuran;
        this.bhn = bhn;
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public Bahan getBhn() {
        return bhn;
    }

    public void setBhn(Bahan bhn) {
        this.bhn = bhn;
    }
    public void info(){
        System.out.printf("Merk = %s\n", merk);
        System.out.printf("Warna = %s\n", warna);
        System.out.printf("Ukuran = %s\n", ukuran);
        bhn.info();
        System.out.printf("Harga= %s\n", harga);
    }

    @Override
    public void tambahData() {
        System.out.println("Data Berhasil ditambahkan");
    }

    @Override
    public void hapusData() {
        System.out.println("Data Berhasil dihapus");
    }

    @Override
    public void cariData() {
        System.out.println("Data ditemukan");
    }

    @Override
    public void ubahData() {
        System.out.println("Data telah diubah");
    }
}
