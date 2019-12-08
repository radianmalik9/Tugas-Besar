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
public abstract class Barang implements ICrud{
    int result;
    boolean result1;
    ResultSet rs;
    public int insertQueryGetId(){
        return result;
    }
    public boolean executeQuery(){
        return result1;
    }
    public ResultSet selectQuery(){
        return rs;
    }
}
