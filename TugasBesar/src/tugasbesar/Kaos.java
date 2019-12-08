/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class Kaos extends Kategori{
    private String id, nama, merk, warna, ukuran, harga, stok;
    
    Kaos(){
        
    } 
    Kaos(String nama, String merk, String warna, String ukuran, String harga, String stok){
        this.nama = nama;
        this.merk = merk;
        this.warna = warna;
        this.ukuran = ukuran;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public void info(){
        System.out.printf("Merk = %s\n", merk);
        System.out.printf("Warna = %s\n", warna);
        System.out.printf("Ukuran = %s\n", ukuran);
        System.out.printf("Harga= %s\n", harga);
        System.out.printf("Stok= %s\n", stok);
    }    
}
