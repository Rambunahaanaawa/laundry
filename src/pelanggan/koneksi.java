/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelanggan;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Rambu Naha
 */
public class koneksi {
    Connection Koneksi = null;

    public static Connection koneksiDb() 
    {
        try{
            String url="jdbc:mysql://localhost/laundry"; 
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");    
            Connection koneksi=DriverManager.getConnection(url,user,pass);  
            return koneksi;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e); 
            return null;
        }
    }
}
