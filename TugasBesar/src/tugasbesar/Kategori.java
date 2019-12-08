/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import java.util.ArrayList;
import java.sql.*;
import javax.naming.spi.DirStateFactory.Result;

/**
 *
 * @author user
 */
public class Kategori {
    public String nama;
    public int idkat;
    
    Kategori(){
        
    }
    Kategori(int idkat, String nama){
        this.idkat = idkat;
        this.nama = nama;
    }

    public int getId() {
        return idkat;
    }

    public void setId(int id) {
        this.idkat = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public Kategori getById(int id) {
        Kategori kat = new Kategori();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kategori " 
                                            + " WHERE idkat = '" + id + "'");
        
        try {
            while(rs.next()) {
                kat = new Kategori();
                kat.setId(rs.getInt("idkat"));
                kat.setNama(rs.getString("nama"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return kat;
    }   
    
    public ArrayList<Kategori> getAll() {
        ArrayList<Kategori> ListKategori = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kategori");
        
        try {
            while(rs.next()) {
                Kategori kat = new Kategori();
                kat.setId(rs.getInt("idkat"));
                kat.setNama(rs.getString("nama"));
                
                ListKategori.add(kat);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListKategori;
    }
    
    public ArrayList<Kategori> search(String keyword) {
        ArrayList<Kategori> ListKategori = new ArrayList();
        
        String sql = "SELECT * FROM kategori WHERE "
                    + "     nama LIKE '%" + keyword + "%' "
                    + "     OR keterangan LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try {
            while(rs.next()) {
                Kategori kat = new Kategori();
                kat.setId(rs.getInt("idkat"));
                kat.setNama(rs.getString("nama"));
                
                ListKategori.add(kat);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListKategori;
    }
    
    public void save() {
        if(getById(idkat).getId() == 0) {
            String SQL = "INSERT INTO kategori (nama) VALUES("
                    + "     '" + this.nama + "', "
                    + "     )";
            this.idkat = DBHelper.insertQueryGetId(SQL);
        }
        else {
            String SQL = "UPDATE kategori SET "
                    + "     nama = '" + this.nama + "', "
                    + "     WHERE idkat = '" + this.idkat + "' ";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete() {
        String SQL = "DELETE FROM kategori WHERE id = '" + this.idkat + "'";
        DBHelper.executeQuery(SQL);
    }
    
    public String toString() {
        return nama;
    }
    
}
