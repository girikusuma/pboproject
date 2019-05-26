/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Giri Kusuma
 */
public class Koneksi {
     public static Connection koneksi;
    
    public static Connection getKoneksi(){
        if(koneksi==null){
            try{
                String url = new String();
                String user = new String();
                String password = new String();

                url = "jdbc:mysql://localhost:3306/projectpbo1";
                user = "root";
                password = "";

                DriverManager.registerDriver(new com.mysql.jdbc.Driver());

                koneksi = (Connection) DriverManager.getConnection(url,user,password);
            } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
            }
        }
        return koneksi;
    }
    
    public static void main (String[] args){
        try{
            getKoneksi();
            JOptionPane.showMessageDialog(null, "koneksi berhasil");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "koneksi gagal");
        }
    }
}
