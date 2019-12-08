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
public interface ICrud {
    public int insertQueryGetId();
    public boolean executeQuery() ;
    public ResultSet selectQuery();
}
