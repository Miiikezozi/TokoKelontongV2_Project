/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author A S U S
 */
public class Koneksi {
    private static Connection MySQLConfig;
    public static Connection configDB(){
        try{
            String url="jdbc:mysql://localhost:3306/toko_kelontong";//url database 
            String user="root";//user database
            String pass="";//password database
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig=(Connection) DriverManager.getConnection(url, user, pass);
            
        }catch(SQLException e){
            System.err.println("koneksi gagal "+e.getMessage());//perintah menampilkan error pada koneksi
        }
        return MySQLConfig;
    }
}
