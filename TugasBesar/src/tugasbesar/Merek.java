/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Merek {
    public int id;
    public String nama;
    
    Merek(){
        
    }
    Merek(int id, String nama){
        this.id = id;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public Merek getById(int id) {
        Merek m = new Merek();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM Merek " 
                                            + " WHERE idmerk = '" + id + "'");
        
        try {
            while(rs.next()) {
                m = new Merek();
                m.setId(rs.getInt("idmerk"));
                m.setNama(rs.getString("nama"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return m;
    }   
    
    public ArrayList<Merek> getAll() {
        ArrayList<Merek> ListMerek = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM merek");
        
        try {
            while(rs.next()) {
                Merek m = new Merek();
                m.setId(rs.getInt("idmerek"));
                m.setNama(rs.getString("nama"));
                
                ListMerek.add(m);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListMerek;
    }
    
    public ArrayList<Merek> search(String keyword) {
        ArrayList<Merek> ListMerek = new ArrayList();
        
        String sql = "SELECT * FROM merek WHERE "
                    + "     nama LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try {
            while(rs.next()) {
                Merek m = new Merek();
                m.setId(rs.getInt("idmerek"));
                m.setNama(rs.getString("nama"));
                
                ListMerek.add(m);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListMerek;
    }
    
    public void save() {
        if(getById(id).getId() == 0) {
            String SQL = "INSERT INTO merek (nama) VALUES("
                    + "     '" + this.nama + "', "
                    + "     )";
            this.id = DBHelper.insertQueryGetId(SQL);
        }
        else {
            String SQL = "UPDATE merek SET "
                    + "     nama = '" + this.nama + "', "
                    + "     WHERE idmerek = '" + this.id + "' ";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete() {
        String SQL = "DELETE FROM merek WHERE id = '" + this.id + "'";
        DBHelper.executeQuery(SQL);
    }
    
    public String toString() {
        return nama;
    }
}
